import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tetst {
    public static void main(String[] args) {

        String[] dates = { "07-05-1990", "28-01-2010", "11-08-1990", "15-01-2010", "16/06/1970" };
        String[] date = dates[1].split("[/\\-]");
        for (int i = 0; i < date.length; i++) {
            System.out.println(date[i]);
        }
    }
}
