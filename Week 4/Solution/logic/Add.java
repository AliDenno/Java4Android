package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add extends Operation implements OperationInterface{
    // TODO -- start your code here

    // Constructor that pass arguments to the father class to initiate setters and getters
    public Add(int firstNum,int secondNum){
        super(firstNum,secondNum);
    }

    // Processing the Operation of Addition
    public String processOperation(){
        return String.valueOf(getFirstNum()+ getSecondNum());
    }
}
