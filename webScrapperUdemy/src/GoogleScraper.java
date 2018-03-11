import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GoogleScraper {

    //After inspecting the page, we determined that this is what we need
    //URL: https://www.google.com/search?q=apple
    //Selector: h3.r.a

    public static void main (String[]args) throws Exception{

    final String query = "apple";

    final Document page = Jsoup.connect("https://www.google.com/search?q=apple").get();



    }
}
