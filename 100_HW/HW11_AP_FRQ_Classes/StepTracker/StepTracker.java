import java.util.*;

public class StepTracker{
    private int steps;
    private int adays;
    private int days;
    private double average;
    private boolean isActive;
    
    public StepTracker(int a){
        steps = a;
    }
    
    public void addDailySteps(int a){
        if (a >= 10000) {
            isActive = true;
        }
        else {
            isActive = false;
        }
        days = days + 1;
        steps = steps + a;
        average = steps / days;
    }
    public int activeDays(){
        if (isActive) {
            adays = adays + 1;
            return adays;
        }
        else {
            return adays;
        }
    }
    public double averageSteps(){
        return average;
    } 
}