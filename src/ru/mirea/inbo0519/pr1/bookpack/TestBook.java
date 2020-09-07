package ru.mirea.inbo0519.pr1.bookpack;

public class TestBook {
    public static void main(String[] args)
    {
        Book book1 = new Book(100, 2000, 3000, 0);
        System.out.println(book1);

        Book book2 = new Book(100);
        book2.setNumberOfPages(300);
        book2.setWeight(1000);
        book2.nextPage();
        System.out.println(book2);
    }
}
