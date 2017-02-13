
package DateProgram;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Date {
    private int year, month, day;
    
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public int daysTo(Date d2) {
        int daysBetween = 0;
  
        int totalDays = (year * 365) + (month * 30) + day;
        int totalDays2 = (d2.year * 365) +(d2.month *30) + d2.day;
        
        daysBetween = totalDays - totalDays2;
        
        if (daysBetween <0) {
            daysBetween*=-1;
        }
       System.out.println("days: " + daysBetween);
        return daysBetween;
    } 
    
}
