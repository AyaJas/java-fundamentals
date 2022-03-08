package inheritance;

import java.util.Random;

public class Review {

    private String reviewText;
    private String author;
    private double numOfStars;
    private ResShoMovReview pointer;


    public Review(String reviewText, String author, double numOfStars)
    {

        if ( numOfStars > 5 || numOfStars < 0 ){
            System.out.println("Error");
        }

        this.reviewText = reviewText;
        this.author = author;
        this.numOfStars = numOfStars;

    }

    public Review(String reviewText, String author, double numOfStars, ResShoMovReview pointer)
    {

        if ( numOfStars > 5 || numOfStars < 0 ){
            System.out.println("Error");
        }

        this.reviewText = reviewText;
        this.author = author;
        this.numOfStars = numOfStars;
        this.pointer = pointer;

    }

    public String getReviewText() {
        return reviewText;
    }

    public String getAuthor() {
        return author;
    }

    public double getNumOfStars() {
        return numOfStars;
    }

    public void setPointer(ResShoMovReview pointer) {
        this.pointer = pointer;
    }

    public ResShoMovReview getPointer() {
        return pointer;
    }

    @Override
    public String toString() {
        return "Review{" +
                "reviewText='" + getReviewText() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", numOfStars=" + getNumOfStars() +
                '}';
    }
}
