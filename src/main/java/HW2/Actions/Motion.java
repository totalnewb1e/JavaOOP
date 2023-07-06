package HW2.Actions;

public class Motion implements MotionsInterface {

    @Override
    public boolean run(int distance, int maxDistance) {
        return distance < maxDistance;
    }

    @Override
    public boolean jump(double height, double maxHeight) {
        return height < maxHeight;
    }
}
