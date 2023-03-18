package Seminar_7_java;

import Seminar_7_java.logger.Decorator;
import Seminar_7_java.logger.LoggerTerminal;
import Seminar_7_java.controllers.UserController;
import Seminar_7_java.model.FileOperation;
import Seminar_7_java.model.FileOperationImpl;
import Seminar_7_java.model.Repository;
import Seminar_7_java.model.RepositoryFile;
import Seminar_7_java.utils.Validate;
import Seminar_7_java.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("/C:\Users\acer\Desktop\IT\Homework_java\Seminar_7_java/users.txt");
        Repository repository = new Decorator(new RepositoryFile(fileOperation), new LoggerTerminal());
        Validate validate = new Validate();
        UserController controller = new UserController(repository, validate);
        ViewUser view = new ViewUser(controller, validate);

        view.run();
    }
}