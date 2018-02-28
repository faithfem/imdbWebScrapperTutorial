import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class javaSrcTutorial {
//PLEASE NOTE: You will have to download dependencies in the pom.xml

    //Add a main method to this class
    public static void main(String[]args) throws Exception{


        final Document document = Jsoup.connect("https://www.youtube.com/playlist?list=PLFE2CE09D83EE3E28").get();

        for(Element row: document.select("ytd-playlist-video-renderer.style-scope.ytd-playlist-video-list-renderer")){
        final String title = row.select(".style-scope ytd-playlist-video-renderer").text();
        final String list = row.select("#contents").text();


        //System.out.println(document.outerHtml());
          System.out.println(title + " -> Title: " + title);
          System.out.println(title + " -> List: " + list);
          //CODE IS CORRECT BUT YOUTUBE IS SECURE AND THAT SEEMS TO BE THE REASON I CAN'T DOWNLOAD THE LIST
          //OR IT COULD BE I'M NOT CALLING THE RIGHT CLASS ??

        }
    }

}
