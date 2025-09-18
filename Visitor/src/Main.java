import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ejemplo Visitor");

        School school = new School();
        List<Person> lista = school.getAllPersons();

        Child child = new Child("Pedro", 10, "OK");
        Child child2 = new Child("Juan", 10, "OK");
        Child child3 = new Child("Luis", 10, "OK");

        Adult adult = new Adult("Rodolfo", 33, "OK");
        Adult adult2 = new Adult("Eustaquio", 73, "OK");
        Adult adult3 = new Adult("Andrés", 45, "OK");

        lista.add(child);
        lista.add(child2);
        lista.add(child3);
        lista.add(adult);
        lista.add(adult2);
        lista.add(adult3);

        school.doHealthCheckUp();

    }
}