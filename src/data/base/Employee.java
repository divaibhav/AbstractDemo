package data.base;

public abstract class Employee {
    private String empName;
    private int empCode;
    private double salary;

    public Employee(String empName, int empCode, double salary) {
        this.empName = empName;
        this.empCode = empCode;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public abstract double calculateIncrement(float hikePercentage);




}
