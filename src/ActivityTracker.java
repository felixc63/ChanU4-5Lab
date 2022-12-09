public class ActivityTracker {
    private int targetGoal;
    private int totalMinutes;
    private int totalLogs;
    private int maxMinutes;

    public ActivityTracker(int targetGoal){
        this.targetGoal = targetGoal;
    }

    public void logMinutes(int amount){
        totalMinutes += amount;
        if (amount > maxMinutes){
            maxMinutes = amount;
        }
        totalLogs++;
    }

    public int getSessions(){
        return totalLogs;
    }

    public int getTotalMinutes(){
        return totalMinutes;
    }

    public int getMaxMinutes(){
        return maxMinutes;
    }

    public boolean goalAchieved(){
        if (totalMinutes >= targetGoal){
            return true;
        }
        return false;
    }
}
