package homeWork.homeworkPractice01_13032023;

public class googleTranslate {
    public static void main(String[] args) {
        User user1 = new User("Sergey", "cvz@ukr.net", "123456");
        User user2 = new User("Mihail", "mixx@mail.ru", "7891020");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println("--------------");
        SourceLanguage sourceLanguage1 = new SourceLanguage(1,"Russian", "ru", "Привет мир");
        SourceLanguage sourceLanguage2 = new SourceLanguage(2, "English", "en", "I love Java!");
        System.out.println(sourceLanguage1);
        System.out.println(sourceLanguage2);
        System.out.println("--------------");

    }
}




