public class _03_LibrarySystemSearch 
{
    String tittle, author;
    _03_LibrarySystemSearch(String tittle)
    {
        this(tittle, null);
    }
    _03_LibrarySystemSearch(String tittle, String author)
    {
        this.tittle = tittle;
        this.author = author;
    }
    public static void main(String[] args) 
    {
        _03_LibrarySystemSearch obj1 = new _03_LibrarySystemSearch("Programming With C", "Schaums");
        _03_LibrarySystemSearch obj2 = new _03_LibrarySystemSearch("Java: The Complete Reference");

        System.out.println("Author: " +obj1.author + "\n" + "Book: " + obj1.tittle);
        System.out.println("Author: " +obj2.author + "\n" + "Book: " + obj2.tittle);
    }
}
