
package homework01.pkg03.pkg22;

import java.util.Scanner;
public class HW2 {
    
    public static void main(String[] args) {
        
       int number;
       Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        
       number = input.nextInt();
       input.close();
       
       if(number>0){
           System.out.println("The number is positive");
       }
       else
       {
           System.out.println("The number is negative");
       }
    }
    
}
