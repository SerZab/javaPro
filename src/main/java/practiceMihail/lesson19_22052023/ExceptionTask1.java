package practiceMihail.lesson19_22052023;

public class ExceptionTask1 {

    public static void main(String[] args) {
//  Задача 1: Уровень сложности 6/10
//  Создайте пользовательское исключение InvalidDataException,
//  которое наследуется от RuntimeException. Напишите метод, который принимает строку и выбрасывает
//  InvalidDataException, если длина строки превышает 10 символов. Поместите вызов этого метода в блок try-catch
//  и обработайте исключение, выводя сообщение об ошибке.

        String str = "Строка длинее 10 символов";

        try {
            checkString(str);
        } catch (InvalidStr e) {
            System.out.println(e.getMessage());
        }
    }
    static void checkString(String str) {
        if (str.length() > 10) {
            throw new InvalidStr("Ошибка,превышена длина");
        }
    }
}
class InvalidStr extends RuntimeException {
    public InvalidStr(String message) {
        super(message);
    }
}
