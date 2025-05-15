import java.util.Scanner;

class InputDemo{
	public static void main(String[] args){
		String name;
		int age;
		byte marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("Hi Enter your Name: ");
		name=sc.nextLine();
		System.out.println("Hello "+name+" , How are you?");
		System.out.println("Hi Enter your Age: ");
		age=sc.nextInt();
		System.out.println("Are you "+age+" , huh!!");
		
		System.out.println("Enter your Marks: ");
		age=sc.nextByte();
		System.out.println("Oh good "+age+" , super");
	}
}