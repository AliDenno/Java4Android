package mooc.vandy.java4android.diamonds.logic;

import android.util.Log;
import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();
    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {

        // TODO -- add your code here
        // print first line of the frame
        headerFooter(size);

        // print upper intermediate lines of the diamond
        for (int lineNumber=1; lineNumber<size; lineNumber++ )
            intermediateLine(size, lineNumber, "top");

        //print central line
        centralLine(size);

        // print lower intermediate lines of the diamond
        for (int lineNumber=1; lineNumber<size; lineNumber++ )
            intermediateLine(size, lineNumber, "bottom");

        // print last line of the frame
        headerFooter(size);

    }

    // TODO -- add your code here
    /**
    * Helper method used to print first and last line of the diamond.
    * Input parameter: size
    * It prints a "+", followed by 2*size "-", then a final "+" and
    * insert a new line character
     * */
    private void headerFooter(int size) {
        mOut.print("+");
        for(int i=0; i<2*size; i++)
            mOut.print("-");
        mOut.print("+\n");
    }

    /**
     * Helper method that prints intermediate lines, except the central one.
     *
     * Input parameters: size, lineNumber, topBottom
     *
     * size: size of the diamond passed by the user
     * lineNumber: Number of line that is going to be built.
     * It is checked for it's parity (if even or odd) in order to determine if
     * "-" or "=" must be used as filler for the line. Its parity is stored in variable
     * called "odd".
     * topBottom: string to determine if the upper part or bottom part of the diamond
     * is beeing built to choose if "/" or "\" must be used
     */
    private void intermediateLine(int size, int lineNumber, String topBottom) {
        int odd = lineNumber%2;
        String leftSideChar, rightSideChar, filler;

        // if "top", then "/" is used for the right and "\" for the left side of the diamond
        if (topBottom.equals("top")) {
            leftSideChar = "/";
            rightSideChar = "\\";
        }
        else {
            leftSideChar = "\\";
            rightSideChar = "/";
        }



        // Starting printing the line
        if (topBottom.equals("top")) {
            // the right filler "=" or "-" is choosen to draw the intermediate line
            odd = lineNumber%2;
            if(odd==1) filler = "=";
            else filler = "-";
            mOut.print("|");
            for (int i = 0; i < size-lineNumber; i++)
                mOut.print(" ");
            mOut.print(leftSideChar);
            for (int i = 0; i < 2 * (lineNumber - 1); i++)
                mOut.print(filler);
            mOut.print(rightSideChar);
            for (int i = 0; i < size-lineNumber; i++)
                mOut.print(" ");
            mOut.print("|\n");
        }
        else {
            // the right filler "=" or "-" is choosen to draw the intermediate line
            odd = (size-lineNumber)%2;
            if(odd==1) filler = "=";
            else filler = "-";
            mOut.print("|");
            for (int i = 0; i < lineNumber; i++)
                mOut.print(" ");
            mOut.print(leftSideChar);
            for (int i = 0; i < 2 * (size-lineNumber-1); i++)
                mOut.print(filler);
            mOut.print(rightSideChar);
            for (int i = 0; i < lineNumber; i++)
                mOut.print(" ");
            mOut.print("|\n");
        }
    }

    /**
     * Helper method to print the central line
     *
     * Input parameter: size
     * Parity of the size is used to determine which filler needs to be used
     * to draw the line, if "=" or "-"
     */
    private void centralLine(int size){
        String filler;
        if(size%2==1)
             filler = "=";
        else filler = "-";
        mOut.print("|<");
        for (int i=0; i<2*(size-1); i++)
            mOut.print(filler);
        mOut.print(">|\n");

    }
}
