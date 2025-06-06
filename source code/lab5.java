/**
   A class for bank accounts.
   
   This class provides the basic functionality of accounts.
   It allows deposits and withdrawals but not overdraft
   limits or interest rates.   
   @author Stuart Reynolds ... 1999
*/

public class Account
{
    private double bal;  //The current balance
    private int accnum;  //The account number
    
    
    public Account(int a)
    {    
	bal=0.0;
	accnum=a;
    }
    
    public void deposit(double sum)
    {
	if (sum>0)
	    bal+=sum;    
	else
	    System.out.println("Account.deposit(...): "
			       +"cannot deposit negative amount.");    
    }
    
    public void withdraw(double sum)
    {
	if (sum>0)
	    bal-=sum;    
	else
	    System.out.println("Account.withdraw(...): "
			       +"cannot withdraw negative amount.");    
    }
    
    public double getBalance()
    {
	return bal;
    }
    
    public double getAccountNumber()
    {
	return accnum;
    }
    
    public String toString()
    {
	return "Acc " + accnum + ": " + "balance = " + bal;    
    }
    
    public final void print()
    {
	//Don't override this,
	//override the toString method
	System.out.println( toString() );    
    }
    
}

public class Circle extends TwoDShape {
    private double radius =  1.0;
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
}
class Employee extends Person{
    private double salary;
    private int year;
    private String nationalInsuranceNumber;

    public Employee(){
        super();
        this.salary = 0.00;
        this.year = 0;
        this.nationalInsuranceNumber = "NUll";
    }
    public Employee(String name,double salary,int year,String nationalInsuranceNumber){
        super(name);
        this.salary = salary;
        this.year = year;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
    
    public double getAnnualSalary() {
        return salary;
    }

    public int getStartYear() {
        return year;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

}

    public InsertionSort(int[] a) {
        int [] sorted;
        sorted = new int[a.length];
        sorted[0] =  a[0];
        for(int i=1;i<a.length;i++){

        }
    }

    public static void main(String[] args) {
        InsertionSort(1,2,3,4,5,6,7);
    }
}
public interface Moveable {
    void MoveUp();
    void MoveDown();
    void MoveLeft();
    void MoveRight();
}
public class MovePoint implements Moveable{
    private int x;
    private int y;

    public MovePoint(int x,int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void MoveUp(){
        y++;
    }
    @Override
    public void MoveDown(){
        y--;
    }
    @Override
    public void MoveLeft(){
        x--;
    }
    @Override
    public void MoveRight(){
        x++;
    }
    public String getPosition(){
        return "Current position:("+x+","+y+")";
    }
    
}
public class MoveTest {
    public static void main(String[] args) {
        MovePoint point = new MovePoint(0,0);
        point.MoveUp();
        point.MoveDown();
        point.MoveDown();
        point.MoveDown();

        System.out.println(point.getPosition());
    }

}
public class Person
{
	private String name;

	public Person()
	{
		name = "No name yet.";
	}
	public Person(String n)
	{
		name = n;
	}
	public void setName(String newName)
	{
		name = newName;
	}
	public String getName()
	{
		return name;
	}
	public void print()
	{
		System.out.println("Name: " + name);
	}
	public boolean equals(Object p)
	{
	    if(p instanceof Person){
		return this.name.equals(((Person)p).getName());
	    }
	    return false;
	}
}
public class Rectangle extends TwoDShape {
    private double width = 1.0;
    private double height = 2.0;
    @Override
    public double getArea() {
        return width*height;
    }
    @Override
    public double getPerimeter() {
        return  2*(width+height);
    }


}
//抽象类不能被实例化，其必须被继承才可以使用
public abstract class TwoDShape {
    protected String color;
    protected Boolean filled;

    public TwoDShape() {
        color = "white";
        filled = false;
}
    public TwoDShape(String color, Boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public abstract double getArea();

    public abstract double getPerimeter();


}
public class TwoDShapeTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setColor("red");
        System.out.println(c.getColor());
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());

        Rectangle r = new Rectangle();
        r.setColor("blue");
        System.out.println(r.getColor());
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        
    }
}
