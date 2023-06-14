package kz.zhelezyaka.springjpaexperiments.repositories;

import kz.zhelezyaka.springjpaexperiments.domain.composite.AuthorComposite;
import kz.zhelezyaka.springjpaexperiments.domain.composite.NameId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorCompositeRepository extends JpaRepository<AuthorComposite, NameId> {
}
