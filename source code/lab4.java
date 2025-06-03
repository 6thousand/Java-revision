import java.util.InputMismatchException;
import java.util.Scanner;

public class InputInteger {
	public static void main(String [] args) {
		Scanner sr = new Scanner(System.in);
		
		try{
			System.out.println("Enter an integer number");
			int input = sr.nextInt();
			System.out.println("The input integer number is: "+ input);
		}
		catch(InputMismatchException e){
			System.out.println("The input should be an integer");
		}
		finally {
			sr.close();
		}
		
		
		
	}
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputIntegerPlus {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter an integer number");
        while(true)
        try{
            int input = sr.nextInt();
            if(input ==0){
                break;
            }else{
                sum = input+sum;
            }
        }
        
        catch(InputMismatchException e){
            System.out.println("The input should be an integer");
            sr.next();//清除无效的输入以防止无限循环
        }
        System.out.println(sum);
        sr.close();
    }
}
