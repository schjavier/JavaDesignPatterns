package Examples.ChainOC;

public class OrcOfficer implements RequestHandler {
    @Override
    public boolean canHandleRequest(Request req) {
        return req.getRequestType() == Request.RequestType.TORTURE_PRISONER;
    }

    @Override
    public int getPriority() {
        return 1;
    }

    @Override
    public void handle(Request req) {
        req.markHandled();
        System.out.println(name() + " is " + req);
    }

    @Override
    public String name() {
        return "Orc officer";
    }
}
