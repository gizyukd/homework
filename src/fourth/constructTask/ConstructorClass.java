package fourth.constructTask;

public class ConstructorClass {
    public ConstructorClass(){
        System.out.println("empty Constructor");
    }

    public ConstructorClass(String name){
        this();
        System.out.println(name);
    }

    @Deprecated
    public ConstructorClass(String name, int count){
        this(name);
        System.out.println(name + " " + count);
    }
}
