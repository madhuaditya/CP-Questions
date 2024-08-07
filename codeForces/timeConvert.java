import java.util.Scanner;

public class timeConvert {
// prashtn vermaf
    public static String convertTimeTo12HourFormat(String time24) {
        String[] parts = time24.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        String period = (hours < 12) ? "AM" : "PM";

        if (hours == 0) {
            hours = 12; // 0 in 24-hour format is 12 in 12-hour format
        } else if (hours > 12) {
            hours -= 12; // Convert hours greater than 12 to 12-hour format
        }

        // Constructing the 12-hour format time string
        String time12 = String.format("%02d:%02d %s", hours, minutes, period);

        return time12;
    }

    public static void main(String[] args){
        // madhu ka code hai ye ise copy nahi liya maine khdi se likha hian
        Scanner sc = new Scanner(System.in);


        int tc = sc.nextInt();
        while(tc-->0){



            String str = sc.next();
            System.out.println(convertTimeTo12HourFormat(str));




        }
    }
}