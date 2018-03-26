package co.japo.spring5sample.repositories;

import co.japo.spring5sample.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created in IntelliJ IDEA.
 * User: JapoDeveloper
 * Date: 3/20/18
 * Time: 8:24 PM
 */
public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
