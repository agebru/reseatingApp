package delta.engine.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import delta.engine.dao.FlightStore;
import delta.engine.model.Flight;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       List<Flight> flightData=FlightStore.loadAllFligths();
       
       // all flights
       System.out.println("All Flights:\n ========================================\n");
       flightData.stream().forEach(System.out::println);
       
       //only flights to Atlanta
       System.out.println("\n=======================================================================================================\n\n"
       		+ " Flights to Atlanta\n ========================================\n");
       flightData.stream()
       .filter(fl->fl.getTo().equals("Atlanta"))
       .forEach(System.out::println);
       
       
       System.out.println("\n\n Printing Date Formats");
       
       //Note: Month should be in Capital==>MM
       DateFormat sdf=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
         Date now=new Date();
       String mydf=sdf.format(now);
       
       System.out.println("Today's Date is ===> : "+mydf);
       
       
       
       /// Date Conversion
       LocalDateTime toDay = LocalDateTime.now();
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
       System.out.println("Today's LocalDateTime: "+toDay.format(formatter));
       
       
       
       DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
       LocalDate ldate=LocalDate.of(1989, Month.MAY, 21);       
       System.out.println("Today's LocalDate: "+ldate.format(formatter2));
       
       
         
       
       
       
       
    }
}
