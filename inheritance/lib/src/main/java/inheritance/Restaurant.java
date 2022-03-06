package inheritance;

import java.util.LinkedList;

public class Restaurant implements RestaurantReview{

    private String name;
    private double price;
    private double numOfStars;

    private LinkedList<Review> reviewResturant = new LinkedList<>();

    public Restaurant(String name, double price, int numOfStars) {
        this.name = name;
        this.price = price;
        this.numOfStars = numOfStars;
    }

    public String getName() {
        return name;
    }

    public double getNumOfStars() {
        return numOfStars;
    }

    public double getPrice() {
        return price;
    }

    public void addReview(Review review)
    {
        this.reviewResturant.add(review);
        review.setPointer(this);
    }

    @Override
    public LinkedList<Review> getReviews() {
        return this.reviewResturant;
    }

    public void getStars(){
        double countStar = 0.0;
        for (Review rev: getReviews()){
            countStar += rev.getNumOfStars();
        }
        this.numOfStars = countStar/getReviews().size();
        System.out.println(this.numOfStars);
    }



    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", numOfStars=" + getNumOfStars() +
                ", reviewResturant=" + getReviews() +
                '}';
    }
}
