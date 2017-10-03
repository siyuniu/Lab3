import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
/**  @author Lab3Niu is a function for print
 *
 * @author Nancy
 *
 */
public class Lab3Niu {
/**
 * Retrieve contents from a URL and return them as a string.
 *
 * @param url url to retrieve contents from
 * @return the contents from the url as a string, or an empty string on error
 */
public static String urlToString(final String url) {
    Scanner urlScanner;
    try {
        urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
    } catch (IOException e) {
        return "";
    }
    String contents = urlScanner.useDelimiter("\\A").next();
    urlScanner.close();
    return contents;
}

/**
 *
 * @param args is the url where we are going to looking into.
 */
public static void main(final String[]args) {
    String text1 = urlToString("http://erdani.com/tdpl/hamlet.txt");
    String text2 = urlToString("https://www.bls.gov/tus/charts/chart9.txt");
    String text3 = urlToString("http://tgftp.nws.noaa.gov/data/raw/fz/fzus53.klot.srf.lot.txt");

    int wordCountText1 = text1.length();
    int wordCountText2 = text2.length();
    int wordCountText3 = text3.length();

    System.out.println(wordCountText1);
    System.out.println(wordCountText2);
    System.out.println(wordCountText3);











}





}
