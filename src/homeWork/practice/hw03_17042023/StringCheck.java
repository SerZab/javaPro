package homeWork.practice.hw03_17042023;

public class StringCheck {

    public static void main(String[] args) {
        String str1 = "as#a#";
        String str2 = "a";
        System.out.println(deleteSymbolMethod(str1).equals(deleteSymbolMethod(str2)));

        String str3 = "as##s";
        String str4 = "s";
        System.out.println(deleteSymbolMethod(str3).equals(deleteSymbolMethod(str4)));

        System.out.println(deleteSymbolMethod("asas##a").equals(deleteSymbolMethod("as")));
        System.out.println(deleteSymbolMethod("##aa").equals(deleteSymbolMethod("aa")));
    }

    private static String deleteSymbolMethod(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '#'  && stringBuilder.length() > 0) {
                // обязательно проверить длину, так как если начинается с решетки, то выдает ошибку / Exception
                stringBuilder.deleteCharAt(stringBuilder.length() - 1); // удалить символ до #
            } else if (c != '#') {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
