package javaProStanislav.lesson29_28062023.application2.console;

public class ExitUIAction implements UIAction{
    @Override
    public void execute() {
        System.out.println("Bye-bye!");
        System.exit(0);
    }

    @Override
    public String getActionName() {
        return "Exit";
    }
}
