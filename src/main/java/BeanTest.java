import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {

        Album album = new Album();
        Album album2 = new Album();
        Author author = new Author();
        Author author2 = new Author();
        Quote quote = new Quote();
        Quote quote2 = new Quote();

        album.setName("Parachutes");
        album.setArtist("Coldplay");
        album.setReleaseYear(2012);
        album.setSales(100000);
        album.setGenre("Alternative");
        album.setId(1);

        album2.setName("Hurry Up, We're Dreaming");
        album2.setArtist("M83");
        album2.setReleaseYear(2011);
        album2.setSales(200000);
        album2.setGenre("Alternative");
        album2.setId(2);

        author.setFirstName("Stephen");
        author.setLastName("King");
        author.setId(1);

        author2.setFirstName("Sam");
        author2.setLastName("Harris");
        author2.setId(2);

        quote.setQuote("This a Stephen King Quote.");
        quote.setAuthor("Stephen King");
        quote.setId(1);

        quote2.setQuote("This is a Sam Harris Quote.");
        quote2.setAuthor("Sam Harris");
        quote2.setId(2);

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quote);
        quotes.add(quote2);

        for (Quote q : quotes) {
            System.out.println(q.getQuote());
            System.out.println(q.getAuthor());
            System.out.println(q.getId());
        }

    }
}