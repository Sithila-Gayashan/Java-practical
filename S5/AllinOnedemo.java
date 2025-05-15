class Student {
    String name;
    int marks;

    // Constructor with name only
    public Student(String name) {
        this.name = name;
        this.marks = 0;  // Default marks
    }

    // Constructor with name and marks
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.marks = 0;
    }
}

class Car {
    private String model;

    // Constructor
    public Car(String model) {
        this.model = model;
    }

    // Getter method for model
    public String getModel() {
        return this.model;
    }
}

class AllinOnedemo {
    // Instance method to print messages
    void print(String a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        // Create an instance of AllinOnedemo to call the print method
        AllinOnedemo demo = new AllinOnedemo();

        // Creating Student objects with different constructors
        Student s1 = new Student("Charle");
        Student s2 = new Student();
        Student s3 = new Student("Don", 55);

        // Using the print method to display student details
        demo.print("Name of the student s1 is " + s1.name + " , Marks = " + s1.marks);
        demo.print("Name of the student s2 is " + s2.name + " , Marks = " + s2.marks);
        demo.print("Name of the student s3 is " + s3.name + " , Marks = " + s3.marks);

        // Creating Car objects
        Car c1 = new Car("Mazda");
        Car c2 = new Car("Nissan");

        // Using the print method to display car model details
        demo.print("Model of the Car c1 is " + c1.getModel());
        demo.print("Model of the Car c2 is " + c2.getModel());
    }
}
