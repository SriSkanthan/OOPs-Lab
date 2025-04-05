class PomodoroTimer {
    private int completedSessions;
    private int focusMinutes;

    public void addSession(int minutes) {
        if (minutes >= 25) {
            completedSessions++;
            focusMinutes += minutes;
        }
    }

    public int getTotalFocusTime() {
        return focusMinutes;
    }

    public int getCompletedSessions() {
        return completedSessions;
    }
}

public class encap4{
    public static void main(String[] args) {
        PomodoroTimer timer = new PomodoroTimer();
        timer.addSession(30);
        timer.addSession(25);
        System.out.println("Sessions: " + timer.getCompletedSessions());
        System.out.println("Focus Time: " + timer.getTotalFocusTime() + " mins");
    }
}
