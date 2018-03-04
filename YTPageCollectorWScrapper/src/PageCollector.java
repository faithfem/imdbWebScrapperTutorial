import org.jsoup.Jsoup;
import org.jsoup.Jsoup.nodes.Document;

public class PageCollector {

    public static void main(String[] args) {

        try {
            Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
            log(doc.title());
        }
    }
}
