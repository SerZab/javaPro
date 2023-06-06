package javaProStanislav.lesson18_17052023;

public class RegEx4 {
    public static void main(String[] args) {
        String string = "привет Антон Александр Алла Андрей";
        String str = "ddfcat recat23 supercat23_super name@cyprus.de name24@mail.ru.com regcattt5_e 1cat7.6 2cat333";

        String reg = "А.+"; // жадный режим поиска
        String reg1 = "А.+?а";
        String reg2 = "cat\\w*\\.*\\w*";
        String reg3 = "cat\\S*";
        String reg4 = "(\\w*)cat\\S*";

//        RegEx1.patternReg(string,reg);
//        RegEx1.patternReg(string,reg1);
//        RegEx1.patternReg(str,reg4);

        String inputString = "java, the best% programming  language? in the. World!";
        String[] words = inputString.split("[\\s,%\\.\\?!]+");
        String reg5 = "\\w+@\\w+\\.[a-zA-Z]{2,3}(\\.[A-Za-z]{2,3})?";
        // System.out.println(Arrays.toString(words));
        //RegEx1.patternReg(str,reg5);

        String inp = "java Java JAVA j.a.v.a Jaaava JavaSE";
        String regEx = "[Jj]\\.?[Aa]+\\.?[Vv]\\.?[Aa](SE)?";
        //RegEx1.patternReg(inp,regEx);
        String inp1 = "A(a,b,c)(x,y,z)Z 1 2 3 4 5";
        String regEx1 = "[^\\s\\d]+";
        RegEx1.patternReg(inp1,regEx1);

        // написать регулярное выражение которое соответствует номеру телефона 7 последовательных цифр

        String regEx2 = "\\+\\(\\d{3,4}\\) \\d{3}-\\d{4}";;
        String telNumber = "+ 1 (993) 123-3456";
        String regEx3 = "\\+\\d{1,2}\\s?\\(\\d{2,3}\\)\\s?\\d{3}-\\d{4}";
        RegEx1.patternReg(telNumber,regEx3);

    }
}
