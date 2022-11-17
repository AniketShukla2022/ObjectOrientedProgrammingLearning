import java.util.*;

class Book {
    
    public String bookTitle;
    public String bookAuthor;
    
    Book(String bookTitle, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }
}

class Library {
    private List<Book> books;
    
    Library(List<Book> books) {
        this.books = books;
    }
    
    public List<Book> getTotalNumberOfBooks() {
        return books;
    }
}

class Composition {
    public static void main(String[] args) {
        
        Book b1 = new Book("Programming in Java","Srinivasan");
        Book b2 = new Book("History","Ramachandra");
        Book b3 = new Book("Discovery of India","Pt Nehru");
        
        List<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        
        Library library = new Library(bookList);
        List<Book> bk = library.getTotalNumberOfBooks();
        int countOfBook = 0;
        for (Book b : bk) {
            System.out.println("Title of the book is: " + b.bookTitle + " and Author of the book is: " + b.bookAuthor);
            System.out.println("/n");
            countOfBook++;
        }
        
        System.out.println("Total number of books in the library is " + countOfBook);
    }
}
