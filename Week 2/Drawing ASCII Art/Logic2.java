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


    public void process(int size) {

        // TODO -- add your code here

        print_frameheader(size);
        print_firsthalf(size);
        print_diamondmid(size);
        print_secondthalf(size);
        mOut.println("");
        print_frameheader(size);

    }

    void print_frameheader(int size){
        mOut.print('+');
        for (int i=0; i<size*2; i++)
        {
            mOut.print("-");
        }
        mOut.print('+');
    }


    void print_diamondmid(int size){

        mOut.println("");
        mOut.print('|');
        mOut.print('<');
        for (int i=0; i<(size*2)-2; i++)
        {
           if(size % 2 == 0)
            mOut.print("-");
            else
               mOut.print("=");
        }
        mOut.print('>');
        mOut.print('|');
    }
    // TODO -- add your code here



    void print_firsthalf(int size){
       int lines = size-1;
       for(int i =0; i < lines; i++){  // this loops define the height of diamond
           mOut.println("");
           mOut.print("|");
            for (int j= lines; j> i ; j--) {mOut.print(" "); } // prints decreasing number of spaces
           mOut.print("/");
                  //mOut.print("/");mOut.print("\\");

           for (int k=1; k<= i*2 ; k++) { // prints increasing number of - or =
               if(i%2==0)
               {mOut.print("=");}
               else mOut.print("-");
               
           }
           mOut.print("\\");
           for (int j= lines; j> i ; j--) {mOut.print(" "); }
           mOut.print("|");
       }
   }

]
    void print_secondthalf(int size){
        int lines = size-1;
        for(int i = lines-1 ; i >= 0; i--) { 
            mOut.println("");
            mOut.print("|");
            for (int j = i; j < lines; j++) { 
                mOut.print(" ");
            }
            mOut.print("\\");
            //mOut.print("/");mOut.print("\\");

            for (int k = i*2 ; k >= 1 ; k--) { //prints decreasing number of - or =
                if (i % 2 == 0) {
                    mOut.print("=");
                } else mOut.print("-");
                //mOut.print("/");mOut.print("\\");
            }
            mOut.print("/");
            for (int j = i ; j < lines ; j++) { //prints increasing number of spaces again
                mOut.print(" ");
            }
            mOut.print("|");
        }
    }
}
