package books;

import org.example.BookClient;
import org.example.entity.Books;
import org.example.entity.Char;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;


public class BooksTest {
    private BookClient bookClient;

    @BeforeClass
    void setUP() {
        this.bookClient = new BookClient();
    }


    @Test
    public void getBooks_char() {

        List<Books> listBooks = this.bookClient.getBooks();
        //Set<String> result = new HashSet<>();
        System.out.println(listBooks.get(0).getName());

        Optional<Books> THK = listBooks.stream().filter(books -> books.getName().equals("The Hedge Knight")).findFirst();
        Optional<Books> GOT = listBooks.stream().filter(books -> books.getName().equals("A Game of Thrones")).findFirst();
        List<String> characterTHE = THK.map(Books::getCharacters).orElse(null);
        List<String> characterGOT = GOT.map(Books::getCharacters).orElse(null);

        assert characterTHE != null;
        System.out.println("length oif THK : " + characterTHE.size()); //334
        assert characterGOT != null;
        System.out.println("length oif GOT : " + characterGOT.size()); // 54

        characterTHE.retainAll(characterGOT);

        Set<String> result = characterTHE.stream()
                .distinct()
                .filter(characterGOT::contains)
                .collect(Collectors.toSet());

        System.out.println("size for intersect : " + result.size());

        result.parallelStream().forEach(url -> {
            String[] arr = url.split("/");
            int id = Integer.parseInt(arr[arr.length - 1]);
            Char chars = this.bookClient.getChar(id);
            System.out.println(chars.getName());

        });
    }

}
