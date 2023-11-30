package ConversionTools;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Temperature {


    public static void main(String[] args) {
        try {
            BufferedReader r = new BufferedReader(new FileReader("fahrenheit.in"));
            PrintWriter pw = new PrintWriter("conversions.out");

            String line;
            while ((line = r.readLine()) != null) {
                double temp = Double.parseDouble(line);
                
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
