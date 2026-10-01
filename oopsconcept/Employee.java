package oopsconcept;

class job
{
private String name;
private int id;
private int salary;
public String getname()
{
	return name;
}
public void setname(String name)
{
	this.name=name;
}
public int getid()
{
	return id;
}
	public void setid(int id)
	{
		this.id=id;
	}
public int getsalary()
{
	return salary;
}
public void setsalary(int salary)
{
	this.salary = salary;
}

public class Employee {
		

	public static void main(String[] args) 
	{
		job j = new job();
		j.setname("shamee");
		System.out.println(j.getname());
		j.setid(2005);
		System.out.println(j.getid());
		j.setsalary(23000);
		System.out.println(j.getsalary());
		
		

	}
	
	}
}
	


