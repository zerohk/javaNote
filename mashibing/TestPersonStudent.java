class Person
{
	private String name;
	private String location;
	
	Person(String name)
	{
		this.name = name;
		location = "beijing";
	}
	
	Person(String name,String location)
	{
		this.name = name;
		this.location = location;
	}
	
	public String info()
	{
		return
			"name:" + name +
			" location:" + location;
	}
}

class Student extends Person
{
	private String school;
	Student(String name,String school)
	{
		this(name,school,"beijing");
	}
	
	Student(String n,String l,String school)
	{
		super(n,l);
		this.school = school;
	}
	
	public String info()
	{
		return super.info() + 
		" school:" + school;
	}
}

class Teacher extends Person
{
	private String position;
	Teacher(String name,String position)
	{
		this(name,"beijing",position);
	}
	
	Teacher(String n,String l,String position)
	{
		super(n,l);
		this.position = position;
	}
	
	public String info()
	{
		return super.info() +
		" position:" + position;
	}
}


public class TestPersonStudent
{
	public static void main(String[] args)
	{
		Person p1 = new Person("A");
		Person p2 = new Person("B","shanghai");
		Student s1 = new Student("C","s1");
		Student s2 = new Student("C","shanghai","s2");
		Teacher t = new Teacher("D","Professor");
		Teacher t1 = new Teacher("E","changsha","Professor");
		
		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(s1.info());
		System.out.println(s2.info());
		System.out.println(t.info());
		System.out.println(t1.info());
	}
}
