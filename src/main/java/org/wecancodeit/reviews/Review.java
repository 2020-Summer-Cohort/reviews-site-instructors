package org.wecancodeit.reviews;

public class Review {
    private String bookTitle;
    private String bookAuthor;
    private String bookPublishDate;
    private int rating;
    private String content;

    public Review(String bookTitle, String bookAuthor, String bookPublishDate, int rating, String content) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPublishDate = bookPublishDate;
        this.rating = rating;
        this.content = content;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookPublishDate() {
        return bookPublishDate;
    }

    public int getRating() {
        return rating;
    }

    public String getContent() {
        return content;
    }
}
