package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage 
       extends House {
       
    // TODO - Put your code here.
    // Initial Variables
    private boolean mSecondFloor;
    // constructor
    public Cottage(int dimension, int lotLength, int lotWidth){
        super(dimension,dimension,lotLength,lotWidth);
    }
    // constructor
    public Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean
            secondFloor){
        super(dimension,dimension,lotLength,lotWidth);
        mSecondFloor=secondFloor;
    }
    // getter
    public boolean hasSecondFloor(){
        return mSecondFloor;
    }
    // override toString
    public String toString(){
        String output = "Owner: ";

        if (getOwner() != null) {
            output += getOwner();
        } else {
            output += "n/a";
        }
        if (hasPool()) {
            output += "; has a pool";
        }

        if (this.calcLotArea() > this.calcBuildingArea()) {
            output += "; has a big open space";
        }

        if (this.hasSecondFloor()) {
            output += "; is a two story cottage";
        } else {
            output += "; is a cottage";
        }

        return output;
    }
}

