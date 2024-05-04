import employees.*;

public class Company {
    public static void main(String[] args) {
        
        Employee[] employees = new Employee[5];

        
        employees[0] = new Manager("Magdalena Zakrzewska", 5600, 0);
        employees[1] = new Worker("Anna Nowak", 6000, "Programmer");
        employees[2] = new Employee("Marek Lewandowski", 3400);
        employees[3] = new Employee("Jan Kwiatkowski", 7400);
        employees[4] = new Worker("Mariusz Kowalski", 3900, "Analyst");

        
        System.out.println("Dane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
