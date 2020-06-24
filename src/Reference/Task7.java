package Reference;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task7 {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter divByDoublePoint = DateTimeFormatter.ofPattern("dd::MMM::yyyy");
        DateTimeFormatter divByDoublePointWithHours = DateTimeFormatter.ofPattern("dd::MMM::yyyy HH::MM::SS");
        DateTimeFormatter divBySlash = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(
                now.format(divByDoublePoint) + "\n" +
                now.format(divByDoublePointWithHours) + "\n" +
                now.format(divBySlash));

    }
}
