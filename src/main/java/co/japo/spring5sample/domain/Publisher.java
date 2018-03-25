package co.japo.spring5sample.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created in IntelliJ IDEA.
 * User: JapoDeveloper
 * Date: 3/25/18
 * Time: 7:10 PM
 */

@Entity
@Data
@NoArgsConstructor
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;

    public Publisher(String name){
        this.name = name;
    }

}