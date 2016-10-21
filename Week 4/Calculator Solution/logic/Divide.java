package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide extends Operation implements OperationInterface{
    // TODO -- start your code here

    // Constructor that pass arguments to the father class to initiate setters and getters
    public Divide(int firstNum,int secondNum){
        super(firstNum,secondNum);
    }

    // Processing the Operation of Division
    public String processOperation(){
        // Checking for a zero value in the second argument
        if(getSecondNum()==0)
            return "You cannot divide by 0";
        else
            return String.valueOf(getFirstNum() / getSecondNum()+" R: "+getFirstNum() % getSecondNum());
    }
}
