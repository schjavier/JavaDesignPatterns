package Proxy;

public class WizardTowerProxy implements WizardTower {

    private static final int NUM_WIZARDS_ALLOWED = 3; // magos permitidos
    private int numWizards; // cantidad actual

    private final WizardTower tower; // torre

    public WizardTowerProxy(WizardTower tower) { // accepta cualquier tipo con la interfaz torre
        this.tower = tower;
    }

    @Override // metodo desde la interfaz
    public void enter(Wizard wizard) {
        if (numWizards < NUM_WIZARDS_ALLOWED) {
            tower.enter(wizard);
            numWizards++;
        } else {
            System.out.println(wizard + " is not allowed to enter!");
        }
    }
}
