package HW2.MembersAndObstacles;

public class Human extends Participants {
    public static final String who = "* Human ";
    public static final String successfulRunMassage = " finished ";
    public static final String failureRunMassage = " get of the way ";
    public static final String successfulJumpMassage = " got over the wall ";
    public static final String failureJumpMassage = " didn't get over the wall ";


    public Human(String name, int maxDistance, double maxHeight) {
        super(name, maxDistance, maxHeight);
        super.info = who + " called " + name;
        super.runSuccess =  successfulRunMassage;
        super.runFailure = failureRunMassage;
        super.jumpSuccess = successfulJumpMassage;
        super.jumpFailure = failureJumpMassage;
    }
}
