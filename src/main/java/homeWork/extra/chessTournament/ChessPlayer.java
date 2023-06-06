package homeWork.extra.chessTournament;

import lombok.*;
@Getter
@ToString
@AllArgsConstructor

abstract class ChessPlayer {
    private String name;
    private int age;
}
class BeginnerPlayer extends ChessPlayer {
    public BeginnerPlayer(String name, int age) {
        super(name, age);
    }
}

class MasterPlayer extends ChessPlayer {
    public MasterPlayer(String name, int age) {
        super(name, age);
    }
}

class ProPlayer extends ChessPlayer {
    public ProPlayer(String name, int age) {
        super(name, age);
    }
}

class GuruPlayer extends ChessPlayer {
    public GuruPlayer(String name, int age) {
        super(name, age);
    }
}
