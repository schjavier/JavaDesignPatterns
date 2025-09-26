package Examples.Proxy;

import Examples.Example;

public class ExecuteProxyExample implements Example {

    private WizardTowerProxy proxy;

    public void execute(){

        this.proxy = new WizardTowerProxy(new IvoryTower());

        this.proxy.enter(new Wizard("Red wizard"));
        this.proxy.enter(new Wizard("White wizard"));
        this.proxy.enter(new Wizard("Black wizard"));
        this.proxy.enter(new Wizard("Green wizard"));
        this.proxy.enter(new Wizard("Brown wizard"));

    }

    @Override
    public String getExampleName() {
        return "Proxy";
    }
}
