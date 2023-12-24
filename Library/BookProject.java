import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int availableCopies;
    private int totalCopies;

    public Book(String title, String author, String ISBN, int totalCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void checkoutBook() {
        if (availableCopies > 0) {
            availableCopies--;
        }
    }

    public void returnBook() {
        if (availableCopies < totalCopies) {
            availableCopies++;
        }
    }
}

public class Member {
    private String name;
    private String memberID;
    private int maxBooksAllowed;
    private List<Book> booksBorrowed;

    public Member(String name, String memberID, int maxBooksAllowed) {
        this.name = name;
        this.memberID = memberID;
        this.maxBooksAllowed = maxBooksAllowed;
        this.booksBorrowed = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getMemberID() {
        return memberID;
    }

    public boolean canBorrowBooks() {
        return booksBorrowed.size() < maxBooksAllowed;
    }

    public void borrowBook(Book book) {
        if (canBorrowBooks()) {
            book.checkoutBook();
            booksBorrowed.add(book);
        } else {
            System.out.println("Cannot borrow more than " + maxBooksAllowed + " books.");
        }
    }

    public void returnBook(Book book) {
        if (booksBorrowed.remove(book)) {
            book.returnBook();
        }
    }

    public List<Book> getBooksBorrowed() {
        return booksBorrowed;
    }
}

public class Borrow {
    private String memberID;
    private String ISBN;
    private String borrowDate;

    public Borrow(String memberID, String ISBN, String borrowDate) {
        this.memberID = memberID;
        this.ISBN = ISBN;
        this.borrowDate = borrowDate;
    }

    public String getMemberID() {
        return memberID;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getBorrowDate() {
        return borrowDate;
    }
}

public class Library {
    private Map<String, Book> books;
    private Map<String, Member> members;
    private List<Borrow> borrows;

    public Library() {
        this.books = new HashMap<>();
        this.members = new HashMap<>();
        this.borrows = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.put(book.getISBN(), book);
    }

    public void removeBook(Book book) {
        books.remove(book.getISBN());
    }

    public void addMember(Member member) {
        members.put(member.getMemberID(), member);
    }

    public void removeMember(Member member) {
        members.remove(member.getMemberID());
    }

    public void borrowBook(String memberID, String ISBN, String borrowDate) {
    Member member = members.get(memberID);
    Book book = books.get(ISBN);

    if (member != null && book != null) {
        if (member.canBorrowBooks()) {
            member.borrowBook(book);
            borrows.add(new Borrow(memberID, ISBN, borrowDate));
            System.out.println("Book with ISBN " + ISBN + " borrowed by member " + memberID);
        } else {
            System.out.println("Cannot borrow more than " + member.getMaxBooksAllowed() + " books.");
        }
    } else {
        System.out.println("Invalid member ID or ISBN.");
    }
}

public void returnBook(String memberID, String ISBN, String returnDate) {
    Member member = members.get(memberID);
    Book book = books.get(ISBN);

    if (member != null && book != null) {
        member.returnBook(book);
        borrows.removeIf(borrow -> borrow.getMemberID().equals(memberID) && borrow.getISBN().equals(ISBN));
        System.out.println("Book with ISBN " + ISBN + " returned by member " + memberID);
    } else {
        System.out.println("Invalid member ID or ISBN.");
    }
}

public List<Book> getAvailableBooks() {
    List<Book> availableBooks = new ArrayList<>();
    for (Book book : books.values()) {
        if (book.getAvailableCopies() > 0) {
            availableBooks.add(book);
        }
    }
    return availableBooks;
}

public List<Book> getBooksBorrowedByMember(String memberID) {
    Member member = members.get(memberID);
    if (member != null) {
        return member.getBooksBorrowed();
    } else {
        System.out.println("Invalid member ID.");
        return new ArrayList<>();
    }
}

public List<Borrow> getBorrows() {
    return borrows;
}
}

class BookProject{

public static void main(String[] args) {
    Library library = new Library();
    Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9781983217689", 5);
    Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780446310789", 3);
    Book book3 = new Book("1984", "George Orwell", "9780451524935", 2);
    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    Member member1 = new Member("John Smith", "1234", 2);
    Member member2 = new Member("Jane Doe", "5678", 3);
    library.addMember(member1);
    library.addMember(member2);
    library.borrowBook("1234", "9781983217689", "2023-04-06");
    library.borrowBook("5678", "9780446310789", "2023-04-06");
    library.borrowBook("5678", "9781983217689", "2023-04-06"); // should fail due to member's book limit
    library.returnBook("1234", "9781983217689", "2023-04-07");
    List<Book> availableBooks = library.getAvailableBooks();
    System.out.println("Available books:");
    for (Book book : availableBooks) {
        System.out.println(book.getTitle() + " by " + book.getAuthor() + " (ISBN " + book.getISBN() + ")");
    }
    List<Book> booksBorrowed = library.getBooksBorrowedByMember("5678");
    System.out.println("Books borrowed by Jane Doe:");
    for (Book book : booksBorrowed) {
        System.out.println(book.getTitle() + " by " + book.getAuthor() + " (ISBN " + book.getISBN() + ")");
    }
    List<Borrow> borrows = library.getBorrows();
    System.out.println("Borrows:");
    for (Borrow borrow : borrows) {
        System.out.println("Member " + borrow.getMemberID() + " borrowed book with ISBN " + borrow.getISBN() + " on " + borrow.getBorrowDate() + " and returned on " + borrow.getBorrowDate());
    }
}
}

