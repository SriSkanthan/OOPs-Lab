interface Task {
    void executeTask();
    int getPriority();
}

class WorkTask implements Task {
    public void executeTask() {
        System.out.println("Executing Work Task: Finish report.");
    }

    public int getPriority() {
        return 1; 
    }
}

class PersonalTask implements Task {
    public void executeTask() {
        System.out.println("Executing Personal Task: Go to the gym.");
    }

    public int getPriority() {
        return 2;
    }
}

class ErrandTask implements Task {
    public void executeTask() {
        System.out.println("Executing Errand Task: Buy groceries.");
    }

    public int getPriority() {
        return 3; 
    }
}

public class intf2{
    public static void main(String[] args) {
        Task workTask = new WorkTask();
        System.out.println("Work Task Priority: " + workTask.getPriority());
        workTask.executeTask();

        Task personalTask = new PersonalTask();
        System.out.println("Personal Task Priority: " + personalTask.getPriority());
        personalTask.executeTask();

        Task errandTask = new ErrandTask();
        System.out.println("Errand Task Priority: " + errandTask.getPriority());
        errandTask.executeTask();
    }
}
