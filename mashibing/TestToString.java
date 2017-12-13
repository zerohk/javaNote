//重写object类的toString方法
public class TestToString
{
	public static void main(String[] args)
	{
		Dog d = new Dog();
		System.out.println("d=" + d.toString());
	}
}

class Dog
{
	public String toString()
	{
		return "I am a cool dog";
	}
}
