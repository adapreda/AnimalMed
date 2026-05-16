package model;

public class Employee {
    private static int CounterID = 0;

    protected final int EmployeeID;
    protected final int ClinicID;
    protected String EmployeeFirstName;
    protected String EmployeeLastName;
    protected String EmployeeEmail;
    protected String EmployeePhone;
    protected double EmployeeSalary;
    protected String EmployeeType;

    public Employee(String firstName, String lastName, String email, String phone, double salary) {
        this.EmployeeID = ++CounterID;
        this.ClinicID = Clinic.getInstance().getClinicID();
        this.EmployeeFirstName = firstName;
        this.EmployeeLastName = lastName;
        this.EmployeeEmail = email;
        this.EmployeePhone = phone;
        this.EmployeeSalary = salary;
        this.EmployeeType = getClass().getSimpleName().toUpperCase();
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

    public int getClinicID() {
        return ClinicID;
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

    public String getEmployeeType() {
        return EmployeeType;
    }


}
