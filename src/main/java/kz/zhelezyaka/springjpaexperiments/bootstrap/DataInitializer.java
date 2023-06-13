package kz.zhelezyaka.springjpaexperiments.bootstrap;

import kz.zhelezyaka.springjpaexperiments.domain.AuthorUuid;
import kz.zhelezyaka.springjpaexperiments.domain.Book;
import kz.zhelezyaka.springjpaexperiments.domain.BookUuid;
import kz.zhelezyaka.springjpaexperiments.repositories.AuthorUUIDRepository;
import kz.zhelezyaka.springjpaexperiments.repositories.BookRepository;
import kz.zhelezyaka.springjpaexperiments.repositories.BookUuidRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"local", "default"})
@Component
public class DataInitializer implements CommandLineRunner {
    private final BookRepository bookRepository;
    private final AuthorUUIDRepository authorUUIDRepository;
    private final BookUuidRepository bookUuidRepository;

    public DataInitializer(BookRepository bookRepository, AuthorUUIDRepository authorUUIDRepository, BookUuidRepository bookUuidRepository) {
        this.bookRepository = bookRepository;
        this.authorUUIDRepository = authorUUIDRepository;
        this.bookUuidRepository = bookUuidRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        bookRepository.deleteAll();
        authorUUIDRepository.deleteAll();

        Book book1 = new Book(1L,
                "NGINX Cookbook",
                "231242w234",
                "O'REILLY", null);
        Book savedBook1 = bookRepository.save(book1);

        Book book2 = new Book(2L,
                "Principles of Web API Design",
                "23898237688",
                "HarperCollins", null);
        Book savedBook2 = bookRepository.save(book2);

        Book book3 = new Book(3L,
                "Efficient Linux at the Command Line",
                "239462938462",
                "Wiley", null);
        Book savedBook3 = bookRepository.save(book3);

        bookRepository.findAll().forEach(book -> {
            System.out.println("Book id: " + book.getId() + " |" +
                    "Book title: " + book.getTitle() + " |" +
                    "Book isbn: " + book.getIsbn() + " |" +
                    "Book publisher: " + book.getPublisher());
        });

        AuthorUuid authorUUID = new AuthorUuid();
        authorUUID.setFirstName("Vladimir");
        authorUUID.setLastName("Glinskikh");
        AuthorUuid savedAuthor = authorUUIDRepository.save(authorUUID);
        System.out.println("Saved Author UUID: " + savedAuthor.getId());

        BookUuid bookUuid = new BookUuid();
        bookUuid.setTitle("All About UUIDs");
        BookUuid savedBookUuid = bookUuidRepository.save(bookUuid);
        System.out.println("Saved Book UUID: " + savedBookUuid.getId());
    }
}
