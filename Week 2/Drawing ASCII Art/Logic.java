package mooc.vandy.java4android.diamonds.logic;

import android.provider.Settings;
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

        //Loops Start
        for (int vertical = 0; vertical < size * 2 + 1; vertical++) {
            for (int horizontal = 0; horizontal < size * 2 + 2; horizontal++) {
                //First and LastLines Horizontally
                if(vertical ==0 || vertical == size*2){
                    if(horizontal == 0 ){
                        mOut.print("+");
                    }
                    else if(horizontal == size*2+1){
                        mOut.println("+");
                    }
                    else{
                        mOut.print("-");
                    }
                }

                // First or Last line vertically
                else if (horizontal == 0){
                    mOut.print("|");}

                else if (horizontal == size*2+1){
                    mOut.println("|");}

                // Middle arrows <>
               else if (vertical == size && horizontal == 1) {
                    mOut.print("<");}

                else if (vertical == size && horizontal == size * 2) {
                    mOut.print(">");}

                // "/" Lines
                else if (horizontal + vertical == size+1 || horizontal + vertical == size*3 ){
                    mOut.print("/");
                }

                // "\" Lines
                else if (horizontal - vertical == size || vertical - horizontal == size-1){
                    mOut.print("\\");
                }

                // "  " Spaces

                else if (vertical + horizontal <size+1){
                    mOut.print(" ");
                }
                else if (horizontal-vertical > size ){
                    mOut.print(" ");
                }
                else if (vertical-horizontal > size -1 ){
                    mOut.print(" ");
                }
                else if (vertical+horizontal > size*3 ){
                    mOut.print(" ");
                }

                //Pyramid  " ---" " ===="
                else if(vertical%2==0){
                    mOut.print("-");
                }
                else if(vertical%2==1){
                    mOut.print("=");
                }

            }
        }

       /*
        for (int indexV = 0; indexV < size * 2 + 1; indexV++) {

            if (indexV == 0 || indexV == size * 2) {
                System.out.print("+");
            } else {
                System.out.print("|");
            }


            for (int indexH = 0; indexH < size * 2 + 1; indexH++) {

                if (indexV == 0) {
                    if (indexH < size * 2) {
                        System.out.print("-");
                    } else {
                        System.out.println("+");
                        //mOut.println();
                    }
                } else if (indexV == size * 2) {
                    if (indexH < size * 2) {
                        System.out.print("-");
                    } else {
                        System.out.print("+");
                    }


                } else if (indexV == size && indexH == 0) {
                    System.out.print("<");
                } else if (indexV == size && indexH == size * 2 - 1) {
                    System.out.print(">");
                } else if (indexH == size * 2) {
                    System.out.println("|");
                    //mOut.println();
                }

                else if (indexV != size && indexV != 0 && indexV != size * 2) {//centre of the pyramid /\
                    //Left top
                    if (indexV < size && indexH < size){
                        System.out.print("/");
                    }
                    //Right top
                    if (indexV < size && indexH > size -1){
                        System.out.print("\\");
                    }
                    //Left buttom
                    if (indexV > size -1  && indexH < size ){
                        System.out.print("\\");
                    }
                    //Right buttom
                    if (indexV > size - 1 && indexH > size -1){
                        System.out.print("/");
                    }
                }


            }
        }*/


        //System.out.println();

        //System.out.println();
        // TODO -- add your code here
    }
}


