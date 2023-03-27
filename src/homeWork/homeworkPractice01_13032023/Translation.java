package homeWork.homeworkPractice01_13032023;

public class Translation {
    private int id;
    private String sourceText;
    private String targetText;
    private User user;

    public Translation(int id, String sourceText, String targetText, User user) {
        this.id = id;
        this.sourceText = sourceText;
        this.targetText = targetText;
        this.user = user;
    }

    public void updateSourceText(String newSourceText) {
        this.sourceText = newSourceText;
        this.targetText = sourceText;
    }
}
