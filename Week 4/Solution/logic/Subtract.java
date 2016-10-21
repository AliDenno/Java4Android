package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract extends Operation implements OperationInterface  {
    // TODO -- start your code here

    // Constructor that pass arguments to the father class to initiate setters and getters
    public Subtract(int firstNum,int secondNum){
        super(firstNum,secondNum);
    }

    // Processing the Operation of Substractions
    public String processOperation(){
        return String.valueOf(getFirstNum()- getSecondNum());
    }
}
