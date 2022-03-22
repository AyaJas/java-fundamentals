package inheritance;

import java.util.LinkedList;

public class Restaurant implements ResShoMovReview{

    private String name;
    private String price;
    private double numOfStars;

    private LinkedList<Review> reviewResturant = new LinkedList<>();

    public Restaurant(String name, String price, int numOfStars) {
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

    public String getPrice() {
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

    @Override
    public String reviewTheater() {
        return null;
    }

    @Override
    public String reviewShop() {
        return null;
    }

    public double getStars(){
        double countStar = 0.0;
        for (Review rev: getReviews()){
            countStar += rev.getNumOfStars();
        }
        this.numOfStars = countStar/getReviews().size();
        System.out.println(this.numOfStars);
        return countStar;
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
