package javaProStanislav.lesson15_08052023.methodReference;

public class Example3User {
    public static void main(String[] args) {
        UserFactory userFactory = User::new;
        UserFactory userFactory1 = (n, s) -> new User(n,s);
        User user = userFactory1.create("John","Smith");

    }
}
