import com.sun.deploy.net.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.sun.unirest.http.Unirest;

public class UnirestTest {

    public static void main(String[]args)throws Exception{

        final HttpResponse<String> response = Unirest.get("http://httpbin.org/get").asString();
        System.out.println(response.getBody());

    }
}
