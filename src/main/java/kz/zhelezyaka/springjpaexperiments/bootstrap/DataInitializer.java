package kz.zhelezyaka.springjpaexperiments.bootstrap;

import kz.zhelezyaka.springjpaexperiments.domain.Book;
import kz.zhelezyaka.springjpaexperiments.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book book1 = new Book(1L,
                "NGINX Cookbook",
                "231242w234",
                "O'REILLY");
        Book savedBook1 = bookRepository.save(book1);

        Book book2 = new Book(2L,
                "Principles of Web API Design",
                "23898237688",
                "HarperCollins");
        Book savedBook2 = bookRepository.save(book2);

        Book book3 = new Book(3L,
                "Efficient Linux at the Command Line",
                "239462938462",
                "Wiley");
        Book savedBook3 = bookRepository.save(book3);

        bookRepository.findAll().forEach(book -> {
            System.out.println("Book id: " + book.getId() + " |" +
                    "Book title: " + book.getTitle() + " |" +
                    "Book isbn: " + book.getIsbn() + " |" +
                    "Book publisher: " + book.getPublisher());
        });
    }
}
