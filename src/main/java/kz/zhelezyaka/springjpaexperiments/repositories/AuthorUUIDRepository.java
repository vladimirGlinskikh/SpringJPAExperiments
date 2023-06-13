package kz.zhelezyaka.springjpaexperiments.repositories;

import kz.zhelezyaka.springjpaexperiments.domain.AuthorUuid;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorUUIDRepository extends JpaRepository<AuthorUuid, UUID> {
}
