package InterfacesJava.InterfaceComparable;

public class Employee implements Comparable<Employee> {
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
//serve para comparar um metodo com outro
    @Override
    public int compareTo(Employee other) {
        // TODO Auto-generated method stub
        return -this.salary.compareTo(other.getSalary());
    }

   

    

    
}
