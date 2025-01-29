package org.example.CSE_122_Exam_28_01_25.ObjectsProgramming;

import java.util.HashMap;
import java.util.Map;

public class RelayTeam implements Team{
    private String Mascot;
    private Map<String, Double> runners;

    public RelayTeam(String mascot) {
        Mascot = mascot;
        this.runners = new HashMap<>();
    }

    public String getMascot(){
        return this.Mascot;
    }

    public void addRunner(String runner, double time){
        if(runners.containsKey(runner) || time < 0){
            throw new IllegalArgumentException("Runner is already present");
        }
        else{
            runners.put(runner,time);
        }
    }

    public void substituteRunner(String oldRunner, String newRunner, double newTime){
        if(!runners.containsKey(oldRunner) || runners.containsKey(newRunner) || newTime < 0){
            throw new IllegalArgumentException("Invalid Input");
        }
        else{
            runners.remove(oldRunner);
            runners.put(newRunner,newTime);
        }
    }

    public String getFastestRunner(){
        if(runners.size() == 0){
            throw new IllegalArgumentException("No Runner present");
        }
        else{
            String runnerName = null;
            Double minTime = Double.MAX_VALUE;
            for(String runner : runners.keySet()){
                if(runners.get(runner) < minTime || (runners.get(runner).equals(minTime) && (runnerName == null || runner.compareTo(runnerName) < 0))){
                    runnerName = runner;
                    minTime = runners.get(runner);
                }
            }
            return runnerName;
        }
    }

    public double getAverageTime(){
        if(runners.size() == 0){
            return 0.0;
        }
        else{
            double totalTime = 0.0;
            for(String runner : runners.keySet()){
                totalTime += runners.get(runner);
            }
            return totalTime/runners.size();
        }
    }

    public boolean hasFasterAverage(Team other){
        return this.getAverageTime() < other.getAverageTime();
    }

    public String toString(){
        return this.getMascot() + "'s average time: " + this.getAverageTime() + " s";
    }
}
