package Examples.Mediator;

public abstract class PartyMemberBase implements PartyMember {
    private Party party;

    @Override
    public void joinedParty(Party party) {
        System.out.println(this + " joins the party!");
        this.party = party;
    }

    @Override
    public void partyAction(Action action) {
        System.out.println(this + " " + action.getResponse());
    }

    @Override
    public void act(Action action) {
        if (party != null) {
            System.out.println(this + " " + action.getAction());
            party.act(this, action);
        }
    }

    @Override
    public abstract String toString();
}
