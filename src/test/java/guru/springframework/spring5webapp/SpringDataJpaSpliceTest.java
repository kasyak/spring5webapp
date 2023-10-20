package guru.springframework.spring5webapp;

import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.repositories.BookRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class SpringDataJpaSpliceTest {
    @Autowired
    BookRepository bookRepository;

    @Test
    public void testJpaTestSplice() {
        long countBefore = bookRepository.count();
        bookRepository.save(new Book("Book3", "12345", "Pub3"));
        long countAfter = bookRepository.count();
        assertThat(countBefore).isLessThan(countAfter);
    }
}
