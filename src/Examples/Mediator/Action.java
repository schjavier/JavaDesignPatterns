package Examples.Mediator;

public enum Action {
    ENEMY("spotted enemies","runs for cover"),
    TALE("tells a tale","comes to listen"),
    GOLD("found gold","takes their share of the gold"),
    HUNT("hunted an animal","arrives for dinner");

    private String action;
    private String response;

    Action(String description, String response) {
        this.action = description;
        this.response = response;
    }

    public String getAction() {
        return action;
    }

    public String getResponse() {
        return response;
    }
}
