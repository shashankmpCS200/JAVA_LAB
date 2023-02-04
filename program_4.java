import java.util.*;
abstract class a{
	double x,y;
	a(double i,double j){
		x=i;y=j;
	}
	
	abstract double area();
}
class rect extends a{
	rect(double i,double j){
		super(i,j);
	}
	double area(){
		return x*y;
	}
}
class tri extends a{
	tri(double i,double j){
		super(i,j);
	}
	double area(){
		return 0.5*x*y;
	}
}
class cir extends a{
	cir(double i){
		super(i,i);
	}
	double area(){
		return 3.14*x*y;
	}
}
class abst_class{
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);

	System.out.println("ENTER LENGTH AND BREADTH");
	double l=sc.nextInt();
	double b=sc.nextInt();
	rect r=new rect(l,b);
	
	System.out.println("ENTER HEIGHT AND BASE");
	double h=sc.nextInt();
	double ba=sc.nextInt();
	tri t=new tri(h,ba);

	System.out.println("ENTER RADIUS");
	double ra=sc.nextInt();
	cir c=new cir(ra);

	
	System.out.println("Area of rectangle is "+r.area());
	
	
	System.out.println("Area of triangle is "+t.area());
	System.out.println("Area of circle is "+c.area());
	}
}
	
	
	
