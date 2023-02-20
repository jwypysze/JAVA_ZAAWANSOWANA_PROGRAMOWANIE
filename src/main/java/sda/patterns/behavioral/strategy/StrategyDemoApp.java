package sda.patterns.behavioral.strategy;

public class StrategyDemoApp {
    public static void main(String[] args) {
        TripPlanner tripPlanner = new TripPlanner("Łańcut", "Karpacz");
        tripPlanner.setTravelPlan(new CarStrategy(true, false));
        tripPlanner.getTripInfo();
        System.out.println("======================================");
        tripPlanner.setTravelPlan(new WalkStrategy(true));
        tripPlanner.getTripInfo();
        System.out.println("======================================");
    }
}
