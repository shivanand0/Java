import java.util.Scanner;
import java.util.ArrayList;
class Library{

    ArrayList<String> books = new ArrayList<String>();
    // String[] books;
    int no_of_books;

    Library(){
        // this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBooks(String book){
        this.books.add(book);
        System.out.println(book+" has been added to the library\n");
        no_of_books++;
    }

    void showAvailableBooks(){
        if(books.size() == 0){
            System.out.println("Books not available! add books first.");
        }
        else{
                System.out.println("Total available Books are: "+no_of_books);
                for (String book : this.books) {
                    System.out.println("-> "+ book);
                }
            }
        }

    void issueBook(String book){
        if(books.size() == 0){
            System.out.println("Books not available! add books first.");
        }
        else{
            for (String issuedBook : this.books) {
                if(issuedBook.equals(book)){
                    System.out.println("The book "+book+" has been issued!");
                    this.books.remove(issuedBook);
                    no_of_books--;
                    return;
                }
                System.out.println("This book is not available\n");
            }
        }
    }

    void returnBook(String book){
        this.books.add(book);
        System.out.println(book+" has been returned/added\n");
        no_of_books++;
    }

}
public class LibrarySystem {
    public static void main(String[] args) {
        //methods: issurbook, returnbook, show available books
        Scanner sc = new Scanner(System.in);
        
        Library centrLibrary = new Library();
        boolean a = true;
        while(a)
        {
            System.out.println("***Operations***");
            System.out.println("1.Add book\n2.Show available books\n3.Issue book\n4.Return book\n5.Exit\n");
            System.out.print("Enter Operation: ");
            int ope = sc.nextInt();
            switch(ope)
            {
                case 1:
                    System.out.print("Enter book name to add: ");
                    centrLibrary.addBooks(sc.next());
                    break;
                case 2:
                    centrLibrary.showAvailableBooks();
                    break;
                case 3:
                    System.out.print("Enter book name to issue: ");
                    centrLibrary.issueBook(sc.next());
                    break;
                case 4:
                System.out.print("Enter book name to return: ");
                    centrLibrary.returnBook(sc.next());
                    break;
                case 5:
                    a = false;
                    break;
                default:
                    System.out.println("Enter Correct choice!");
            }
        }
    }
}
