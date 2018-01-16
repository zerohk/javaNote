//Static methods can not be overridden(Method Overriding vs Method Hiding)
class Parent
{
  // Static method in base class which will be hidden in subclass
static void m()
  {
    System.out.println("Static methods cannot b overridden ");
  }

}

class Child extends Parent
{
  static void m()
  {
    System.out.println("Child");
  }
}

class TestStatic
{
  public static void main(String args[])
  {
    Parent p = new Parent();
    Parent c = new Child();
    p.m();

    // As per overriding rules this should call to class Child static
        // overridden method. Since static method can not be overridden, it
        // calls Parent's m1() 
    c.m();
  }
}
