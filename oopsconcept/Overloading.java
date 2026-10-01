package oopsconcept;
class mobile
{
	void access()
	{
		System.out.println("playing games");
	}
}
class vivo extends mobile
{
	void access()
	{
		System.out.println("playing games for relaxation");
	}
}

public class Overloading
{

	public static void main(String[] args)
	{
		mobile m = new vivo();
		m.access();
		}

}
