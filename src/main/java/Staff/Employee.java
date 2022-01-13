package Staff;

public abstract class Employee {
    private String name;
    private String niNumber;
    protected double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double increase){
        if (increase >= 0) {
            return salary += increase;
        } else {
            return salary;
        }
    }

    public double payBonus() {
        return 0.01 * salary;
    }
}
