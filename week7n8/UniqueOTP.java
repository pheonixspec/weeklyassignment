import java.util.Random;
import java.util.HashSet;

public class UniqueOTP {
    public static String generateOTP() {
        Random rand = new Random();
        StringBuilder otp = new StringBuilder();
        HashSet<Integer> used = new HashSet<>();
        
        while (otp.length() < 6) {
            int digit = rand.nextInt(10);
            if (!used.contains(digit)) {
                otp.append(digit);
                used.add(digit);
            }
        }
        
        return otp.toString();
    }
    
    public static void main(String[] args) {
        System.out.println("Generating 10 unique 6-digit OTPs:\n");
        
        HashSet<String> allOTPs = new HashSet<>();
        
        for (int i = 1; i <= 10; i++) {
            String otp = generateOTP();
            allOTPs.add(otp);
            System.out.println("OTP " + i + ": " + otp);
        }
        
        System.out.println("\nTotal unique OTPs: " + allOTPs.size());
    }
}
