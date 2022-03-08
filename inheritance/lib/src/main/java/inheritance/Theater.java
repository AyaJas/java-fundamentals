package inheritance;

import java.util.LinkedList;

public abstract class Theater implements ResShoMovReview{
    private String name;
    private double numOfStars = 0.0;
    private LinkedList<String> movie = new LinkedList<>();
    private LinkedList<Review> reviews = new LinkedList<>();


    public Theater(String name, double numOfStars) {
        this.name = name;
        this.numOfStars = numOfStars;
    }


//    addMovie and removeMovie

    public void addMovie(String movieName){
        this.movie.add(movieName);
    }

    public void removeMovie(String movieName)
    {
        this.movie.remove(movieName);
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getStars() {
        return this.numOfStars;
    }

    @Override
    public LinkedList<Review> getReviews() {
        return this.reviews;
    }

    public LinkedList<String> getMovie() {
        return movie;
    }

    @Override
    public void addReview(Review review)
    {
        this.reviews.add(review);
        review.setPointer(this);
    }

    @Override
    public String reviewTheater(){
        LinkedList<Review> review = getReviews();

        String result = "";
        for (Review rev: review) {
            result+=rev.toString();
        }
        return result;
    }

    public String movieString(LinkedList<String> movieString)
    {
        String result = "";
        for (int i = 0; i < movieString.size(); i++) {
            result += movieString.get(i);
        }

        return result;
    }


    @Override
    public String toString() {
        return "Theater{" +
                "name='" + getName() + '\'' +
                ", numOfStars=" + numOfStars +
                ", movie=" + getMovie() +
                ", reviews=" + getReviews() +
                '}';
    }
}
