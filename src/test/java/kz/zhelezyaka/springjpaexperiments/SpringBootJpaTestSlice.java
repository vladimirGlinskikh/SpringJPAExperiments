package kz.zhelezyaka.springjpaexperiments;

import kz.zhelezyaka.springjpaexperiments.domain.Book;
import kz.zhelezyaka.springjpaexperiments.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class SpringBootJpaTestSlice {

    @Autowired
    BookRepository bookRepository;

    @Test
    void testJpaTestSplice() {
        long countBefore = bookRepository.count();
        bookRepository.save(new Book(4L, "Effective Java", "234298509", "Wesley"));
        long countAfter = bookRepository.count();
        assertThat(countBefore).isLessThan(countAfter);
    }
}
