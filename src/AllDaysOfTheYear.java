import java.util.*;
import java.text.*;
public class AllDaysOfTheYear {
    public static void main(String[] args) {
        SimpleDateFormat pattern = new SimpleDateFormat ("dd.MM.yyyy");
        String x = "test";

        Calendar c = Calendar.getInstance();
        c.set(Calendar.DATE, 1);
        c.set(Calendar.MONTH, 0);

        for (int i = 0; i < c.getMaximum(Calendar.DAY_OF_YEAR); i ++){
        System.out.printf(("%d day of the year: " + pattern.format(c.getTime())),i+1);
        System.out.println();
        c.add(Calendar.DATE, 1);
        }
    }
}
