package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
    
    // TODO -- Fill in your code here
        public static final int OUT=-1;
        public static final int IN = 1;

        private int mSwing=0;
        private boolean mLocked=true;


        public int getSwingDirection()
        {
            return this.mSwing;
        }
        public boolean setSwing(int value)
        {
            if(value == -1 || value == 1)
            {
                this.mSwing = value;
                return true;
            }
            else{
                return false;
            }
        }
        public boolean open (int direction){
            boolean flag=this.setSwing(direction);
            if(flag==false)
                return false;
            else{
                this.mLocked=false;
                return true;
            }
        }
        public void close(){
            this.mLocked=true;
            this.mSwing=0;
        }
        public boolean isLocked(){
            return true;
        }

        public int thru(int count){
            if(this.getSwingDirection()==IN)
            {
                return count;
            }
            if(this.getSwingDirection()==OUT)
            {
                return -count;
            }
            else{
                return 0;
            }
        }
        public String toString(){
                if(this.mLocked)
                    return "This gate is locked";
                else if(this.mLocked==false && mSwing==0){
                    return "This gate is not locked and swings but the swing is not set properly";
                }else if(this.mLocked==false && this.getSwingDirection()==IN){
                    return "This gate is not locked and swings to enter the pen only";
                }else if(this.mLocked==false && this.getSwingDirection()==OUT) {
                    return "This gate is not locked and swings to exit the pen only";
                }else
                {return "";}
        }
}
