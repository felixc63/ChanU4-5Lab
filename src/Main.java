import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your goal in minutes: ");
        int goal = scan.nextInt();

        ActivityTracker activityTracker = new ActivityTracker(goal);

        int count = 0;
        while(true){
            System.out.print("Enter the number of minutes for your activity session, - 1 to end: ");
            count = scan.nextInt();
            if (count == -1){
                break;
            }
            activityTracker.logMinutes(count);
        }
        System.out.println();

        System.out.println("Good job being active! Let's look at your stats:");
        System.out.println("Number of sessions: " + activityTracker.getSessions());
        System.out.println("Total number of minutes: " + activityTracker.getTotalMinutes());
        System.out.println("Longest session logged (max minutes): " + activityTracker.getMaxMinutes());
        System.out.println("You reached your goal: " + activityTracker.goalAchieved());

    }
}
