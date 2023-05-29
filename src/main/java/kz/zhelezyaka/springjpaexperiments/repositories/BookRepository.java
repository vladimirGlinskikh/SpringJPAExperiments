package kz.zhelezyaka.springjpaexperiments.repositories;

import kz.zhelezyaka.springjpaexperiments.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
