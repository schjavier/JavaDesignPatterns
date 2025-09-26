package Examples.Visitor;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Person> allPersons;

    public School() {
        allPersons = new ArrayList<>();
    }

    public List<Person> getAllPersons() {
        return allPersons;
    }

    public void doHealthCheckUp(){
        HealthVisitor doctor = new HealthVisitor();

        for (Person person: allPersons){
            person.accept(doctor);
        }
    }

}
