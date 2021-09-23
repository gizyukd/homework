package fifth;

public abstract class Employee extends Person {
    private double exp;

    public Employee(double exp, String name, String surname) {
        super(name, surname);
        this.exp = exp;
    }

    public abstract POSITION getPosition();

    public abstract void setPosition();

    public double getSalary(){
        return 1000 * getPosition().getRate();
    }

    public String toString() {
        return super.toString() + getSalary();
    }
}
