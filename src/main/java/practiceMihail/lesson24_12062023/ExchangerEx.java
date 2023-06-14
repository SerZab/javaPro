package practiceMihail.lesson24_12062023;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {

        Exchanger<Action> exchanger = new Exchanger<>();
        
        List<Action> P1LIST = new ArrayList<>();
        P1LIST.add(Action.SCISSORS);
        P1LIST.add(Action.STONE);
        P1LIST.add(Action.STONE);

        List<Action> P2LIST = new ArrayList<>();
        P1LIST.add(Action.STONE);
        P1LIST.add(Action.SCISSORS);
        P1LIST.add(Action.STONE);

        new Player("P1", P1LIST, exchanger);
        new Player("P2", P2LIST, exchanger);
    }
}
enum Action {
    STONE, SCISSORS, PAPER;
}
class Player extends Thread{
    private String name;
    private List<Action> actionList;
    private Exchanger<Action> exchanger;

    public Player(String name, List<Action> actionList, Exchanger<Action> exchanger) {
        this.name = name;
        this.actionList = actionList;
        this.exchanger = exchanger;
        this.start();
    }


    private void getWinner(Action p1, Action p2){
        if(p1 == Action.PAPER && p2 == Action.STONE ||
                p1 == Action.SCISSORS && p2 == Action.PAPER ||
                p1 == Action.STONE && p2 ==Action.SCISSORS) {
            System.out.println("Winner is " + name);
        }
    }

    @Override
    public void run(){
        Action replay;
        for (Action action : actionList){
            try{
                replay = exchanger.exchange(action);
                getWinner(action, replay);
                Thread.sleep(300);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
