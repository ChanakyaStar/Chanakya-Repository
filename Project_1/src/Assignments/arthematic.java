package Assignments;
public class arthematic
{
	public int sum (int a , int b)
	{
		int c;
		c=a+b;
		return c;
		}
	public int sub (int d,int e)
	{
		int f;
		f=d-e;
		return f;
	}
public int mult (int g, int h)
{
int k;
k=g*h;
return k;
}
public void div (int m, int n)
{
int result;
	result=m/n;
	System.out.println("Final Result is " + result);
}
public static void main(String[] args)
{
	arthematic ob =new arthematic();
	int sumresult= ob.sum(10, 2);
	int subresult=ob.sub(sumresult, 2);
	int sumresult2=ob.sum(subresult, 2);
	int multresult=ob.mult(sumresult2, 2);
ob.div(multresult, 2);
}}
