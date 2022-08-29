package org.pattern.creational.prototype;

import org.pattern.common.Testable;

public class PrototypeTest implements Testable {
    @Override
    public void run()  {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("조정래","태백산맥" ));
        bookShelf.addBook(new Book("박완서","나목" ));
        bookShelf.addBook(new Book("박경리","토지" ));

        BookShelf another = null;
        try {
            another = (BookShelf) bookShelf.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(bookShelf);
        System.out.println(another);

        bookShelf.getShelf().get(0).setAuthor("조정래");
        bookShelf.getShelf().get(0).setTitle("한강");

        // 얕은 복사가 일어날 수 있으니 재정의로 깊은 복사
        System.out.println(bookShelf);
        System.out.println(another);

    }
}
