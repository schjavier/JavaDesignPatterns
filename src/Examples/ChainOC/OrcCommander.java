package Examples.ChainOC;

public class OrcCommander implements RequestHandler {
    @Override
    public boolean canHandleRequest(Request req) {
        return req.getRequestType() == Request.RequestType.DEFEND_CASTLE;
    }

    @Override
    public int getPriority() {
        return 2;
    }

    @Override
    public void handle(Request req) {
        req.markHandled();
        System.out.println(name() + " is " + req);
    }

    @Override
    public String name() {
        return "Orc commander";
    }
}
