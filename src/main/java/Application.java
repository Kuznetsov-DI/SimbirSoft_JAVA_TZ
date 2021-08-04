import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import model.Statistic;

public class Application {

    public static void main(String[] args) {

        String URL = "https://www.simbirsoft.com/";

        WebClient client = new WebClient();
        HtmlPage page = null;

        client.getOptions().setCssEnabled(false);
        client.getOptions().setJavaScriptEnabled(false);

        try {
            page = client.getPage(URL);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String[] htmlPageText = page.asText().split("[ ,-.!?:;'\"\n\r\t0-9]");

        for (String word : htmlPageText) {

            if (!word.equals("")) {
                System.out.println(word);
            }
        }

        Statistic statistic = new Statistic();

        statistic.add(htmlPageText);
        statistic.print();
    }
}