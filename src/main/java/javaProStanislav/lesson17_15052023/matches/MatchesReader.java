package javaProStanislav.lesson17_15052023.matches;


import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MatchesReader {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("matches.txt"));
        String ln;

        Map<Integer,Matches> matches = new HashMap<>();
        int count = 1;
        while ((ln = br.readLine()) != null){
            Matches matches1 = getMatches(ln);
            matches.put(count,matches1);
            count++;
        }
//        for(Map.Entry<Integer,Matches> entry : matches.entrySet()){
//            System.out.println(entry.getKey()+". "+entry.getValue());
//        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./src/javaProStanislav/lesson17_15052023/matches/matches.txt"))) {
            for (Map.Entry<Integer, Matches> entry : matches.entrySet()) {
                writer.write(entry.getKey() + ". " + entry.getValue());
                writer.newLine();
            }
            System.out.println("Файл успешно создан и данные записаны.");
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла или записи данных: " + e.getMessage());
        }
    }
    public static Matches getMatches(String ln){
        String[] s = ln.split(", ");
        String date = s[2]+":"+s[1]+":"+s[0];
        String team1 = s[3];
        String team2 = s[5];
        String result = s[4];
        String watchers = s[6];
        String stadium = s[7];
        return new Matches(date,team1,team2,result,watchers,stadium);
    }
}
