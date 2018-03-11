import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.net.URLEncoder;

public class GoogleScraper {

    //PART 1: HOW TO ACCESS THE WEBSITE

    //After inspecting the page, we determined that this is what we need
    //URL: https://www.google.com/search?q=apple
    //Selector: h3.r.a

    public static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36";

    public static void main (String[]args) throws Exception{

    //Using final keyword to indicate the method cannot be overriden by subclasses
    //Declare string variable and name it query because apple is being queried. U can name it anything
    final String query = "apple";

    final Document page = Jsoup.connect("https://www.google.com/search?q=apple" + URLEncoder.encode(query, "UTF-8")).userAgent(USER_AGENT).get();

        //System.out.println(page.outerHtml());

    //PART 2: NOW GET THE TOP 10 GOOGLE RESULTS BY RETURNING ELEMENTS IN h3.r.a

    for(Element searchResult: page.select("h3.r.a")){

        final String title = searchResult.text();
        //final String url = searchResult.attr("href");

        System.out.println(title + " -> " );
    }



    }
}
