public class HotWheels {
    /**
     * instance variable - make/brand of hot wheel car
     */
    private String make;

    //Constructor
    public HotWheels(String make) {
        this.setMake(make);
    }

    //Default Constructor
    public HotWheels() {
    
        this("default make");
    }


    // Mutators & Accessors
    // getter for make
    public String getMake() {
        return this.make;
    }

    // setter for make
    public void setMake(String make) {
        this.make = make;

    }
    //Override toString method to provide a string representation of the HotWheels object
    @Override
    public String toString() {
        return "HotWheels{" +
                ", make =" + make +
                '}';

    }
    
    public boolean equals(HotWheels otherHotWheels) {

        if (otherHotWheels == null) {
            return false;
        }
        return this.make.equals(otherHotWheels.make);
    }
}
