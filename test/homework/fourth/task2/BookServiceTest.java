package homework.fourth.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {
    BookRepository repository;
    BookService service;

    @BeforeEach
    void setup(){
        repository = mock(BookRepository.class);
        service = new BookService(repository);
    }
    @Test
    void getDetailedInfoAboutBook() {
        when(repository.getInfo("War and piece")).thenReturn("Leo Tolstoy, 1869");

        String bookInfo = service.getDetailedInfoAboutBook("War and piece");

        assertThat(bookInfo).isEqualTo("Leo Tolstoy, 1869");
    }
}