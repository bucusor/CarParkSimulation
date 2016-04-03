/**
 * This is the Car class, it represents a car that enters, pays and leaves the garage.
 * It has a certain location in the parking garage and a certain amount of time that
 * it stays in the garage.
 */
public abstract class Car {

    // Location for the Car object.
    private Location location;

    // Minutes the car has left for parking.
    private int minutesLeft;

    // Boolean indicating that the car is paying.
    private boolean isPaying;

    /**
     * Constructor for objects of class Car.
     */
    public Car() {

    }

    /**
     * Getter for the location of the Car object.
     * @return Location of the Car object.
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Set the location of a car in the parking garage.
     *
     * @param location Location of the car
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Get the amount of minutes the car is still going to be in the garage.
     *
     * @return int amount of minutes left
     */
    public int getMinutesLeft() {
        return minutesLeft;
    }

    /**
     * Set the amount of minutes the car is going to stay in the garage.
     *
     * @param minutesLeft int amount of minutes the car is going to stay.
     */
    public void setMinutesLeft(int minutesLeft) {
        this.minutesLeft = minutesLeft;
    }

    /**
     * Check if the car is paying at the moment.
     *
     * @return boolean if the car is paying
     */
    public boolean getIsPaying() {
        return isPaying;
    }

    /**
     * Tel the car that it is paying.
     *
     * @param isPaying boolean whether the car is paying or not
     */
    public void setIsPaying(boolean isPaying) {
        this.isPaying = isPaying;
    }

    /**
     * Method for decreasing the minutes the Car object has left for parking.
     */
    public void tick() {
        minutesLeft--;
    }

}