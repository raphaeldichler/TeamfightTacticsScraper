package net.plyse.tftscraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * @author Raphael Dichler on 28.12.2022.
 */
public class Main {

    public static void main(String[] args) {
        String url = "https://tftactics.gg/champions/jax";

        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(doc);

        String title = doc.title();
        System.out.println(title);
    }

}
