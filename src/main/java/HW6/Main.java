package HW6;

import HW6.Controller.Controller;
import HW6.Model.FileOperation;
import HW6.Model.FileOperationImp;
import HW6.Model.Repo;
import HW6.Model.RepoFile;
import HW6.View.UserView;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImp("Users.txt");
        Repo repo = new RepoFile(fileOperation);
        Controller controller = new Controller(repo);
        UserView view = new UserView(controller);
        view.start();
    }
}
