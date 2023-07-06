package HW2.MembersAndObstacles;

import java.util.ArrayList;

public class ObstacleCourse {
    private final ArrayList<Obstacles> obstacleCourse;
    public ObstacleCourse(){
        obstacleCourse = new ArrayList<>();
    }
    public void addAnObstacle(Obstacles obstacles){
        obstacleCourse.add(obstacles);
    }
    public ArrayList<Obstacles> getObstacles(){
        return obstacleCourse;
    }
}
