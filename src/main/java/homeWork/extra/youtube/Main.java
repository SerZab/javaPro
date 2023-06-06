package homeWork.extra.youtube;

import java.util.*;

public class Main {
    private final static String ROUTE = "Москва Рязань Самара Краснодар Бранск Калининград " +
            "Пермь Хабаровск Владивосток";

    public static void main(String[] args) {
        Map<String,String> first = new HashMap<>();
        Map<String,String> second = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String current = null;

        Path[] paths = init();
        for (Path path : paths){
            first.put(path.getTo(), path.getFrom());
            second.put(path.getFrom(), path.getTo());
        }
        for (Map.Entry<String,String> entry : first.entrySet()){
            String value = entry.getValue();
            if (!first.containsKey(value)){
                current = value;
                sb.append(current);
                break;
            }
        }
        while (second.containsKey(current)){
            current = second.get(current);
            sb.append(" ").append(current);
        }
        String result = sb.toString();
        System.out.printf("Результат ==> %s", result);
        System.out.println();
        System.out.printf(" Результат и входная строка равны? %b",result.equals(ROUTE));
        
    }
    private static Path[] init(){
        String[] cities = ROUTE.split(" ");
        List<Path> paths = new ArrayList<>();
        for (int i = 0; i < cities.length - 1; i++) {
            Path path = new Path(cities[i], cities[i+1]);
            paths.add(path);
        }
        Collections.shuffle(paths);
        Path[] arr = new Path[paths.size()];
        return paths.toArray(arr);
    }
}
