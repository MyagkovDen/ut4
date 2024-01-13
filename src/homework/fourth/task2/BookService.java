package homework.fourth.task2;

public class BookService {
    BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public String getDetailedInfoAboutBook(String book) {
        return repository.getInfo(book);
    }
}
