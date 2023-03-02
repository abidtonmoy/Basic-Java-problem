
package homework01.pkg03.pkg22;

import java.util.Scanner;
public class HW4 {
    
    public static void main(String[] args) {
        
        int num1,num2,num3,largest;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three positive number");
        
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        input.close();
        
        if( num1 > num2 && num1 > num3 )
            
            largest = num1;
        else if( num2 > num1 && num2 > num3 )
            largest = num2;
        else
            largest = num3;
        
        System.out.println("The largest number is " +largest);
    }
    
}
