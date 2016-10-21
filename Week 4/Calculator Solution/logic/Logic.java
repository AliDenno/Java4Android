package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here
        // The result to be returned
        String retVal="";

        // Switch to apply the different Operations
            switch (operation) {
                // Addition
                case 1:
                    Add addObj = new Add(argumentOne, argumentTwo);
                    retVal = addObj.processOperation();
                    break;
                // Subtraction
                case 2:
                    Subtract subtractObj = new Subtract(argumentOne, argumentTwo);
                    retVal = subtractObj.processOperation();
                    break;
                // Multiplication
                case 3:
                    Multiply multiplyObj = new Multiply(argumentOne, argumentTwo);
                    retVal = multiplyObj.processOperation();
                    break;
                // Division
                case 4:
                    Divide divideObj = new Divide(argumentOne, argumentTwo);
                    retVal = divideObj.processOperation();
                    break;
                // Else
                default:
                    retVal = "well this is embarrassing ... ";
                    break;
            }
            mOut.print(retVal);
        /*
            Note that I altered the getters in the MainActivity so that they return empty fields as zeros
        */
    }
}
