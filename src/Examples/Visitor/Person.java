package Examples.Visitor;

public abstract class Person {

    private String name;
    private int edad;
    private String healthStatus;


    public Person(String name, int edad, String healthStatus) {
        this.name = name;
        this.edad = edad;
        this.healthStatus = healthStatus;
    }

    public abstract void accept(HealthVisitor visitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
}
