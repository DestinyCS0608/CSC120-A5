/**
 * CSC 120 Assignment: A-5 Putting It All Together
 * Author: Destiny Cecchi Samuels
 */


/**
 * A public class called Engine that represents a locomotive engine
 * that holds information about fuel type, current fuel levels and max fuel levels.
 */
public class Engine {

    private FuelType fuelType; // private fuel type attribute 
    double currentFuelLevel; // double current fuel level
    double maxFuelLevel; // double max fuel level

    /**
     * Constructs an Engine object with the attributes fuel type, current fuel level, and maximum fuel level.
     * @param fuelType The type of fuel the Engine uses.
     * @param currentFuelLevel The current fuel level in the engine.
     * @param maxFuelLevel The maximum level of fuel that the engine can have
     */
    public Engine(FuelType fuelType, double maxFuelLevel, double currentFuelLevel){
        this.fuelType = fuelType;
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel; 
    }

    /**
     * Gets the type of fuel that the engine is using.
     * @return the fuel type of the engine
     */
    public FuelType getFuelType(){
        return fuelType;
    }

    /**
     * Gets the current level of fuel in the engine.
     * @return the current fuel level of the engine.
     */
    public double getCurrentFuelLevel(){
        return currentFuelLevel;
    }

    /**
     * Gets the mathe maximum level of fuel the engine can have.
     * @return the maximum level of fuel the engine.
     */
    public double getMaxFuelLevel(){
        return maxFuelLevel; 
    }

    /**
     * Method that sets the current fuel level to the max fuel level, "refuelling" the train.
     */
    public void refuel(){
        currentFuelLevel = maxFuelLevel;
    }

    /**
     * Method that decreases the current fuel level in 5% increments. 
       Throws an exception when the engine current fuel level reaches 0.
     * Decreases the current fuel level by 5% each time the train goes.
     * @throws RuntimeException When the train runs out of fuel!
     */
    public void go(){
        if (currentFuelLevel > 0 ){
            currentFuelLevel -= maxFuelLevel*(0.05); // decreases current fuel level by 5% 
            System.out.println("Remaining Fuel Level: " + currentFuelLevel);
        } else {
            throw new RuntimeException("Engine is out of fuel!"); 
        }
    }
    
    /**
     * Testing to see if Engine class runs
     */
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 90.0, 100.0);
        try {
            while (true) {
                myEngine.go();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); // Out of fuel
        }
    }
}

