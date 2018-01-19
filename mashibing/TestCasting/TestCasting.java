class Animal
{
  String name;
  public Animal(String name)
  {
    this.name = name;
  }

  private void eat()
  {
    System.out.println("I can eat");
  }
}

class Dog extends Animal
{
  String furColor;
  public Dog(String name,String furColor)
  {
    super(name);
    this.furColor = furColor;
  }
  public void run()
  {
    System.out.println("I can run");
  }
}

public class TestCasting
{
  public static void main(String[] args)
  {
    Animal a = new Animal("animal_1");
    Animal b = new Dog("dog_1","black");
    Dog c = new Dog("dog_2","yellow");
    //Dog d = new Animal("animal_2");
    System.out.println(a instanceof Animal);
    System.out.println(b instanceof Animal);
    System.out.println(b instanceof Dog);
    System.out.println(c instanceof Animal);
    System.out.println(c instanceof Dog);

    Animal d = (Animal)c;
    //d.run(); error
    //d.eat();

    //可以参考这篇博文
    //https://www.cnblogs.com/tinyphp/p/3713299.html


  }
}
