package DateProgram;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Starting tests...");
        Result result = JUnitCore.runClasses(DateProgram.Test1.class);
		
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Completed tests.");
    }
    
    Date d1 = new Date(2017, 12, 25);
    Date d2 = new Date(2017, 11 ,25);
    Date d3 = new Date(2017, 4, 4);
    
    @Test
    public void test() {
        assertEquals(30, d1. daysTo(d2));
    }
    
    @Test
    public void test1() {
        assertEquals(300, d1.daysTo(d3));
    }
    
    @Test
    public void test2() {
        assertEquals(400, d3.daysTo(d2));   
    }    
}
