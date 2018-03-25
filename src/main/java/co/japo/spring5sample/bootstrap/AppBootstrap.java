package co.japo.spring5sample.bootstrap;

import co.japo.spring5sample.domain.Author;
import co.japo.spring5sample.domain.Book;
import co.japo.spring5sample.domain.Publisher;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import co.japo.spring5sample.repository.AuthorRepository;
import co.japo.spring5sample.repository.BookRepository;
import co.japo.spring5sample.repository.PublisherRepository;
import org.springframework.stereotype.Component;

/**
 * Created in IntelliJ IDEA.
 * User: JapoDeveloper
 * Date: 3/25/18
 * Time: 7:13 PM
 */
@Component
public class AppBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public AppBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        init();
    }

    private void init(){
        Author danBrown = new Author("Dan","Brown");
        Publisher doubleDay = new Publisher("Doubleday");
        Book inferno = new Book("Inferno","");
        inferno.setPublisher(doubleDay);
        inferno.getAuthors().add(danBrown);

        authorRepository.save(danBrown);
        publisherRepository.save(doubleDay);
        bookRepository.save(inferno);
    }
}
