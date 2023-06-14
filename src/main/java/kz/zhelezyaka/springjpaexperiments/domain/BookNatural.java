package kz.zhelezyaka.springjpaexperiments.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class BookNatural {

    @Id
    private String title;
    private String isbn;
    private String publisher;
}
