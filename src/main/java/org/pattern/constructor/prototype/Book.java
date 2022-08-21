package org.pattern.constructor.prototype;

import java.util.ArrayList;

public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

//mark interface - cloneable
class BookShelf implements Cloneable {
    private ArrayList<Book> shelf;

    public BookShelf() {
        shelf = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        shelf.add(book);
    }

    public ArrayList<Book> getShelf() {
        return shelf;
    }

    public void setShelf(ArrayList<Book> shelf) {
        this.shelf = shelf;
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "shelf=" + shelf +
                '}';
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        BookShelf another = new BookShelf();

        for(Book book : shelf) {
            another.addBook(new Book(book.getAuthor(),book.getTitle()));
        }
        return another;
    }
}


