import employees.*;

public class Company {
    public static void main(String[] args) {
        
        Employee[] employees = new Employee[7];

        
        employees[0] = new Manager("Magdalena Zakrzewska", 5600, 0);
        employees[1] = new Worker("Anna Nowak", 6000, "Programmer");
        employees[2] = new Employee("Marek Lewandowski", 3400);
        employees[3] = new Employee("Jan Kwiatkowski", 7400);
        employees[4] = new Worker("Mariusz Kowalski", 3900, "Analyst");
        employees[5] = new Manager("Wojciech Piotrowski",5700, 0);
        employees[6] = new Worker("Robert Nowakowski", 4800, "Receptionist");

        for (Employee employee : employees) {
            double newSalary = employee.getSalary() + 500;
            employee.setSalary(newSalary);
        }

        
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(2); 
                employee.setSalary(7500);
            }
        }

        
        System.out.println("Zaktualizowane informacje o pracownikach:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
