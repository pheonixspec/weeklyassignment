public class q6 {
    public static void main(String[] args) {

        double fee = 125000.0;
        double discountPercent = 10.0;
        
        double discount = (discountPercent / 100) * fee;
        
        double discountedPrice = fee - discount;
      
        System.out.println("The original fee is INR " + fee);
        System.out.println("The discounted amount is INR " + discount);
        System.out.println("The discounted price the student will pay is INR " + discountedPrice);
    }
}