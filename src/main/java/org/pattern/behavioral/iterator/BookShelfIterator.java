package org.pattern.behavioral.iterator;

public class BookShelfIterator implements Iterator{
    private BookShelf bookShelf;
    private int index;

    BookShelfIterator(Aggregate bookShelf) {
        this.bookShelf = (BookShelf) bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
