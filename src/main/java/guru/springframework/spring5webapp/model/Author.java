package guru.springframework.spring5webapp.model;

import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

//@Entity
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class Author {
    @Id
    private Long id;
    private String firstName;
    private String lastName;

//    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();
}
