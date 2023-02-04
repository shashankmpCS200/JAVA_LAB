import java.util.Scanner;

import cie.Internals;
import see.External;
public class Marks {
	
	public static void main(String[] args) {
		   int n;
		   Scanner sc=new Scanner(System.in);
			System.out.println("enter number of students");
			n=sc.nextInt();
			External student[]=new External[n];
			Internals internal[]=new Internals[n];
			int final_marks[][]=new int[n][5];
			for(int i=0;i<n;i++)
			{
				student[i]=new External();
				internal[i]=new Internals();
				System.out.println("Enter Student "+(i+1)+" name and usn and sem respectively");
				student[i].name=sc.next();
				student[i].usn=sc.next();
				student[i].sem=sc.nextInt();
				System.out.println("Enter Internal marks of 5 subject in respective order");
				for(int j=0;j<5;j++)
				{
					
					internal[i].internal_marks[j]=sc.nextInt();
				}
				System.out.println("Enter external marks of 5 subject in respective order");
				for(int k=0;k<5;k++)
				{
					
					student[i].external[k]=sc.nextInt();
				}
			}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<5;j++)
				final_marks[i][j]=internal[i].internal_marks[j]+(int)(student[i].external[j]/2);
			}
			for(int i=0;i<n;i++)
			{
				System.out.println("Name: "+student[i].name);
				System.out.println("USN: "+student[i].usn);
				System.out.println("Sem: "+student[i].sem);
				System.out.println("Marks of the student "+(i+1)+" is");
				for(int j=0;j<5;j++)
				{
					System.out.println(final_marks[i][j]);
				}
			}
	}
}
