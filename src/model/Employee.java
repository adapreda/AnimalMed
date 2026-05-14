package model;

public class Employee {
    private static int CounterID = 0;

    protected final int EmployeeID;
    protected String EmployeeFirstName;
    protected String EmployeeLastName;
    protected String EmployeeEmail;
    protected String EmployeePhone;
    protected double EmployeeSalary;

    public Employee(String firstName, String lastName, String email, String phone, double salary) {
        this.EmployeeID = ++CounterID;
        this.EmployeeFirstName = firstName;
        this.EmployeeLastName = lastName;
        this.EmployeeEmail = email;
        this.EmployeePhone = phone;
        this.EmployeeSalary = salary;
    }

    @Override
    public String toString() {
        return "Angajatul: " +  this.EmployeeID + ". " +  this.EmployeeFirstName + " " + this.EmployeeLastName + " -> " + this.EmployeeEmail +  " -> " + this.EmployeePhone;
    }

    public static int getCounterID() {
        return CounterID;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public String getEmployeeFirstName() {
        return EmployeeFirstName;
    }

    public String getEmployeeLastName() {
        return EmployeeLastName;
    }

    public String getEmployeeEmail() {
        return EmployeeEmail;
    }

    public String getEmployeePhone() {
        return EmployeePhone;
    }

    public Double getEmployeeSalary() {
        return EmployeeSalary;
    }


}
