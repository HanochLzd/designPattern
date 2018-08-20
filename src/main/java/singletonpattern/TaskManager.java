package singletonpattern;

/**
 * @author Hanoch
 */
public class TaskManager {

    private static TaskManager taskManager = null;

    private TaskManager() {
        //初始化窗口
        System.out.println("初始化窗口！");
    }

    public void dispalyProcesses() {
        System.out.println("显示进程");
    }

    public void displayServices() {
        System.out.println("显示服务！");
    }

    public static TaskManager getInstance() {
        if (taskManager == null) {
            taskManager = new TaskManager();
        }
        return taskManager;
    }
}
