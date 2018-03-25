package co.japo.spring5sample.repository;

import co.japo.spring5sample.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created in IntelliJ IDEA.
 * User: JapoDeveloper
 * Date: 3/20/18
 * Time: 8:23 PM
 */
public interface BookRepository extends CrudRepository<Book,Long> {
}
