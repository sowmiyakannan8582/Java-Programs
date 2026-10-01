package oopsconcept;

public class Constructor {
//	int mark;
//	String name;
//	Constructor(int mark, String name)
//	{
//		this.mark = mark;
//		this.name = name;
//	}
//	void display()
//	{
//		System.out.println(mark+" "+name);
//	}
//	public static void main(String[] args) 
//	{
//		Constructor c = new Constructor(98,"sowmi");
//		c.display();
//
//	}
//
//}
	
	int id;
	String name;
	Constructor(int id, String name)
	{
		this.id= id;
		this.name = name;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String []args)
	{
		Constructor c = new Constructor(56,"shamee");
		c.display();
	
	}
}