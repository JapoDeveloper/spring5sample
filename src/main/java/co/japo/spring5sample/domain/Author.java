package co.japo.spring5sample.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created in IntelliJ IDEA.
 * User: JapoDeveloper
 * Date: 3/25/18
 * Time: 7:07 PM
 */
@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
