public abstract class Pet {
    String name;
    int age;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: "+name+" | Age: "+age;
    }
}
