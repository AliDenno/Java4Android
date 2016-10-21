package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {
    
    // TODO - Put your code here.

    // Initial Variables
    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;

    // constructor
    public Building(int length, int width, int lotLength, int lotWidth){
        mLength=length;
        mWidth=width;
        mLotLength=lotLength;
        mLotWidth=lotWidth;
    }
    // length getter
    public int getLength(){
        return mLength;
    }
    //width getter
    public int getWidth() {
        return mWidth;
    }
    // lotLength getter
    public int getLotLength(){
        return mLotLength;
    }
    // lotWidth getter
    public int getLotWidth(){
        return mLotWidth;
    }
    // length setter
    public void setLength(int Length){
        mLength=Length;
    }
    // width setter
    public void setWidth(int Width){
        mWidth=Width;
    }
    // lotLength setter
    public void setLotLength(int LotLength){
        mLotLength=LotLength;
    }
    // lotWidth setter
    public void setLotWidth(int LotWidth){
        mLotWidth=LotWidth;
    }
    // Building area calculating
    public int calcBuildingArea(){
        return mLength*mWidth;
    }
    // Lot area calculations
    public int calcLotArea(){
        return mLotLength*mLotWidth;
    }
    // overriding toString
    public String toString(){
        return "is a Building";
    }
}
