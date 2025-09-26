package Examples.ChainOC;

public class OrcSoldier implements RequestHandler {
    @Override
    public boolean canHandleRequest(Request req) {
        return req.getRequestType() == Request.RequestType.COLLECT_TAX;
    }

    @Override
    public int getPriority() {
        return 0;
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
