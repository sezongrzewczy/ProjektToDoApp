package Models;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Lister
{
   String name;
   ArrayList<Task> tasks = new ArrayList<>();

    public Lister(String name, ArrayList<Task> tasks)
    {
        this.name = name;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
    public Task getTask(String name)
    {
      for(Task task : tasks)
      {
          if (task.getName().equals(name))
              return task;
      }
      return null;
    }

    @Override
    public String toString() {
        return "Lister{" +
                "name='" + name + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
