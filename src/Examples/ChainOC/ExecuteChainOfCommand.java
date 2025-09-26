package Examples.ChainOC;

import Examples.Example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ExecuteChainOfCommand implements Example {

    @Override
    public String getExampleName() {
        return "Chain of command";
    }

    @Override
    public void execute() {
        var king=new OrcKing();
        king.makeRequest(new Request(Request.RequestType.DEFEND_CASTLE,"defending castle"));
        king.makeRequest(new Request(Request.RequestType.TORTURE_PRISONER,"torturing prisoner"));
        king.makeRequest(new Request(Request.RequestType.COLLECT_TAX,"collecting tax"));
        king.makeRequest(new Request(Request.RequestType.CLEAN_STUFF,"cleaning stuff"));
    }
}