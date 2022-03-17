import java.util.Scanner;
public class ctof {

    public static void main(String[] args) 
    {
        float fahrenheit , celsius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit: ");
       fahrenheit = sc.nextFloat();
        
        sc.close();
        celsius = ((fahrenheit-32)*5)/9; 
        System.out.println("Temperature converted to celsius: "+celsius);
    }
}