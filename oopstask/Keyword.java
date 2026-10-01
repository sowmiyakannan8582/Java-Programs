package oopstask;

public class Keyword {
	String name;
	int id;
	int mark;
	Keyword(int id,String name,int mark)
	{
		this.id= id;
		this.name = name;
		this.mark = mark;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+mark);
	}

	public static void main(String[] args) {
		Keyword k = new Keyword(65,"sowmi",98);
		k.display();
		

	}

}
