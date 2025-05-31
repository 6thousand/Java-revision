public class CountDown {
	static void countdown(int num) {
		if(num<0) {
			return;
		}
		if(num==0) {
			System.out.println("Blast off");
		}
		else {
			System.out.println(num);
			countdown(num-1);
		}
	}
	public static void main(String[] args) {
		long current = System.currentTimeMillis();
		countdown(1000);
		System.out.println(System.currentTimeMillis() - current);
		current = System.currentTimeMillis();
		for(int i = 0; i < 1000; i++){
		    System.out.println(i);
		}
		System.out.println("Blast off");
		System.out.println(System.currentTimeMillis() - current);
	  
	    }

public class DieDemo {
	public static void main(String[] args) {
		Dies dice1=new Dies();
		Dies dice2=new Dies();
		for(int i=0;i<1000;i++) {
			System.out.println("No"+ i +":"+dice1.roll()+"; "+dice2.roll());
		}
	}
}

public class Dies {
	public int roll(){
		return (int)(6*Math.random()+1);
	}
}

public class Factorial {
	static long factorial(int num) {
		if (num == 0|| num ==1) {
			return 1;
		}
		else {
			return num * factorial(num-1);
		}
		
	}
	public static void main(String[] args){
		int num = 8;
		System.out.println("The factorial of 8 is: " + factorial(num));   
	} 
}

public class Purchase {
	public static void main(String[] args) {
		int [] keyboard = {30,40,50};
		int [] USB = {5,8,12};
		int budget = 60;
		int max = -1;
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++)
			{int sum = keyboard[i]+USB[j];
			if(sum<=budget&&sum>max) {
				max = sum;
				}
			}
			}
		System.out.println(max);
	}
}

public class Random {
	public static void main(String[] args) {
		int count = 0;
		int n =100;
		for(int i=0;i<n;i++) {
			double x = Math.random();
			if(x>0.5) {
				count++;				
			}
		}
		System.out.println((double)count/n);
	}
}

public class USMoney {
	private int dollar;//使用private而不是static=>static会导致所有的对象共用同一个值=>static属于类
	private int cents;
	
	public USMoney(int a, int b) {
		setMoney(a,b);
	}
	private void setMoney(int c, int d) {
		this.dollar = c+d/100;
		this.cents = d%100;
	} 
	public int getDollar() {
		return this.dollar;
	}
	public int getCents() {
		return this.cents;
	}
	public USMoney plus(USMoney m) {
		return new USMoney(dollar+m.getDollar(),cents+m.getCents());
	}//USMoney(函数类型) plus(函数名)(USMoney(参数类型) m(对象名))
	public void printMoney() {
		System.out.println(dollar+"Dollar"+cents+"Cents");
	}
}

public class USMoneyDemo {
    public static void main(String[] args){
    	
	USMoney m1 = new USMoney(3, 130);// create the first object
	m1.printMoney(); // check its value
	USMoney m2 = new USMoney(1, 99); // create our second object
	m2.printMoney(); // check its value
	USMoney m3 = m1.plus(m2); //add them together
	m3.printMoney();
    }
}
