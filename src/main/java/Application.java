
import config.Config;
import model.Statistic;

import static helpers.HtmlHelper.getWordsPage;

public class Application {

    public static void main(String[] args) {

        Config.setProperties();
        Statistic statistic = new Statistic();

        statistic.add(getWordsPage(System.getProperty("url")));
        statistic.print();
    }
}