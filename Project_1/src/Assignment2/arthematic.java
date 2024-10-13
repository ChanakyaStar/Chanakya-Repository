package Assignment2;
public class arthematic 
{
public int multi (int a, int b)
	{
		int c;
		c=a*b;
		return c;
	}
public int sub (int d , int e)
{
	int f;
	f=d-e;
	return f;
	}
	public int sum (int g, int h)
	{
		int i;
		i= g+h;
		return i;
		
	}
	public void div(int m, int n)
	{
		int result;
		result=m/n;
		System.out.println(" Final Result is "+ result );
	}
	public static void main(String[] args) {
		arthematic obj=new arthematic();
		int multiresult=obj.multi(10, 2);
		int subresult=obj.sub(multiresult, 2);
		int subresult2=obj.sub(subresult, 2);
		int sumresult=obj.sum(subresult2, 2);
		obj.div(sumresult, 2);
	}
}

