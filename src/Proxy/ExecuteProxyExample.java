package Proxy;

public class ExecuteProxyExample {

    private WizardTowerProxy proxy;

    public ExecuteProxyExample(){

        this.proxy = new WizardTowerProxy(new IvoryTower());

        this.proxy.enter(new Wizard("Red wizard"));
        this.proxy.enter(new Wizard("White wizard"));
        this.proxy.enter(new Wizard("Black wizard"));
        this.proxy.enter(new Wizard("Green wizard"));
        this.proxy.enter(new Wizard("Brown wizard"));

    }



}
