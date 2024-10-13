package Class2;

public class Arthmatic              //Piller 1--Class Creation
{
public int sum (int a,int b)
{
	int c;
	c=a+b;
	System.out.println("Sum result is " + c);
	return c;
}
public int sub (int d , int e)
{
int f;
f=d-e;
System.out.println("Sub result is " +f);
return f;
}
public void mult (int r1 , int r2)
{
	int result;
	result=r1*r2;
	System.out.println("Final Result is " + result);
}
public static void main(String[] args) {
	Arthmatic ob=new Arthmatic();
	int sumresult= ob.sum(10, 20);
	int subresult= ob.sub(8, 2);
	ob.mult(sumresult, subresult);
}

}
