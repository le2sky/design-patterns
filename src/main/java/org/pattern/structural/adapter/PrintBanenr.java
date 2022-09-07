package org.pattern.structural.adapter;

//상속보단, 합성으로 구현하는게 더욱 유연하다.
public class PrintBanenr implements Print{

    private Banner banner;


    public PrintBanenr(String string) {
        banner = new Banner(string);
    }

    @Override
    public void printWeek() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
