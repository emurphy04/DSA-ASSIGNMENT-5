import java.util.Queue;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        PetList petList = new PetList();

        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();

        petList.enqueue(new Cat("John", 1));
        petList.enqueue(new Dog("Buster", 3));
        petList.enqueue(new Dog("Hank", 7));
        petList.enqueue(new Dog("Gerald", 2));
        petList.enqueue(new Cat("Jeremy", 4));
        petList.enqueue(new Cat("Oscar", 1));

        Scanner in = new Scanner(System.in);

        boolean running = true;
        
        while(running){

            System.out.println();
            System.out.println("----------------------------------------------");
            System.out.println();
            System.out.println("Select an option:");
            System.out.println("1. Any");
            System.out.println("2. Dog");
            System.out.println("3. Cat");
            System.out.println("4. See Queue");
            System.out.println("5. Exit");
            System.out.println();

            String choice = in.nextLine();

            switch (choice) {
                case "1":
                    System.out.println();
                    petList.dequeue();
                    break;

                case "2":
                    System.out.println();   
                    petList.dequeueDog();
                    break;

                case "3":
                    System.out.println();
                    petList.dequeueCat();
                    break;
                
                case "4":
                    System.out.println();
                    petList.getQueue();
                    break;
                
                case "5":
                    System.out.println("Have a good day!");
                    running = false;
                    break;
            
                default:
                    System.out.println("Have a good day!");
                    running = false;
                    break;
            }
        }
    }
}
