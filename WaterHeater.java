
import java.util.Date;

/**
 * Represents a service call to fix a water heater until
 */
public class WaterHeater extends ServiceCall {

    protected final static double UNRESOLVED = -1  ;  //Flag to indicate this hasn't been resolved so we don't have a fee yet

    protected String resolution;
    protected final static double extraFee = 20.00;
    protected double age;
    public WaterHeater(String serviceAddress, String problemDescription, Date date, double age) {
        super(serviceAddress, problemDescription, date);
        this.age = age;
    }

    @Override
    public String toString(){
        return "Water Heater Service Call " + "\n" +
                "Service Address = " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Age = " + age + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolution + "\n" +
                "Resolution = " + resolution + "\n" +
                "Service Charge = " + fee + "\n" +
                "Mandatory Fee = " + extraFee;
    }
}