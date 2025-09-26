package Examples.Mediator;

import Examples.Example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ExecuteMediatorExample implements Example {
    public void execute() {
        // create party and members
        Party party = new PartyImpl(); // grupo en donde se comunicara lo que pasa a los demas

        var wizard = new Wizard();
        var rogue = new Rogue();
        var hunter = new Hunter();

        // add party members
        party.addMember(wizard);
        party.addMember(rogue);
        party.addMember(hunter);

        // perform actions -> the other party members
        // are notified by the party
        wizard.act(Action.ENEMY);
        wizard.act(Action.TALE);
        rogue.act(Action.GOLD);
        hunter.act(Action.HUNT);
    }

    @Override
    public String getExampleName() {
        return "Mediator";
    }
}