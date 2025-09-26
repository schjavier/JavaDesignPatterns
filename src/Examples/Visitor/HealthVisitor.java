package Examples.Visitor;

public class HealthVisitor{

    public void visit(Child person) {
        System.out.println("Hola " + person.getName() + " Cómo estás pibe? Te veo: " + person.getHealthStatus() );
    }

    public void visit(Adult person) {
        System.out.println("Buenos días " + person.getName() + " Cómo anda señor? Lo veo: " + person.getHealthStatus() );
    }
}
