package org.wecancodeit.reviews;

import java.util.Collection;

public class Category {
    private String title;
    private String description;
    private Collection<Review> reviews;

    public Category(String title, String description, Collection<Review> reviews) {
        this.title = title;
        this.description = description;
        this.reviews = reviews;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }
}
