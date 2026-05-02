import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        System.out.print("From City: ");
        String fromCity = input.next();
        System.out.print("Via City: ");
        String viaCity = input.next();
        System.out.print("To City: ");
        String toCity = input.next();
        
        System.out.print("Distance From to Via (Miles): ");
        double fromToVia = input.nextDouble();
        System.out.print("Distance Via to Final (Miles): ");
        double viaToFinalCity = input.nextDouble();
        
        System.out.print("Time From to Via (Minutes): ");
        double time1 = input.nextDouble();
        System.out.print("Time Via to Final (Minutes): ");
        double time2 = input.nextDouble();
        
        double totalDistanceMiles = fromToVia + viaToFinalCity;
        // Converting Miles to KM (1 Mile = 1.60934 KM)
        double totalDistanceKm = totalDistanceMiles * 1.6; 
        double totalTime = time1 + time2;
        
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistanceKm + " km and the Total Time taken is " + totalTime + " minutes");
    }
}