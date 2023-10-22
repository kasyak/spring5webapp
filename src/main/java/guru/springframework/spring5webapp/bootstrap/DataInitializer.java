package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.repositories.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"local", "default"})
@AllArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private BookRepository bookRepository;
    @Override
    public void run(String... args) throws Exception {
        bookRepository.deleteAll();
        Book book1 = new Book("Title from Bootstrap", "123", "Publisher1");
        bookRepository.save(book1);

        Book book2 = new Book("Another Title from Bootstrap", "456", "Publisher2");
        bookRepository.save(book2);

        bookRepository.findAll().forEach(book -> {
                    System.out.println("Book id: " + book.getId());
                    System.out.println("Book title: " + book.getTitle());
                });
    }
}
