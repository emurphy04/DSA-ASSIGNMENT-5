import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class PetList {
    Queue<Pet> PetList;
    public PetList(){
        this.PetList = new LinkedList<Pet>();
    }

    public void enqueue(Pet i){
        PetList.add(i);
        System.out.println(i.getName()+" has been added to the queue.");
    }

    public void dequeue(){
        try {
            System.out.println(PetList.peek().getName()+" has been removed to the queue.");
            PetList.remove();
        } catch (Exception NoSuchElementException) {
            System.out.println("No such element exists...");
        }
    }

    public void dequeueDog(){
        Iterator<Pet> pets = PetList.iterator();
        while (pets.hasNext()) {
            Pet pet = pets.next();
            if (pet instanceof Dog) {
                pets.remove();
                System.out.println(pet.getName()+" has been removed from the queue.");
                break;
            }
        }
    }

    public void dequeueCat(){
        Iterator<Pet> pets = PetList.iterator();
        while (pets.hasNext()) {
            Pet pet = pets.next();
            if (pet instanceof Cat) {
                pets.remove();
                System.out.println(pet.getName()+" has been removed from the queue.");
                break;
            }
        }
    }

    public String peek(){
        if (PetList.peek() == null) {
            return "Queue is empty";
        } else {
            return PetList.peek().toString();
        }
    }

    public int getSize(){
        return PetList.size();
    }

    public void getQueue(){
        Iterator<Pet> pets = PetList.iterator();
        while (pets.hasNext()) {
            Pet pet = pets.next();
            System.out.println(pet.toString());
        }
    }
}
