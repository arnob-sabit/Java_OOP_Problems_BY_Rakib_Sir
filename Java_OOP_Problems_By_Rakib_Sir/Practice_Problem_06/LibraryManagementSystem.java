import java.util.*;
class Books 
{
    static ArrayList<Books> bookList = new ArrayList<> ();

    int bookId;
    String bookName;
    String bookAuthor;
    String yearOfPub;
    float price;
    String status;

    public Books(int bookId, String bookName, String bookAuthor, String yearOfPub, float price, String status)
    {
        this.bookId = bookId;
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
        this.yearOfPub = yearOfPub;
        this.price = price;
        this.status = status;
    }

    public static void AddNewBooks(Books book)
    {
        bookList.add(book);
        System.out.println("Book added: " + book.bookName);
    }

    public static void DeleteBooks(int id) 
    {
        bookList.removeIf(book -> book.bookId == id);
        System.out.println("Book with ID " + id + " removed.");
    }

    public void DisplayBookDetails() 
    {
        System.out.println("ID: " + bookId + ", Name: " + bookName + ", Author " + bookAuthor + ", Year: " + yearOfPub +", Price: $" +price +",Status : " + status);
    }

    public static void InquiryBook(String name) 
    {
        for(Books book: bookList)
        {
            if(book.bookName.equalsIgnoreCase(name)) 
            {
                System.out.println("Book found: ");
                book.DisplayBookDetails();
                return;
            }
        }
        System.out.println("Book not found. ");
    }
}

class User 
{
    static ArrayList<User> userList = new ArrayList<> ();

    int userId;
    String userName;
    String userAddress;
    int phoneNo;

    public User(int userId, String userName, String userAddress, int phoneNo)
    {
        this.userId = userId;
        this.phoneNo = phoneNo;
        this.userAddress = userAddress;
        this.userName = userName;

    }
    public static void AddNewUser(User user)
    {
        userList.add(user);
    }

    public static void DeleteUser(int id) 
    {
        userList.removeIf(user -> user.userId == id);
    }

    public void UpdateDetails(String newAddress, int newPhone) 
    {
        this.userAddress = newAddress;
        this.phoneNo = newPhone;
    }

    public void BookPurchase(Books book) 
    {
        if(book.status.equalsIgnoreCase("Available")) 
        {
            book.status = "Sold";
        }
        else
        {
            System.out.println("Book not available for purchase");
        }
    }

    public void ReturnBooks(Books book) 
    {
        book.status = "Available";
    }

}

class Librarian 
{
    int id;
    String name;

    public Librarian(int id, String name) 
    {
        this.id = id;
        this.name  = name;
    }
    public void SearchBook(String name) 
    {
        Books.InquiryBook(name);
    }

    public boolean VerifyMember (int userId)
    {
        for(User u : User.userList)
        {
            if(u.userId == userId) 
            {
                System.out.println("User Verified: " + u.userName);
                return true;
            }
        }
        System.out.println("User not found.");
        return false;
    }

    public void OrderBooks() 
    {
        System.out.println(name + " order new books. ");
    }

    public void SellBooks(Books book,User user)
    {
        user.BookPurchase(book);
    }
}

class Publisher
{
    static ArrayList<Publisher> pubList = new ArrayList<> ();

    int id;
    String name;
    String address;
    int phoneNo;

    public Publisher(int id, String name,String address,int phoneNo)
    {
        this.id = id;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public static void AddPub(Publisher pub) 
    {
        pubList.add(pub);
    }

    public void ModifyPub(String newAddress, int newPhone) 
    {
        this.address = newAddress;
        this.phoneNo = newPhone;
    }

    public static void DeletePub(int id) 
    {
        pubList.removeIf(p -> p.id == id);
    }
    public void OrderStatus() 
    {
        System.out.println("Order from publisher " + name + " is in progress. ");
    }
}
public class LibraryManagementSystem
{
    public static void main(String[] args)
    {
        Books book1 = new Books(1, " Java Basics", " Ishtiak", "2020", 29.99f, "Available");
        Books.AddNewBooks(book1);
        book1.DisplayBookDetails();
        User user1 = new User(101, "Ishtiak", "Sylhet", 012345);

        Librarian lib = new Librarian(201,"Mr. Alim");
        lib.VerifyMember(101);
        lib.SearchBook("Java Basics. ");

        Publisher pub1 = new Publisher(301, "TechBooks", "Dhaka", 0123);
        Publisher.AddPub(pub1);
        pub1.OrderStatus();
        pub1.ModifyPub("Chittagong", 88888888);
    }
}