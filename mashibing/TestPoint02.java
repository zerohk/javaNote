//
class Point
{
	double x;
	double y;
	double z;
	
	Point(double _x,double _y,double _z)
	{
		x = _x;
		y = _y;
		z = _z;
	}
		
	void setX(double _x)
	{
		x = _x;
	}
	
	void setY(double _y)
	{
		y = _y;
	}
	
	void setZ(double _z)
	{
		z = _z;
	}
	
	double getDistance(Point p)
	{
		return (p.x - x) * (p.x - x) + (p.y - y) * (p.y - y) + (p.z - z) * (p.z - z);
	}
	
	}
	
public class TestPoint02
{
	public static void main(String[] args)
	{
		Point p = new Point(1.0,2.0,3.0);
		Point p1 = new Point(0.0,0.0,0.0);
		System.out.println(p.getDistance(p1));
		
		p.setX(4.0);
		p.setY(5.0);
		p.setZ(6.0);
		
		System.out.println(p.getDistance(new Point(7.0,8.0,9.0)));
	}
}
