package fifth;

import java.util.Arrays;

public class Director extends Employee{

    Employee [] employees;

    public Director(double exp, String name, String surname) {
        super(exp, name, surname);
    }

    @Override
    public POSITION getPosition() {
        return POSITION.DIRECTOR;
    }

    @Override
    public void setPosition() {

    }

    public void addWorker(Employee employee){
        if (employees == null){
            employees = new Employee[] {employee};
        }
        else{
            employees = Arrays.copyOf(employees,(employees.length + 1));
            employees[employees.length - 1] = employee;
        }
    }

    @Override
    public double getSalary() {
        if (employees == null){
            return super.getSalary();
        }
        else{
            return 1000 * (1 + 0.1 * employees.length) * getPosition().getRate();
        }
    }

    public void printDirInfoWithSubjects(){
        System.out.println(super.toString()); // можно ли вызвать реализацию метода предка, переопределенного потомком
        for (int i = 0; i<this.employees.length;i++){
            System.out.println(employees[i].toString());
        }
    }

    @Override
    public String toString() {
        return super.toString() + this.getPosition() + ": " + "Director{" +
                "employees=" + Arrays.toString(employees) +
                '}';
    }

}
