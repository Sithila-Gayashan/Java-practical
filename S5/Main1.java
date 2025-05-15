//write a java program to create a Car class with private field model,
//provide a getter and setter method for the model.
//In the main Class, Create and object and object of car, set the model name to "Toyota Corrolla"
//and print it

class Car {
    private String model;

    // Getter
    public String getModel() {
        return model;
    }

    // Setter
    public void setModel(String newModel) {
        this.model = newModel;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Car p1 = new Car();
        p1.setModel("Toyota Corolla");
        System.out.println(p1.getModel());  // Use getModel() to access the model
    }
}
