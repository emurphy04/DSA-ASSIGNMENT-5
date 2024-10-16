public class Dog extends Pet{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Name: "+name+" | Age: "+age+" | Dog";
    }
}
