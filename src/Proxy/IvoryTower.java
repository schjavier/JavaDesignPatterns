package Proxy;

public class IvoryTower implements WizardTower {
    @Override // metodo desde la interfaz
    public void enter(Wizard wizard) {
        System.out.println(wizard + " enters the tower.");
    }
}
