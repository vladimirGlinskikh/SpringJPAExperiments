package kz.zhelezyaka.springjpaexperiments.domain.composite;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@IdClass(NameId.class)
public class AuthorComposite {

    @Id
    private String firstName;
    @Id
    private String lastName;
    private String country;
}
