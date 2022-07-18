package Clock;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Clock {

    public static void main(String[] args) {
        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime now = LocalDateTime.now();
        String red = "\033[31m";
        String resetColour = "\033[0m";
        System.out.println("The current " + red + "time" + resetColour + " is " + time.format(now));
    }
}