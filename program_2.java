import java.util.*;

class student{
	String name;
	String usn;
	int marks[]=new int[3];
	int credits[]=new int[3];
	int i=0,p=0;
         Scanner s=new Scanner(System.in);
	
	student(String s1, String u){
		name=s1; usn=u;
	}

         void entermarks()
        {
          for(i=0;i<3;i++)
          {
           marks[i]= s.nextInt();  	
           credits[i]=s.nextInt();
          } 

	}

	float calculation(){
		System.out.println("Name"+" "+name+" "+"Usn"+" "+usn+"\n");
		int sum=0,sumc=0;
		for(int j=0;j<3;j++){
			if(marks[j]==100) marks[j]=99;
			sum+=((marks[j]/10)+1)*credits[j];
			sumc+=credits[j];
		}
	float f=(sum/sumc);	
	return f;
	}
}

class sgpa200{
	public static void main(String args[]){
		Scanner cin=new Scanner(System.in);
		String s1,u;
		int x,y;

		System.out.printf("ENTER THE USN,NAME,MARKS,CREDITS OF 3 STUDENTS\n");
                s1=cin.nextLine(); 
                u=cin.nextLine();
                student ob1=new student(s1,u);
		
                ob1.entermarks();
		
		System.out.println("The sgpa of student is"+" "+ob1.calculation());
	
	}
}
