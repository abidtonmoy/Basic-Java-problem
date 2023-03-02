
package homework01.pkg03.pkg22;

import java.util.Scanner;
public class HW3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int year = input.nextInt();
        
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println("This year is leap year");
        }
            
        
        else{
            System.out.println("Not leap year");
        }
        
    
    }
    
}
