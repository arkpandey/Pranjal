
public class First_Prog 
{
	public int add(int a,int b)
	{
		return (a+b);
	}

	public int add(int a,int b,int c)
	{
		return a+b+c ;
	}
	
	public static void main(String[] args) 
	{
		
		First_Prog obj= new First_Prog();
		
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10, 20, 30));
		
	

	}

}
