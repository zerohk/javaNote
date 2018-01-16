class Parent
{
protected void show()
  {
    System.out.println("Parent show()");
  }

  protected void m()
  {

  }
}

class Child extends Parent
{
  public void show()
  {
    System.out.println("Child show()");
  }

  /*private void m()
  {

  }*/
}

class TestOverride_2
{
  public static void main(String args[])
  {
    Parent p = new Parent();
    Parent c = new Child();
    p.show();
    c.show();
  }
}
