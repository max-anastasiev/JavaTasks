package JavaMustKnowStuff.Task3;

public class Employee {


    private double tariffPerHour = 5.5;
    public int hours;
    public EmployeeRole EmployeeRole;

    public Employee(int hours, EmployeeRole task3EmployeeRole) {
        this.hours = hours;
        this.EmployeeRole = task3EmployeeRole;
    }

    final public double getSalary() {

        return tariffPerHour * hours;
    }

    public double getTariffPerHour() {

        return tariffPerHour;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "EmployeeRole = " + EmployeeRole +
                ", tariffPerHour = " + getTariffPerHour() +
                ", hours = " + hours +
                ", Salary = " + getSalary() +
                '}';
    }
}