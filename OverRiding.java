

class animal
{
	public void sound()
	{
		System.out.println("Animal makes a sound ");
	}
}
class dog extends animal
{
	public void sound ()
	{
		System.out.println("Dog Barks");
	}
}
class cat extends animal
{
	public void sound()
	{
		System.out.println("Cat meowwws");
	}
}
public class OverRiding {
	

	public static void main(String[] args) 
	{
		animal an1 = new animal();
		animal an2 = new dog();
		animal an3 = new cat();
		an1.sound();
		an2.sound();
		an3.sound();
		
	}

}
