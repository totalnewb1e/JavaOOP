package HW2.MembersAndObstacles;

import java.util.ArrayList;
import java.util.Arrays;

public class Members {
    private String[] teamArr;
    private final String membersName;
    private final ArrayList<Participants> members;

    public Members(String membersName) {
        this.members = new ArrayList<>();
        this.membersName = membersName;
    }

    public void addMember(Participants participants) {
        members.add(participants);
    }

    public void getInfo() {
        teamArr = new String[members.size()];
        for (int i = 0; i < teamArr.length; i++) {
            teamArr[i] = members.get(i).getInfo();
        }
        System.out.println("Team " + membersName + "consist of: " + Arrays.toString(teamArr));
    }
    public void start(ArrayList<Obstacles> course){
        System.out.println("We begin! ");
        for (Obstacles obstacles : course){
            for (int i = 0; i < teamArr.length; i++) {
                if (members.get(i).isCondition())
                    System.out.println(members.get(i).runResults(obstacles.treadmill().distance()));
                if (members.get(i).isCondition())
                    System.out.println(members.get(i).jumpResults(obstacles.wall().height()));
            }
        }
    }
}
