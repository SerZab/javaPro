package javaProStanislav.lesson30_03072023.reflection.example4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SampleExercise {
    /*
    1) создать новый объект
    2) получить имя конструктора
    3)получить публичные методы класса
    4) создать объект из метода2 и запустить его
    5) создать объект из поля s и заменить его значение на "группа 48m"
    6) создать объект из методов 1 и 3 и их запустить
     */

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Sample sample = new Sample(); // 1

        Class cls = sample.getClass();
        System.out.println("Имя класса " + cls.getName());

        Constructor constructor = cls.getConstructor(); // 2
        System.out.println("Конструктор: " + constructor.getName());

        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Method method2 = Sample.class.getMethod("method2", int.class); // 3
        method2.invoke(sample, 3);

        Field field = Sample.class.getDeclaredField("s"); // 4
        field.setAccessible(true);
        field.set(sample, "Группа 48m");

        Method method1 = cls.getDeclaredMethod("method1"); // 5
        method1.invoke(sample);

        Method method3 = cls.getDeclaredMethod("method3"); // 6
        method3.setAccessible(true);
        method3.invoke(sample);
        
    }
}
