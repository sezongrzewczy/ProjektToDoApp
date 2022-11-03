package Models;

public class Task
{
    String name;
    Boolean isDone;
    String description;

    public Task(String name, Boolean isDone, String description) {
        this.name = name;
        this.isDone = isDone;
        this.description = description;
    }

    @Override
    public String toString()
    {
        return "Task{" +
                "name='" + name + '\'' +
                ", isDone=" + isDone +
                ", description='" + description + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }






}
