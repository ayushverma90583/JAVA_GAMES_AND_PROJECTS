class Library
{
    String[] books;
    int noOfBooks;
    public Library()
    {
        books = new String[100];
        noOfBooks = 0 ;
    }
    public void addBook(String book)
    {
        books[noOfBooks] = book;
        noOfBooks++;
        System.out.println(book +" has been added.");
    }
    public void showAllAvalaibleBooks()
    {
        System.out.println("\nAvalaible Books :- ");
        for(String book : books)
        {
            System.out.println(book);
            if(book == null)
            {
                break;
            }
        }
    }
   public void issuedBook(String book)
   {
        System.out.println("\nIssued books :- ");
        for(int a=0; a<books.length; a++)
        {
            if(books[a].equals(book))
            {
                System.out.println(book + " Book is Issued.");
                book = null;
                return;
            }
        }
   }
   public void returnBook(String book)
   {
        System.out.println("\nReturned Books :- ");
        books[noOfBooks]=book;
        noOfBooks++;
        System.out.println(book + " books is Returned.");
   }

}
class ManthanLibrary
{
    public static void main(String[] args)
    {
        Library Manthan = new Library();
        Manthan.addBook("\"The Phychology of Money\"");
        Manthan.addBook("\"To Kill a Mocking Bird\"");
        Manthan.addBook("\"Harry Potter\"");
        Manthan.addBook("\"Treasure Island\"");
        Manthan.showAllAvalaibleBooks();
        Manthan.issuedBook("\"Harry Potter\"");
        Manthan.returnBook("\"Harry Potter\"");
    }
}