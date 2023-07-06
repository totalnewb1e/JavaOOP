package HW2;

import HW2.MembersAndObstacles.*;
public class Main {
    public static void main(String[] args) {
        Members members = new Members("Dream team");
        members.addMember(new Human("Tony", 500, 1.0));
        members.addMember(new Cat("Wizzle", 350, 1.5));
        members.addMember(new Robot("C-3PO", 10000, 0.6));

        ObstacleCourse course = new ObstacleCourse();
        course.addAnObstacle(new Obstacles(new Wall(0.5), new Treadmill(450)));
        course.addAnObstacle(new Obstacles(new Wall(1.4), new Treadmill(600)));
        course.addAnObstacle(new Obstacles(new Wall(2.0), new Treadmill(1000)));

        members.getInfo();
        members.start(course.getObstacles());
    }
}
