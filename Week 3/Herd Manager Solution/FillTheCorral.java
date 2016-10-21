package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to fill the corral with snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out) {
        mOut = out;
    }

    // A function that do some randomization and set a corral gate
    public void setCorralGates(Gate[] gate, Random selectDirection) {
        for (int i = 0; i < gate.length; i++) {
            gate[i].setSwing(selectDirection.nextInt(3) - 1);
        }
    }
    // A function that check the availability of corrals and return true when found
    public boolean anyCorralAvailable(Gate[] corral) {
        boolean permit = false;
        for (Gate gate: corral) {
            if (gate.getSwingDirection() == Gate.IN)
                permit = true;
        }
        return permit;
    }

    // The function that stimulate the scenario and output the movement and attempts that were done
    public int corralSnails(Gate[] corral, Random rand) {
        mOut.println("Initial gate setup:");
        int inPasture = 5;
        int attempts = 0;

        for (int i=0; i<corral.length; i++)
            mOut.println("Gate " + i + ": " + corral[i]);

        do {
            int rndNumber = rand.nextInt(inPasture) + 1;
            int rndGate = rand.nextInt(corral.length);
            mOut.println(rndNumber + " are trying to move through corral " + rndGate);
            inPasture -= corral[rndGate].thru(rndNumber);
            attempts++;
        } while (inPasture > 0);

        mOut.println("It took " + attempts + " attempts to corral all of the snails.");
        return attempts;
    }
}
