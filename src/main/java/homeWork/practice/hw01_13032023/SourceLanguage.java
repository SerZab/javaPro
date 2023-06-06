package homeWork.practice.hw01_13032023;

public class SourceLanguage {
    private int id;
    private String sourceLanguage;
    private String codeLanguage;
    private String text;

    public SourceLanguage(int id, String sourceLanguage, String codeLanguage, String text) {
        this.id = id;
        this.sourceLanguage = sourceLanguage;
        this.codeLanguage = codeLanguage;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSourceLanguage() {
        return sourceLanguage;
    }

    public void setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
    }

    public String getCodeLanguage() {
        return codeLanguage;
    }

    public void setCodeLanguage(String codeLanguage) {
        this.codeLanguage = codeLanguage;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "SourceLanguage{" +
                "id=" + id +
                ", sourceLanguage='" + sourceLanguage + '\'' +
                ", codeLanguage='" + codeLanguage + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
