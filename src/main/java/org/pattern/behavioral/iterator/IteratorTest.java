package org.pattern.behavioral.iterator;

import org.pattern.common.Testable;

public class IteratorTest implements Testable {
    @Override
    public void run() {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        Iterator it = bookShelf.iterator(Constant.FORWARD);
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println("" + book.getName());
        }

        System.out.println("============");

        it = bookShelf.iterator(Constant.REVERSE);
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println("" + book.getName());
        }
    }
}
