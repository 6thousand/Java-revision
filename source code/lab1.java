public class ForLoop {
	public static void main(String[] args) {
		int n = 10;
		for(int i = 1;i<11;i++) {
			int result = i * n;
			System.out.println(n+ "*" +i +"=" + result);
		}
	}
}

public class IfElse {
	public static void main(String[] args) {
		int n = 99;
		if (n/2!=0) {
			System.out.println("Weird");
		}
		else {
			if(n>=2 && n<=5) {
				System.out.println("Not Weird");
			}
			else if(n>=6 && n<=20) {
				System.out.println("Weird");
			}
			else {
				System.out.println("Not Weird");
			}
		}
	}
}

public class Loops {
	public static void main(String[] args) {
		int a = 0;
		int b = 2;
		int n = 10;
		int sum = a;
		for(int i = 0; i<n; i++) {
			sum += (int)Math.pow(2,i)*b;
			System.out.print(sum+" ");
		}
	}
}
