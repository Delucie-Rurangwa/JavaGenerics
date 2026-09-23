import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Archive<Book>> bookArchives = new ArrayList<>();
        bookArchives.add(new Archive<>(new Book()));
        bookArchives.add(new Archive<>(new Book()));


    }
}