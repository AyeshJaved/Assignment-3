import javax.swing.JOptionPane;

public class demoshape
{
	public static void main(String[] args) 
	{
		String co;
		boolean fi;
		double le;
		double len;
		double wi;
		Shape obj=new Shape();
		//obj.setColor("yellow");
		//obj.setfilled(false);
		//obj.input();
		//System.out.println("color is "+ obj.getColor());
		//System.out.println("shape is "+ obj.filled());

		String color1 = JOptionPane.showInputDialog("Enter color name: ");
		co=obj.color =color1; 
		String filled1 = JOptionPane.showInputDialog("Enter filling  : ");
		fi=obj.filled =Boolean.parseBoolean(filled1); 
		System.out.println(obj.toString());
		Circle c=new Circle(co,fi,0.0);
		//c.setradius(3.5);
		//c.input();
		String x = JOptionPane.showInputDialog("Enter radius: ");
		c.radius =Float.parseFloat(x); 
		System.out.println("Area of circle is "+c.getArea());
		System.out.println("Perimeter of circle is "+c.getParimeter());
		System.out.println(c.toString());
		Rectangle r=new Rectangle(co,fi,0.0,0.0);
		//r.setlength(2.5);
		//r.setwidth(1.5);
		//r.input();
		String width1 = JOptionPane.showInputDialog("Enter width: ");
		wi=r.width =Float.parseFloat(width1); 
		String length1 = JOptionPane.showInputDialog("Enter length : ");
		le=r.length =Float.parseFloat(length1);
		//r.Rectangle(co,fi,wi,le);
		System.out.println(r.toString());
		System.out.println("Area of rectangle is "+r.getArea());
		System.out.println("Parimeter of rectangle is  "+r.getParimeter());
		Square s1=new Square(0.0,co,fi);
		//s1.Square(3.5);
		String leng = JOptionPane.showInputDialog("Enter side : ");
		len=s1.length=s1.width =Float.parseFloat(leng);
		System.out.println(s1.toString());
	}

}