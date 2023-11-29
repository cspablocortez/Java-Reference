import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime currentDateTime;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E MMM dd h:mm:ss a");
        String formattedDateString;
        
        while (true) {
            currentDateTime = LocalDateTime.now();
            formattedDateString = currentDateTime.format(formatter);
            System.out.print("Current Date and Time: ");
            System.out.println(formattedDateString);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clearTerminal();
        }
        
    }


    private static void clearTerminal() {
        if (System.console() == null) {
            System.out.println("Unable to clear terminal. ANSI escape codes not supported.");
        }

        System.out.println("\033[H\033[2J");

    }
}