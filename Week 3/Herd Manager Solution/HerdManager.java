package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to manage a herd of snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class HerdManager {
    /**
     * Reference to the output.
     */
    private OutputInterface mOut;

    /**
     * The input Gate object.
     */
    private Gate mEastGate;

    /**
     * The output Gate object.
     */
    private Gate mWestGate;

    /**
     * Maximum number of iterations to run the simulation.
     */
    private static final int MAX_ITERATIONS = 10;


    // Herd size

    public static final int HERD = 24;

    /**
     * Constructor initializes the fields.
     */
    public HerdManager(OutputInterface out,
                       Gate westGate,
                       Gate eastGate) {
        mOut = out;

        mWestGate = westGate;
        mWestGate.open(Gate.IN);

        mEastGate = eastGate;
        mEastGate.open(Gate.OUT);
    }

    /*
     * simulate the Herd
     */
    public void simulateHerd(Random rand) {
        //initialization
        int  inPen = HerdManager.HERD;
        int  inPasture = 0;

        //print Output
        mOut.println(this.mEastGate.toString());
        mOut.println(this.mWestGate.toString());

        // run as much as the specified iterations and check the pasture and pen
        for (int i = 0; i<HerdManager.MAX_ITERATIONS; i++) {
            Gate choosenGate;
            if (inPasture == 0) {
                choosenGate = mEastGate;
            } else if (inPen == 0) {
                choosenGate = mWestGate;
            } else {
                if (rand.nextBoolean()) {
                    choosenGate = mEastGate;
                } else {
                    choosenGate = mWestGate;
                }
            }
        // Control the movements
            if (choosenGate.getSwingDirection() == Gate.OUT) {
                int movedSnails = choosenGate.thru(rand.nextInt(inPen) + 1);
                inPen += movedSnails;
                inPasture -= movedSnails;
            } else if (choosenGate.getSwingDirection() == Gate.IN) {
                int movedSnails = choosenGate.thru(rand.nextInt(inPasture) + 1);
                inPen += movedSnails;
                inPasture -= movedSnails;
            }
            mOut.println("There are currently " + inPen + " snails in the pen and " + inPasture + " snails in the pasture");
        }
    }
}
