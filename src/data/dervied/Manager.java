package data.dervied;

import data.base.Employee;

public class Manager extends Employee {

    private int teamSize;
    private int teamRating;

    public Manager(String empName, int empCode, double salary, int teamSize, int teamRating) {
        super(empName, empCode, salary);
        this.teamSize = teamSize;
        this.teamRating = teamRating;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getTeamRating() {
        return teamRating;
    }

    public void setTeamRating(int teamRating) {
        this.teamRating = teamRating;
    }
    @Override
    public double calculateIncrement(float hikePercentage){
        double response = 0;
        if(teamRating > 8){
            response = (getSalary() * 12.5 )/100;
        }else{
            response = (getSalary() * hikePercentage)/100;
        }


        return response;
    }


}
