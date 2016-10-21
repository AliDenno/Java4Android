package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office 
       extends Building {
       
    // TODO - Put your code here.
    // Initial Variables
    private String mBusinessNam=null;
    private int mParkingSpaces=0;
    private static int sTotalOffice=0;
    // constructor and increasing Totaloffice
    public Office(int length, int width, int lotLength, int lotWidth){
        super(length,width,lotLength,lotWidth);
        sTotalOffice+=1;
    }
    // constructor and setting name
    public Office(int length, int width, int lotLength, int lotWidth, String businessName){
        super(length,width,lotLength,lotWidth);
        mBusinessNam=businessName;
        sTotalOffice+=1;
    }
    // constructor and setting name and space
    public Office(int length, int width, int lotLength, int lotWidth, String businessName,
                  int parkingSpaces){
        super(length,width,lotLength,lotWidth);
        mBusinessNam=businessName;
        mParkingSpaces=parkingSpaces;
        sTotalOffice+=1;

    }
    // getter
    public String getBusinessName(){
        return mBusinessNam;
    }
    // getter
    public int getParkingSpaces(){
        return mParkingSpaces;
    }
    // setter
    public void setBusinessName(String BusinessNam){
        mBusinessNam=BusinessNam;
    }
    // setter
    public void setParkingSpaces(int ParkingSpaces){
         mParkingSpaces=ParkingSpaces;
    }
    // override toString
    public String toString(){
        String retVal = "Business: ";
        if(this.getBusinessName() != null) {
            retVal += mBusinessNam;
        } else {
            retVal += "unoccupied";
        }
        //Get parking space information
        if(this.getParkingSpaces() > 0) {
            retVal += "; has "+ mParkingSpaces + " parking spaces";
        }
        return retVal + " (total offices: " + sTotalOffice + ")";
    }
    // implement equals
    public boolean equals(Office obj){
        if(obj.calcBuildingArea()==this.calcBuildingArea() && obj.getParkingSpaces()==this.getParkingSpaces())
            return true;
        else
            return false;
    }
}
