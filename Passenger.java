

/**
 * Class representing a Passenger
 * Stores information about individual passenger and their action
 */
public class Passenger {
    private String name;

    /**
     * Creates a new passenger with its name.
     * @param name the name of the passenger 
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the passenger name
     * @return the name of the passenger
     */
    public String getName(){
        return name;
    }

    /**
     * Gets the name of the passenger as a String 
     * @return the name of the passenger as a String
     */
    public String toString() {
        return name;
    }

    /**
     * Method that adds passenger to the car passenger list
     * @param car the car to board
     * @throws RunTimeException If car is already full, prints out an error message.
     */
    public void boardCar (Car car){
        try {
            car.addPassenger(this);
            System.out.println(name + "has boarded the car!");
        } catch (RuntimeException rte) {
            System.out.println(rte.getMessage());
        }

    }

    /**
     * Methods that removes the passenger from the car 
     * @param car the car the passenger gets off at 
     */
    public void getOffCar(Car car){
        try {
            car.removePassenger(this);
            System.out.println(name + " has gotten off the car.");
        } catch (RuntimeException rte) {
            System.out.println(rte.getMessage());
        }
    }

}
