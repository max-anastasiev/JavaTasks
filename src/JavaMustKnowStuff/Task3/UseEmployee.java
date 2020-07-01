package JavaMustKnowStuff.Task3;

public class UseEmployee {

    public static void main(String[] args) {

        Employee employee1 = new Employee(15, EmployeeRole.TESTER);
        Employee employee2 = new Employee(40, EmployeeRole.DEVELOPER);
        Employee employee3 = new Employee(16, EmployeeRole.MANAGER);
        Employee employee4 = new Employee(60, EmployeeRole.CEO);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
        System.out.println(employee4.toString());
    }
}
