package logic;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {

		String name1 ="Student1";
		String name2 ="Student2";
		String name3 ="Student3";

		Scanner sc = new Scanner(System.in);
		System.out.println("Student1 marks in each subject");
		System.out.println("Enter 1st sem maths marks");
		int math1= sc.nextInt();

		System.out.println("Enter 1st sem Science marks ");
		int science1= sc.nextInt();
		System.out.println("Enter 1st sem English marks");
		int english1= sc.nextInt();
		int a1=math1+science1+english1;
		System.out.println("Student1 1st sem Total Marks :"+a1);
		System.out.println("Enter 2nd sem maths marks");
		int math12= sc.nextInt();
		System.out.println("Enter 2nd sem Science marks ");
		int science12= sc.nextInt();
		System.out.println("Enter 2nd sem English marks");
		int english12= sc.nextInt();
		int a2=math12+science12+english12;
		System.out.println("Student1 2nd sem Total Marks :"+a2);
		int a=a1+a2;
		System.out.println("semister 1"+"\nMaths   :"+math1+"\nScience :"+science1+"\nEnglish :"+english1);
		System.out.println("semister 2"+"\nMaths   :"+math12+"\nScience :"+science12+"\nEnglish :"+english12);
		System.out.println("1st and 2nd Total Marks :"+a);

		System.out.println("\nStudent2 marks in each subject");
		System.out.println("Enter 1st sem maths marks");
		int math2= sc.nextInt();
		System.out.println("Enter 1st sem Science marks ");
		int science2= sc.nextInt();
		System.out.println("Enter 1st sem English marks");
		int english2= sc.nextInt();
		int b1=math2+science2+english2;
		System.out.println("Student2 1st sem Total Marks :"+b1);
		System.out.println("Enter 2nd sem maths marks");
		int math22= sc.nextInt();
		System.out.println("Enter 2nd sem Science marks ");
		int science22= sc.nextInt();
		System.out.println("Enter 2nd sem English marks");
		int english22= sc.nextInt();
		int b2=math22+science22+english22;
		System.out.println("Student2 2nd sem Total Marks :"+b2);
		int b=b1+b2;
		System.out.println("semister 1"+"\nMaths   :"+math2+"\nScience :"+science2+"\nEnglish :"+english2);
		System.out.println("semister 2"+"\nMaths   :"+math22+"\nScience :"+science22+"\nEnglish :"+english22);
		System.out.println("1st and 2nd Total Marks :"+b);

		System.out.println("\nStudent3 marks in each subject");
		System.out.println("Enter 1st sem maths marks");
		int math3= sc.nextInt();
		System.out.println("Enter 1st sem Science marks ");
		int science3= sc.nextInt();
		System.out.println("Enter 1st sem English marks");
		int english3= sc.nextInt();
		int c1=math3+science3+english3;
		System.out.println("Student3 1st sem Total Marks :"+c1);
		System.out.println("Enter 2nd sem maths marks");
		int math32= sc.nextInt();
		System.out.println("Enter 2nd sem Science marks ");
		int science32= sc.nextInt();
		System.out.println("Enter 2nd sem English marks");
		int english32= sc.nextInt();
		int c2=math32+science32+english32;
		System.out.println("Student3 2nd sem Total Marks :"+c2);
		int c=c1+c2;
		System.out.println("semister 1"+"\nMaths   :"+math3+"\nScience :"+science3+"\nEnglish :"+english3);
		System.out.println("semister 2"+"\nMaths   :"+math32+"\nScience :"+science32+"\nEnglish :"+english32);
		System.out.println("1st and 2nd Total Marks :"+c);
		int d=a+b+c/3;
		System.out.println("\nAverage Marks of 3 Students :"+d);
		System.out.println("\nStudent1 Percentage :"+a/3);
		System.out.println("\nStudent2 Percentage :"+b/3);
		System.out.println("\nStudent3 Percentage :"+c/3);

		System.out.println("Top 1 Consistents are");

		if(a2/3>b2/3 && a2/3>c2/3)
		{
			System.out.println("Student1 is Top1");
		}
		else if(b2/3>c2/3 && b2/3>a2/3)
		{
			System.out.println("Student2 is Top1");
		}
		else if(c2/3>a2/3 && c2/3>b2/3)
		{
			System.out.println("Student3 is Top1");
		}
		else
		{
			System.out.println("all are equal ");
		}
		System.out.println("Top 2 Consistents are");

		if(a2/3>b2/3 && a2/3<c2/3)
		{
			System.out.println("Student1 is Top2");
		}
		else if(b2/3>c2/3 && b2/3<a2/3)
		{
			System.out.println("Student2 is Top2");
		}
		else if(c2/3>a2/3 && c2/3<b2/3)
		{
			System.out.println("Student3 is Top2");
		}
		else
		{
			System.out.println("all are equal ");
		}




















	}

}
