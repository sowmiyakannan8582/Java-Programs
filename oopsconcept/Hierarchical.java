package oopsconcept;
class father
{
void dress()
{
	System.out.println("give dress");
}
}
class mother extends father
{
	void cloth()
	{
	System.out.println("get cloth");
	}
}
class son extends mother
{
	void cloth1()
	{
		System.out.println("give cloth");
	}
	
}
public class Hierarchical {
	public static void main(String[] args) {
		mother m = new mother();
		m.cloth();
		m.dress();
		son s = new son();
		s.cloth1();
		s.dress();
	}
}



