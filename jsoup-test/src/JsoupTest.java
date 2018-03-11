import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import static org.jsoup.Jsoup.connect;

public class JsoupTest {

    //Create the main method first

    public static void main(String[]args) throws IOException{

        final Document doc = connect("http://en.wikipedia.org/").get();

        final Elements newsHeadlines = doc.select("#mp-itn b a");

        //Print to console
        for (Element headline : newsHeadlines){
            System.out.println(headline.text());
        }

        System.out.println("\n\n-----------------------------\n\n");

        //Print the out html of the page
        System.out.println(doc.outerHtml());


    }
}
