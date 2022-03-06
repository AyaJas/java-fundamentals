package inheritance;

import java.util.LinkedList;

public interface RestaurantReview {
    String getName();
    void getStars();
    LinkedList<Review> getReviews();
    String toString();
}
