//
public class TestPoint {
	int x;
	int y;
	int z;
	
	TestPoint(int _x,int _y,int _z) {
		x = _x;
		y = _y;
		z = _z;
	}
	
	public void setX(int xSet)
	{
		x = xSet;
	}
	
	public void setY(int ySet)
	{
		y = ySet;
	}
	
	public void setZ(int zSet)
	{
		z = zSet;
	}
	
	public int distanceTo0()
	{
		int distance;
		distance = x * x + y * y + z * z;
		return distance;
	}
	
	public static void main (String[] args)
	{
		TestPoint point = new TestPoint(1,2,3);
		System.out.println("Distance to zero is:" + point.distanceTo0());
		point.setX(4);
		point.setY(5);
		point.setZ(6);
		System.out.println("After set , x = " + point.x + ";y = " + point.y + ";z = " + point.z);
		}
	
}
