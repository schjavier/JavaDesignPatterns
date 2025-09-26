package Examples.Mediator;

public interface Party {

    void addMember(PartyMember member);

    void act(PartyMember actor, Action action);
}
