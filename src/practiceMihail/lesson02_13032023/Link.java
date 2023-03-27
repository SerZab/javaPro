package practiceMihail.lesson02_13032023;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@AllArgsConstructor
@NoArgsConstructor
@Getter

public class Link {
    String name;
    String colorType;
    String text;
    Page page;

    private final static Random RANDOM = new Random();


    static public Page goToPage(Link link){
        log();
        scan();
        return link.getPage();
    }
    public static void log(){
        System.out.println(RANDOM.nextInt(12));
    }
    public static void scan(){
        System.out.println(RANDOM.nextInt(12));
    }
}
class Page{
    String name;
    List<Link> list = new ArrayList<>();
}
class Mains {
    public static void main(String[] args) {
        Link link = new Link("Github.com", "Black", "Text", new Page());
        link.goToPage(new Link());
    }
}
