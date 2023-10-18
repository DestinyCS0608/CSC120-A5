import java.util.ArrayList;

/**
 * Class representing a train car
 * Is used a a container for 'Passenger' objects
 */
public class Car {

    private ArrayList <Passenger> passengersOnboard;
    private int maxCapacity;

    /**
     * Constructs a Car object that has max capacity and stores passengers in an array list.
     * @param maxCapacity is the maximum amount of passengers the car can hold.
     */
    public Car(int maxCapacity){
        this.passengersOnboard = new ArrayList <Passenger> ();
        this.maxCapacity = maxCapacity;
    }

    /**
     * Gets the maximum amount of passengers the car can hold.
     * @return the maximum capacity of passengers
     */
    public int getCapacity(){
        return this.maxCapacity;

    }

    /**
     * Method that calculates the amount of seats left available in the car.
     * @return the amount of seats left in the car 
     */
    public int seatsRemaining(){
        return this.maxCapacity - this.passengersOnboard.size();
    }

    /**
     * Method that adds a passenger to the car
     * @param passenger is the passenger to be added
     * @throws RuntimeException when there are no seats remaining in the car
     * @throws RuntimeExceotion when the passenger is already in the car
     */
    public void addPassenger(Passenger passenger ){
        if (seatsRemaining() == 0){
            throw new RuntimeException("This car has no more seats available!" + passenger + "This passenger can not board this car.");
        } else if (this.passengersOnboard.contains(passenger)) {
            throw new RuntimeException(passenger + " is already on this car.");
        } else {
            this.passengersOnboard.add(passenger);
            System.out.println(passenger + "boarded the car!");
            this.seatsRemaining(); 
            System.out.println("The remaining seats left are: " + seatsRemaining());
        }       
    }

    public void removePassenger(Passenger passenger){
        if (seatsRemaining() == 0) {
            throw new RuntimeException("There are no passengers on this car.");
        } else if (!this.passengersOnboard.contains(passenger)) {
            throw new RuntimeException(passenger + "is not on this car.");
        } else {
            this.passengersOnboard.remove(passenger);
        }
    }

    public void printManifest (){
        if (seatsRemaining() >0) {
            System.out.println("Passenger Manifest: ");
            for( int i = 0; i <passengersOnboard.size(); i++) {
                System.out.println(passengersOnboard.get(i) + " ");  // for loop that prints the passengers on board in the array list as a string
            }
        } else {
            System.out.println("This car is EMPTY!");
        }
    }

    /**
     * Testing to see if print manifest works
     * @param args
     */
    public static void main(String[] args) {
        Car myCar = new Car(10);
        myCar.printManifest();
        Passenger destiny = new Passenger("destiny");   
        myCar.addPassenger(destiny);
        Passenger shaq = new Passenger("shaq");
        myCar.addPassenger(shaq);
        myCar.printManifest();
    }
}


// To help with line 60: ArrayList "does not contain" :
// https://stackoverflow.com/questions/15730134/opposite-of-contains-does-not-contain