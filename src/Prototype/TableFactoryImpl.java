package Prototype;

public class TableFactoryImpl implements TableFactory {
    private final CoffeeTable coffeeTable;
    private final DiningTable diningTable;
    private final Nightstand nightstand;

    public TableFactoryImpl(CoffeeTable coffeeTable, DiningTable diningTable, Nightstand nightstand) {
        this.coffeeTable = coffeeTable;
        this.diningTable = diningTable;
        this.nightstand = nightstand;
    }

    public CoffeeTable createCoffeeTable() {
        return coffeeTable.copy();
    }

    public DiningTable createDiningTable() {
        return diningTable.copy();
    }

    public Nightstand createNightstand() {
        return nightstand.copy();
    }
}
