package mooc.vandy.java4android.calculator.logic;

/**
 * Created by ali-d on 10/21/2016.
 */

public class Operation {
    // To save code repetition, i have used this class as a father class for the other classes

    // initial variables
    private int firstNum=0;
    private int secondNum=0;

    // Constructor to set the variables
    public Operation(int firstNum,int secondNum){
        setFirstNum(firstNum);
        setSecondNum(secondNum);
    }
    // Setter
    public void setFirstNum(int firstNum){
        this.firstNum=firstNum;
    }
    // Setter
    public void setSecondNum(int secondNum){
        this.secondNum=secondNum;
    }
    // Getter
    public int getFirstNum(){
        return firstNum;
    }
    // Getter
    public int getSecondNum(){
        return secondNum;
    }
}
