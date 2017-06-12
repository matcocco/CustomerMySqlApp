import java.util.Scanner;

public class CustomersApp {
    public static void main(String[] args) throws Exception {
    	
    	// notice how the main method only calls the class
    	// and the class does all the work. This is a good design.
        MySQLHelper db = new MySQLHelper();
        db.readDataBase();
        Customer cust = new Customer();
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("Enter in Last name to search");
        cust.getLastName(sc.nextLine());
        System.out.println(cust.getCustomerId()+cust.getPosition()); 
    }

}