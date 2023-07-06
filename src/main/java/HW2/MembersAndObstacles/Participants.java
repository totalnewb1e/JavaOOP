package HW2.MembersAndObstacles;

import HW2.Actions.*;

public abstract class Participants {
    protected String info;
    protected int maxDistance;
    protected double maxHeight;
    protected String runSuccess;
    protected String runFailure;
    protected String jumpSuccess;
    protected String jumpFailure;
    private boolean condition;
    private final MotionsInterface motionsInterface;

    public Participants(String name, int maxDistance, double maxHeight) {
        this.info = "";
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        this.runSuccess = "";
        this.runFailure = "";
        this.jumpSuccess = "";
        this.jumpFailure = "";
        this.motionsInterface = new Motion();
        this.condition = true;
    }

    public String getInfo() {
        return info;
    }

    public String runResults(int distance) {
        if (motionsInterface.run(distance, maxDistance) && condition) {
            return info + runSuccess + distance;
        }
        condition = false;
        return info + runFailure;
    }

    public String jumpResults(double height) {
        if (motionsInterface.jump(height, maxHeight) && condition) {
            return info + jumpSuccess + height;
        }
        condition = false;
        return info + jumpFailure;
    }

    public boolean isCondition() {
        return condition;
    }
}
