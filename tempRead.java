import  java.util.Scanner;

public class tempRead {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;

        System.out.println("Please input a temperature in Fahrenheit: ");
        temp = scanner.nextInt();

        if(temp <= 32){
            System.out.println("Freezing");
        }
        else if(temp <= 50){
            System.out.println("Cold");
        }
        else if(temp <= 85){
            System.out.println("Warm");
        }
        else{
            System.out.println("Hot");
        }

        scanner.close();
    }
}
