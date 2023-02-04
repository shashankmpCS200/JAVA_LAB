import java.util.*;

class book{
	String name,author;
	int price,num_page;
	
	book(String n,String a,int p,int np){
		name=n;author=a;
		price=p;num_page=np;
	}

	void get(){
		System.out.println("The details of the objects are name,author,price,no.of.pages");
	}

	public String toString(){
		return name+" "+author+" "+price+" "+num_page;
	}
}

class week4{
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);

		String n,a;int p,np;

		int n1; n1=sc.nextInt();
		
		System.out.println("ENTER NAME,AUTHOR,PRICE,NO.OF.PAGES");
		book b[]=new book[n1];

		for(int i=0;i<n1;i++){
			n=sc.next();
			a=sc.next();
			p=sc.nextInt();
			np=sc.nextInt();
			b[i]=new book(n,a,p,np);
		}

		for(int i=0;i<n1;i++){
			b[i].get();
			System.out.println((i+1)+"th"+" "+"book");
			System.out.println(b[i]);
		}
	}
}
		
