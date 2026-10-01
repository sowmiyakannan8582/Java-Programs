package oopsconcept;
interface animal
{
	void makesound();
}
 class dog implements animal
{
	public void makesound()
	{
		System.out.println("bow bow");
	}
}
 class cat implements animal
 {
	 public void makesound()
	 {
		 System.out.println("meow meow");
	 }
 }
 class cow implements animal
 {
	 public void makesound()
	 {
		 System.out.println("maa maa");
	 }
 }
public class Main 
{
	
public static void main(String[] args) 
		{
		animal d = new dog();
		animal b = new cat();
		animal c = new cow();
		d.makesound();
		b.makesound();
		c.makesound();
		}

}
