import java.sql.Date;
import java.time.chrono.ThaiBuddhistChronology;

public class LibrarSystem {
    public static void main(String[] args) {
        
    }
}

public class Book{
    int bookId;
    String author;
    String bookTitle;
    Date bookDate;
    Book(){
        this.author = author;
        this.bookDate = bookDate;
        this.bookId = bookId;
    }
    public void handledBookDuplicacy(int new_bookId) {
        if(new_bookId!=bookId){
            bookId = new_bookId;
        }else{
            throw Exception;
        }
    }
}
public class Member{

}

public class Borrow{

}
