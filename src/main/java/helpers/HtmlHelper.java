package helpers;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class HtmlHelper {

    private static final WebClient client = new WebClient();
    private static HtmlPage page = null;

    private static final String REGEXP_SPLIT_PAGE = "[ ,-.!?:;—/'()%\"\n\r\t0-9]";

    public static String [] getWordsPage (String url) {

        client.getOptions().setCssEnabled(false);
        client.getOptions().setJavaScriptEnabled(false);

        try {
            page = client.getPage(url);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return page.asText().split(REGEXP_SPLIT_PAGE);
    }
}