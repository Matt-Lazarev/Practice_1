package ru.mirea.inbo0519.pr1.bookpack;

public class Book {
    private int numberOfPages;
    private int price;
    private int weight;

    private int currentPage;

    public Book(int numberOfPages, int price, int weight, int cp) {
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.weight = weight;
        currentPage = cp;
    }

    public Book(int numberOfPages, int price) {
        this.numberOfPages = numberOfPages;
        this.price = price;
        int weight = 0;
        currentPage = 0;
    }

    public Book(int price) {
        this.price = price;
        numberOfPages = 0;
        weight = 0;
        currentPage = 0;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void nextPage()
    {
        currentPage++;
    }

    @Override
    public String toString()
    {
        return "The book: price " + price + "   pages: " + numberOfPages + "   weight: " + weight + "   current page: " + currentPage;
    }

}
