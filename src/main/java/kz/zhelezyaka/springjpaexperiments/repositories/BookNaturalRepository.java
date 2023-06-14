package kz.zhelezyaka.springjpaexperiments.repositories;

import kz.zhelezyaka.springjpaexperiments.domain.BookNatural;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookNaturalRepository extends JpaRepository<BookNatural, String> {
}
