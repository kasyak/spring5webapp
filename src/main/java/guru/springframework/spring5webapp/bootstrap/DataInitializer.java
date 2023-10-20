package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.repositories.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private BookRepository bookRepository;
    @Override
    public void run(String... args) throws Exception {
        Book book1 = new Book("Title1", "123", "Publisher1");
        bookRepository.save(book1);

        bookRepository.findAll().forEach(book -> {
                    System.out.println("Book id: " + book.getId());
                    System.out.println("Book title: " + book.getTitle());
                });
    }
}
