package homeWork.chessTournament;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends ChessPlayer>{
    private String name;
    private List<T> team = new ArrayList<>();

    public Team(String name, List<T> team) {
        this.name = name;
        this.team = team;
    }

    public static void main(String[] args) {
        System.out.println(generatePlayers());
    }
    static List<Team<? extends ChessPlayer>> generatePlayers() {
        List<Team<? extends ChessPlayer>> teams = new ArrayList<>();
        List<String> randomNames = getRandomNames(20);

        List<BeginnerPlayer> beginners = new ArrayList<>();
        List<MasterPlayer> masters = new ArrayList<>();
        List<ProPlayer> pros = new ArrayList<>();
        List<GuruPlayer> gurus = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            String name = randomNames.get(i);
            int age = generateRandomAge(12, 60);
            if (i < 5) {
                beginners.add(new BeginnerPlayer(name, age));
            } else if (i < 10) {
                masters.add(new MasterPlayer(name, age));
            } else if (i < 15) {
                pros.add(new ProPlayer(name, age));
            } else {
                gurus.add(new GuruPlayer(name, age));
            }
        }
        teams.add(new Team<>("Beginners", beginners));
        teams.add(new Team<>("Masters", masters));
        teams.add(new Team<>("Pros", pros));
        teams.add(new Team<>("Gurus", gurus));

        return teams;
    }
    private static List<String> getRandomNames(int count) {
        String[] names = {"Сергей", "Михаил", "Илья", "Виталий", "Сем", "Рома", "Николай", "Ольга", "Зари",
                "Александр", "Мария", "Анатолий", "Антон", "Станислав"};
        List<String> namesList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            String name = names[random.nextInt(names.length)];
            namesList.add(name);
        }

        return namesList;
    }

    private static int generateRandomAge(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

}
