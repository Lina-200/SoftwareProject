import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> CommandList = new ArrayList<Command>();

    public void takeCommand(Command command){
        CommandList.add(order);
    }s

    public void placeCommands(){

        for (Command command : CommandList) {
            command.execute();
        }
        CommandList.clear();
    }
}