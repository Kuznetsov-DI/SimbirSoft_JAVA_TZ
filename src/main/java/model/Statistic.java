package model;

import java.util.HashMap;

public class Statistic {

    private final HashMap <String, Integer> statistic = new HashMap<>();

    public void add (String [] words) {

        for (String word: words) {

            if (!word.equals("")) {

                if (statistic.containsKey(word)){

                    Integer countWords = statistic.get(word) + 1;
                    statistic.put(word, countWords);
                } else {
                    statistic.put(word, 1);
                }
            }
        }
    }

    public void print (){

       statistic.forEach((String, Integer) -> System.out.println(String + " - " + Integer));
    }
}