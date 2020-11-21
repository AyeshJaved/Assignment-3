import javax.swing.JOptionPane;

public class Circle extends Shape
{
	double radius;
	Circle()
	{
		this.radius=1.0;
		
	}
	Circle(double r)
	{
		radius=r;
	}
	Circle(String c,boolean f,double ra)
	{
		super.color=c;
		super.filled=f;
		this.radius=ra;
	}
	public double getradius()
	{
		return radius;
	}
	public void setradius(double d)
	{
		radius=d;
	}
	public double getArea()
	{
		return (Math.PI*radius*radius);
	}
	public double getParimeter()
	{
		return (2*Math.PI*radius);
	}
	public String toString()
	{
		return "A circle with Radius "+radius+" which is subclass of shape "+super.toString();
	}
	/*public void input()
	{
		String x = JOptionPane.showInputDialog("Enter radius: ");
		radius =Float.parseFloat(x); 
	}*/
}