package Examples.Visitor;

public class Child extends Person{

    public Child(String name, int edad, String healthStatus) {
        super(name, edad, healthStatus);
    }

    @Override
    public void accept(HealthVisitor visitor){
        visitor.visit(this);
    }

}
