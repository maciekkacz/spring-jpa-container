package pl.javastart.model;

import org.springframework.context.annotation.*;


@Configuration
@ComponentScan
public class SpringJpaApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(SpringJpaApplication.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        //zapisujemy
        Book book = new Book("1234567890468", "Spring is so cool", "Javastart");
        bookDao.save(book);

        //odczytujemy
        Book bookGet = bookDao.get(1L);
        System.out.println(bookGet);
        ctx.close();
    }
}