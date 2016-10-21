package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply extends Operation implements OperationInterface{
    // TODO -- start your code here

    // Constructor that pass arguments to the father class to initiate setters and getters
    public Multiply(int firstNum,int secondNum){
        super(firstNum,secondNum);
    }

    // Processing the Operation of Multiplication
    public String processOperation(){
        return String.valueOf(getFirstNum()* getSecondNum());
    }
}
