import Controller.Controller;
import Models.Lister;
import Models.Task;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
      Controller controller = new Controller();
      controller.addTask("name1","description" );
      System.out.println(controller.showTasks());
      controller.removeTask("name1");
      System.out.println(controller.showTasks());
    }


}
