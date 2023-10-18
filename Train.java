import java.util.ArrayList;

/**
 * A public class that represents the Train that has attributes of Engine and ArrayList of Cars 
 */
public class Train {
    private final Engine engine;
    private ArrayList <Car> cars = new ArrayList< > ();

    public Train(FuelType fuelType, double maxFuelLevel, int nCars, int maxCapacity){
        this.engine = new Engine(FuelType.ELECTRIC, 90.0, 100.0);
        this.cars = new ArrayList <Car> ();
        int i; 
        for (i=0; i < nCars; i ++) {
            Car newCar = new Car (maxCapacity);
            this.cars.add(newCar);
        }
    }

    /**
     * Returns the engine of the train
     * @return the engine of the train
     */
    public Engine getEngine(){
        return this.engine;
    }

    /**
     * Returns the car at a specified index in the array list of cars
     * @param i the index of the car 
     * @return the car at a specific index
     */
    public Car getCar (int i){
        return this.cars.get(i);
    }

    /**
     * Returns the maximum capacity of the train by adding each car's maximum passenger capacity
     * @return the total capacity of the train
     */
    public int getCarsMaxCapacity(){
        int maximumCapacity = 0;
        for (int i =0; i <this.cars.size(); i++){
            maximumCapacity += this.cars.get(i).getCapacity();
        }
        return maximumCapacity;
    }

    /**
     * Returns the total number of remaining seats on the car by adding each car's remaining seats
     * @return the total number of remaining seats on the train
     */
    public int seatsRemaining(){
        int seatsLeft = 0;
        for (int i = 0; i<this.cars.size(); i++){
            seatsLeft += this.cars.get(i).seatsRemaining();
        }
        return seatsLeft;
    }

    /**
     * Prints the manifest of the train -- listing all the passengers on board
     */
    public void printManifest(){
        for (int i =0; i<this.cars.size(); i++){
            this.cars.get(i).printManifest();
        }
    }

}