package inheritance;

import java.util.LinkedList;

public interface ResShoMovReview {

    String getName();
    double getStars();
    LinkedList<Review> getReviews();
    String reviewTheater();
    String reviewShop();
    String toString();
    void addReview(Review review);

}
