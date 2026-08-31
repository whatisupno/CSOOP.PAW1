import java.util.Scanner;

public class ticket{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Please Input # of Tickets: ");

int numTickets = scanner.nextInt();
int totalCost = numTickets * 15;
 

System.out.println("Total Cost: $" + totalCost);

scanner.close();
}
}