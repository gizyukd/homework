package fifth;

import java.util.Arrays;

public class Worker extends Employee{
    public Worker(double exp, String name, String surname) {
        super(exp, name, surname);
    }

    @Override
    public POSITION getPosition() {
        return POSITION.WORKER;

    }

    @Override
    public void setPosition() {

    }

    public String toString() {
        return super.toString() + this.getPosition();
    }
}
