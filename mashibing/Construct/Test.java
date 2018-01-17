class Parent
{
  protected void print(String s)
  {
    System.out.println(s);
  }
  Parent()
  {
    print("Parent method");
  }

  void m()
  {
    print("Parent m()");
  }
}

class Test extends Parent
{
  Test()
  {
    print("Child method");
  }
  void m()
  {
    print("Child m()");
  }

  public static void main(String[] args)
  {
    Test t = new Test();
    t.m();
  }
}
