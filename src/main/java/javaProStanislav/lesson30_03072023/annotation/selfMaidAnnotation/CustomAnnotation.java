package javaProStanislav.lesson30_03072023.annotation.selfMaidAnnotation;

public @interface CustomAnnotation {

    int value();
    String[] names();

    Color color();

    Class<Person> getPersonInfo();


}
