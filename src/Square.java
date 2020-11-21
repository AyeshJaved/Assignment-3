public class Square extends Rectangle
{
public Square()
{
	super.length=1.0;
	super.width=1.0;
}
Square(double side)
{
	super.width=super.length=side;
}
Square(double side,String c,boolean f)
{
	super.length=super.width=side;
	super.color=c;
	super.filled=f;
	//filled=f;
}
public void setSide(double side)
{
	super.length=side;
	super.width=side;
}
public double getSide()
{
	return length;
}
public void setwidth(double side)
{
	width=side;
}
public void setlength(double side)
{
	length=side;
}
public String toString()
{
	return ("A Square with side "+getSide()+"which is subclass of Rectangle "+super.toString());
}

}