import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;



public class Scrapper {

    //Add a main method to this class
    public static void main(String[]args) throws Exception{

        final Document document = Jsoup.connect("http://www.imdb.com/chart/top").get();

        //System.out.println(document.outerHtml());

        for (Element row : document.select("table.chart.full-width tr")){
            //First we want the title from the title column
            final String title = row.select(".titleColumn").text(); //"dot titleColumn" coz it's a class
            //First: IN CASE YOU DON'T WANT THE TITLES NUMBERED 1 TO 250, COPY ONLY THE HREF
            //final String title = row.select(".titleColumn a").text(); //"dot titleColumn" coz it's a class
            //Second: we want the imdb rating
            final String rating = row.select(".imdbRating").text();

            System.out.println(title + " -> Rating: " + rating);
        }

    }

}
