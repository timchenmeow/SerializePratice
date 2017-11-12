
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import entity.Book;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


/**
 *
 * @author TimChen
 */
public class Serialize {
    private Gson gson = new Gson();
    private String singleBookFilePath = "data/singleBook.json";
    private String BookListFilePath = "data/BookList.json";
    public static void main(String[] args){
        Serialize serialize = new Serialize();
        serialize.SerializeSingleBook();
        serialize.SerializeBookList();
    }
    
    public void SerializeSingleBook(){
        try {
            String singleBookStr = new String(Files.readAllBytes(Paths.get(singleBookFilePath)));
            Book book = gson.fromJson(singleBookStr, Book.class);
            System.out.println("Book object is "+book);
        } catch (IOException ex) {
            System.out.println("singleBook.json 不存在");
        }
    }
    
    public void SerializeBookList(){
        try {
            String singleBookStr = new String(Files.readAllBytes(Paths.get(BookListFilePath)));
            List<Book> book = gson.fromJson(singleBookStr, new TypeToken<List<Book>>(){}.getType());
            System.out.println("Book List is "+book);
        } catch (IOException ex) {
            System.out.println("singleBook.json 不存在");
        }
    }
}
