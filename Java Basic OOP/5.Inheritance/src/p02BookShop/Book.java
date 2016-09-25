package p02BookShop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ELISAV on 5.9.2016 г..
 */
public class Book {
    //title, author and price

    private String author;
    private String title;
    private double price;

    public Book(String author, String title, double price) {

        setAuthor(author);
        setTitle(title);
        setPrice(price);
    }

    private void setTitle(String title) {
        if (title.length() < 3) {
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    private void setAuthor(String author) {
        Pattern pattern=Pattern.compile("[0-9]+");
        Matcher matcher=pattern.matcher(author);
        if(matcher.find()) {
            throw new IllegalArgumentException("Author not valid!");
        }
        this.author = author;
    }

    private void setPrice(double price) {
        if (price < 1) {
            throw new IllegalArgumentException("Price not valid!");
        }

        this.price = price;
    }

    protected String getAuthor() {
        return author;
    }

    protected String getTitle() {
        return title;
    }

    protected double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice())
                .append(System.lineSeparator());
        return sb.toString();

    }
}
