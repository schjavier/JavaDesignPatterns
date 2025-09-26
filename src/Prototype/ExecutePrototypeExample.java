package Prototype;

public class ExecutePrototypeExample {
    public ExecutePrototypeExample() {
        CoffeeTable ct = new CoffeeTable(15, 100, "Red");
        DiningTable dt = new DiningTable(45, 150, "White");
        Nightstand ns = new Nightstand(25, 40, "Brown");

        TableFactoryImpl tableFactory = new TableFactoryImpl(ct, dt, ns);

        System.out.println(tableFactory.createCoffeeTable());
        System.out.println(tableFactory.createCoffeeTable());
        System.out.println(tableFactory.createDiningTable());
        System.out.println(tableFactory.createDiningTable());
        System.out.println(tableFactory.createNightstand());
        System.out.println(tableFactory.createNightstand());
    }
}
