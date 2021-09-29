package fifth;

import sixth.SearchEmployeeInterface;

import java.util.Arrays;

public class Director extends Employee implements SearchEmployeeInterface {

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
        System.out.println(super.toString());
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

    @Override
    public void searchEmployee(String name) {
        for(Employee employee : this.employees){
            if(employee.getName().equals(name)){
                System.out.println("Cотрудник с таким именем есть в подчинении");
                return;
            }
        }
        System.out.println("Сотрудник в подчинении не найден");
        return;
    }

    @Override
    public boolean deepSearchEmployee(String name) {
        for(Employee employee : this.employees){
            if(employee.getName().equals(name)){
                System.out.println("Cотрудник с таким именем есть в подчинении у директора " + this.getName());
                return true;
            }
            if(employee instanceof Director){
                if(((Director) employee).deepSearchEmployee(name)){
                    return true;
                }
            }
        }
        System.out.println("Сотрудник в подчинении не найден");
        return false;
    }

}

