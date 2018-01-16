class Animal
{
  public void move()
  {
    System.out.println("Animal can move");
  }
}

class Dog extends Animal
{
  public void move()
  {
    System.out.println("Dog can run fast");
  }

  public void bark()
  {
    System.out.println("Dog can bark");
  }
}

public class TestOverride_1
{
  public static void main(String args[])
  {
    Animal animal = new Animal();
    Animal dog = new Dog();
    animal.move();
    dog.move();
    //dog.bark();
    //error 
  }
}
