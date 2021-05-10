import java.util.*;

public class Department {
    String employee;
    private String name;
    private List<Employee> employeeList;

    public Department() {
        employeeList = new ArrayList<>();
    }

    public List<Employee> getEmployeeList() {
        return Collections.unmodifiableList(this.employeeList);
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }
    public double getAverageSalary(){
        double avgSalary = 0.00;
        for (Employee employee : this.employeeList) {
            avgSalary += employee.getSalary();
        }
        return avgSalary / this.employeeList.size();
    }
}
