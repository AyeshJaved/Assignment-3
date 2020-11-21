import javax.swing.JOptionPane;

public class Rectangle extends Shape
{
	double width;
	double length;
	public
	Rectangle()
	{
		width=1.0;
		length=1.0;
	}
	Rectangle(double w,double l)
	{
		width=w;
		length=l;
	}
	public Rectangle(String c,boolean f,double wi,double le)
	{
		super(c,f);
		width=wi;
		length=le;
	}
	public double getlength()
	{
		return length;
	}
	public void setlength(double l)
	{
		length=l;
	}
	public double getwidth()
	{
		return width;
	}
	public void setwidth(double w)
	{
		width=w;
	}
	public double getArea()
	{
		return length*width;
	}
	public double getParimeter()
	{
		return 2*(length+width);
	}
	public String toString()
	{
		return ("A rectangle length is "+length+" width is "+width+"which is subclass of Shape "+super.toString());
	}
/*void input()
{
	String width1 = JOptionPane.showInputDialog("Enter width: ");
	width =Integer.parseInt(width1); 
	String length1 = JOptionPane.showInputDialog("Enter length : ");
	length =Integer.parseInt(length1);
}*/
}