public class Adult extends Person{

    public Adult(String name, int edad, String healthStatus) {
        super(name, edad, healthStatus);
    }

    @Override
    public void accept(HealthVisitor visitor){
        visitor.visit(this);
    }

}
