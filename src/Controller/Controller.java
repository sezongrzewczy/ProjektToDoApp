package Controller;

import Models.Lister;
import Models.Task;

import java.util.ArrayList;
import java.util.Arrays;

public class Controller

{
    ArrayList<Lister> TaskList = new ArrayList();
    ArrayList<Task> tasks = new ArrayList();
    Lister lister = new Lister("List1", tasks);

    public void addTask(String name, String description)
    {
        Task Task = new Task(name, false,description);
        tasks.add(Task);
        lister.setTasks(tasks);

    }
    public void removeTask(String name)
    {
       Task Task = lister.getTask(name);
       tasks.remove(Task);
       lister.setTasks(tasks);
    }
    public String showTasks()
    {
        for(Task task : tasks)
        {
            return task.toString();
        }
        return null;
    }
    public void addTaskList(){

    }



}
