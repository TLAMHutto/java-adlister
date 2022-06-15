import java.io.Serializable;

public class Album implements Serializable {
    private String name;
    private String artist;
    private int releaseYear;
    private float sales;
    private String genre;

    public Album(String name, String artist, int releaseYear, float sales, String genre) {
        this.name = name;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.sales = sales;
        this.genre = genre;
    }

    public static void main(String[] args) {
        Album album = new Album("The Dark Side of the Moon", "Pink Floyd", 1973, 1000000, "Rock");
        System.out.println(album.toString());
    }
}
