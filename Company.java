
public class Company {
    public static void main(String[] args) {
        
        Employee[] Employees = new Employee[5];
        
        
        Employees[0] = new Employee("Magdalena Zakrzewska", 5600);
        Employees[1] = new Employee("Anna Nowak", 6000);
        Employees[2] = new Employee("Marek Lewandowski", 3400);
        Employees[3] = new Employee("Jan Kwiatkowski", 7400);
        Employees[4] = new Employee("Mariusz Kowalski", 3900);
        
        
        System.out.println("Dane dla pracownika o indeksie równym 3:");
        System.out.println("Imię i nazwisko: " + Employees[3].getName());
        System.out.println("Wynagrodzenie: " + Employees[3].getSalary());
        
        
        double newSalary = 6200;
        Employees[3].setSalary(newSalary);
        System.out.println("Nowe wynagrodzenie pracownika o indeksie równym 3 wynosi: " + Employees[3].getSalary());
        
        
        System.out.println("\nDane dla wszystkich pracowników:");
        for (Employee employee : Employees) {
            System.out.println("Imię i nazwisko: " + employee.getName());
            System.out.println("Wynagrodzenie: " + employee.getSalary());
            System.out.println();
        }
    }
}
