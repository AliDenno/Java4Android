package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House 
       extends Building {
       
    // TODO - Put your code here.
    // Initial Variables
    private String mOwner = null;
    private boolean mPool = false;
    // constructor
    public House(int length, int width, int lotLength, int lotWidth){
        super(length,width,lotLength,lotWidth);
    }
    // constructor with setting owner
    public House(int length, int width, int lotLength, int lotWidth, String owner){
        super(length,width,lotLength,lotWidth);
        mOwner=owner;
    }
    // constructor with setting owner and pool
    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean
            pool){
        super(length,width,lotLength,lotWidth);
        mOwner=owner;
        mPool=pool;
    }
    // owner getter
    public String getOwner(){
        return mOwner;
    }
    // pool getter
    public boolean hasPool(){
        return mPool;
    }
    // owner setter
    public void setOwner(String Owner){
        mOwner = Owner;
    }
    // pool setter
    public void setPool(boolean Pool){
        mPool = Pool;
    }
    /*
        Override the toString() method of the Building class by defining your own toString()
        method in the House class. Formatting suggestions can be seen in the sample output at
        the bottom of the file. Use the calcBuildingArea() and calcLotArea() methods to
        determine if the lot has a socalled
        big "open space" by checking if the lot area is larger
        than the building area. If the lot does have such a big open area, then append "; has big
        open space" to the string output.

     */
    // override toString
    public String toString() {
        String retVal="Owner: ";
        if (mOwner != null) {
            retVal += getOwner();
        } else {
            retVal += "n/a";
        }
        if (hasPool()) {
            retVal += "; has pool";
        }
        if (calcBuildingArea() < calcLotArea()) {
            retVal += "; has a big open space";
        }
        return retVal;
    }
    // equals implementation
    public boolean equals(House Object){
        if(Object.calcBuildingArea()== this.calcBuildingArea() && Object.hasPool()==this.hasPool())
            return true;
        else
            return false;
    }
}
