package kz.zhelezyaka.springjpaexperiments.repositories;

import kz.zhelezyaka.springjpaexperiments.domain.composite.AuthorEmbedded;
import kz.zhelezyaka.springjpaexperiments.domain.composite.NameId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorEmbeddedRepository extends JpaRepository<AuthorEmbedded, NameId> {
}
