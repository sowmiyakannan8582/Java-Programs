package oopsconcept;

public class Mobile{
	String mobile = "Android";
	int apps = 5;
	void phonecalls()
	{
		System.out.println("Phonecalls");
	}
	void whatsapptext()
	{
		System.out.println("Whatsapptext");
	}
	void playinggames()
	{
		System.out.println("Playinggames");
	}
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.phonecalls();
		m.whatsapptext();
		m.playinggames();
		System.out.println(m.mobile);
		System.out.println(m.apps);
		}
}

