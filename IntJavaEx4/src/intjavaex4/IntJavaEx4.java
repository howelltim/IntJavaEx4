package intjavaex4;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class IntJavaEx4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        p("Please provide First Name: ");
        String firstName = sc.nextLine();
        p("Please provide Last Name: ");
        String lastName = sc.nextLine();
        
        p("Please provide birth year: ");
        int year = sc.nextInt();
        sc.nextLine();
        
        p("Please provide birth month: ");
        int month = sc.nextInt();
        sc.nextLine();
        
        p("Please provide birth day: ");
        int day = sc.nextInt();
        sc.nextLine();
        
        LocalDate birthDay = LocalDate.of(year, month, day);
        
        p("Birthday: " + birthDay);
        p("Year: " + birthDay.getYear());
        p("Day of Year: " + birthDay.getDayOfYear());
        p("Day of Week: " + birthDay.getDayOfWeek().toString());
        p("Month: " + birthDay.getMonth().toString());
        
        Calendar cal = Calendar.getInstance();
        
        cal.setTime(Date.valueOf(birthDay));
        cal.add(Calendar.MONTH, 1);
        cal.add(Calendar.DATE, 1);
        p(cal.getTime().toString());
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyy/dd/mm");
        p(sdf.format(cal.getTime()));
    }
    
    public static void p(String msg){
        System.out.println(msg);
    }
}
