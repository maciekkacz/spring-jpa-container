package pl.javastart.model;

public interface BookDao {
    public void save(Book book);
    public Book get(Long id);
}