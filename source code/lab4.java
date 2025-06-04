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

import java.io.*;
import java.util.InputMismatchException;
//buffered reader 使用readline()处理输入，scanner通过多种next方法(nextLine();nextInt())...读取不同类型的数据
//在面对大量文本的时候，bufferedReader效果更佳
class BuffReader {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//注意，bufferedReader不能直接读取System.in=>system.in是byte流，需要先用inputstreamReader转化为character 流
        System.out.println("Enter an integer number: ");
        try{
            int input = Integer.parseInt(br.readLine());//使用readline()方法后，必须要检查IOExceptions.
            System.out.println("The input integer number is "+input);    
        }
        catch(InputMismatchException e){
            System.out.println("The input should be an integer");
        }
        catch(IOException e){
            System.out.println("There is an IO exception");
        }

    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BuffReaderPlus {
        public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//注意，bufferedReader不能直接读取System.in=>system.in是byte流，需要先用inputstreamReader转化为character 流
        System.out.println("Enter an integer number: ");
        int sum = 0;
        while(true){
        try{
            int input = Integer.parseInt(br.readLine());//使用readline()方法后，必须要检查IOExceptions.
            if(input == 0){
                break;
            }
            else{
                sum+=input;
            }
        }
        catch(NumberFormatException e){//注意，Integer.parseInt()抛出的异常为NumFormatException
            System.out.println("The input should be an integer");
        }
        catch(IOException e){
            System.out.println("There is an IO exception");
        }
    }
        System.out.println(sum);


    }
}

//注意读取文件的位置是否位于同一文件夹=>子文件夹是无效的
import java.io.*;

public class UpperCase {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            FileWriter fw = new FileWriter("Output.txt");){
            
            String original;
            while((original = br.readLine())!= null){
            String upperCase = original.toUpperCase();
            fw.write(upperCase);
            }
        }
        catch(FileNotFoundException e){
            System.err.println("Invalid file"+e.getMessage());
        }
        catch(IOException e){
            System.err.println("IO error"+e.getMessage());
            e.printStackTrace();
        }


    }
}
