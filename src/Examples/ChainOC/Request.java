package Examples.ChainOC;


import java.util.Objects;

public class Request {

    private final RequestType requestType;
    private final String requestDescription;
    private boolean handled;

    public Request(final RequestType requestType, final String requestDescription) {
        this.requestType = Objects.requireNonNull(requestType);
        this.requestDescription = Objects.requireNonNull(requestDescription);
    }

    public void markHandled() {
        this.handled = true;
    }

    @Override
    public String toString() {
        return requestDescription;
    }

    public RequestType getRequestType()
    {
        return requestType;
    }

    public enum RequestType {
        DEFEND_CASTLE, TORTURE_PRISONER, COLLECT_TAX, CLEAN_STUFF
    }

    public boolean getHandled()
    {
        return handled;
    }

    public String getRequestDescription() {
        return requestDescription;
    }
}
