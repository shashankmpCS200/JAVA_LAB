import java.math.*;

class solution{
	double a,b,c;
	solution(double i,double j,double k){
		a=i;b=j;c=k;
	}
	void sol(){
	double D=(b*b-4*a*c);
	double x1,x2;	
	if(D<0){
		x1=-b/2*a;
		x2=(D/2*a);
		System.out.println("IMAGINARY ROOT ARE"+" "+x1+"+i"+"("+x2+")"+" AND "+x1+"-i"+"("+x2+")"+"\n");
	}
	else if(D==0){
		
		x1=x2=(-b/2*a);
		System.out.println("THE SOLUTION ARE REAL AND EQUAL"+" "+x1+" "+x2+"\n");
	}
	else{
		x1=(-b+Math.sqrt(D))/2*a;
		x2=(-b-Math.sqrt(D))/2*a;
		System.out.println("THE SOLUTIONS ARE"+" "+x1+" "+x2+"\n");
	}
  }
}

class week1{
	public static void main(String args[]){
		solution s1=new solution(1,2,-3);
		solution s2=new solution(1,2,1);
		solution s3=new solution(1,1,1);
		s1.sol();
		s2.sol();
		s3.sol();
	}
}
		

		
