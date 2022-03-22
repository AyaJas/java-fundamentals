package inheritance;

public class movieReview extends Review{

    String movie;

    public movieReview(String reviewText, String author, double numOfStars,String movie) {
        super(reviewText, author, numOfStars);
        this.movie = movie;
    }


    @Override
    public String toString() {
        return "movieReview{" +
                "reviewText='" + getReviewText() + '\'' +
                ", author=" + getAuthor() +'\'' +
                ", numOfStars=" + getNumOfStars() +'\'' +
                ", movie='" + movie + '\'' +
                '}';
    }

}
