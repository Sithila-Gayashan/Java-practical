class Student{
	int marks;
	String name;
	
	Student(){
		System.out.println("Default Name");
		name="Default name";
		
	}
	
	Student(String n, int m){
		System.out.println("Creating student object with name "+n+" and marks "+m);
	}
}

class Printer{
	void print (String k){
		System.out.println(k);
	}
	
}

class App{
	
	
	public static void main(String[] args){
		Printer p=new Printer();
		p.print("Welcome to Demo Class App");
		
		
		//System.out.println("Welcome to demo class app");
		
		Student s1=new Student();
		s1.marks=100;
		p.print(s1.name+" , "+s1.marks);
		s1.name="Alice";
		p.print(s1.name+" , "+s1.marks);
		
		Student s2=new Student("John",50);
		//s2.marks=50;
		//s2.name="John";
		p.print(s2.name+" , "+s2.marks);
		
		
	}
}