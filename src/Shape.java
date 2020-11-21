import javax.swing.JOptionPane;

public class Shape 
{
String color;
boolean filled;

public Shape()
{
	color="green";
	filled=true;
}
public Shape(String c,boolean f)
{
	this.color=c;
	this.filled=f;
}
public String getColor()
{
	return color;
}
public Boolean filled()
{
	return filled;
}
public void setColor(String s)
{
	color=s;
}
public void setfilled(boolean b)
{
	filled=b;
}

/*void input()
{
		String color1 = JOptionPane.showInputDialog("Enter color name: ");
		color =color1; 
		String filled1 = JOptionPane.showInputDialog("Enter filling  : ");
		filled =Boolean.parseBoolean(filled1); 
}*/
public String toString()
{
	return "color of shape is "+color+" shape is "+filled;
}
}