package homeWork.extra.youtube.parametrisation;

public class Main {
    public static void main(String[] args) {
        Body body = new Body();
        SmallHead smallHead = new SmallHead();
        MediumHead mediumHead = new MediumHead();
        BigHead bigHead = new BigHead();
        Leg leg = new Leg();

        Robot<SmallHead> robot = new Robot<>(body, smallHead);
        Robot<BigHead> robot1 = new Robot<>(body,bigHead);
        Robot<MediumHead> robot2 = new Robot<>(body, mediumHead);
        Robot <BigHead> robot3 = new Robot<>(body, bigHead);
        robot.getHead().burn();
        robot1.getHead().turn();
        robot2.getHead().say();
        robot3.getHead().turn();
    }

}
