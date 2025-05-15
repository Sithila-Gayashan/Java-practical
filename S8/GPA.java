import java.util.Scanner;

class GPA{
	float gradePoint(String grade){
		float gp=0;
		/*if(grade.equals("A+") || grade.equals("A")){
			gp=4;
		}*/
	switch(grade){
		case "A+":
		gp=4;
		break;
		case "A":
		gp=4;
		break;
		case "A-":
		gp=3.7f;
		break;
		case "B+":
		gp=3.4f;
		break;
		case "B":
		gp=3;
		break;
		case "B-":
		gp=2.7f;
		break;
		case "C+":
		gp=2.4f;
		break;
		case "C":
		gp=2;
		break;
		case "C-":
		gp=1.7f;
		break;
		default "NO POINT"
	}
		return gp;
		
	}
}

class Demo{
	public static void main (String[] args){
		String name;
		float ogpa=0;
		String grade;
		float point=0;
		
		Scanner sc=new Scanner(System.in);
		GPA g=new GPA();
		
		System.out.println("Enter your name: ");
		name=sc.nextLine();
		System.out.println("Hi "+name);
		
		System.out.print("Enter IT 1113 Grade: ");
		grade=sc.nextLine();
		point=g.gradePoint(grade);
		ogpa=ogpa+point*3;
		System.out.print("Your Grade is: "+grade+" Your point is: "+point);
		System.out.print("ogpa ="+ogpa);
		
	}
}