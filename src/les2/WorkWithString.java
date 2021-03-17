package les2;

import java.util.Arrays;

public class WorkWithString {
    public static void main(String[] args) {
        String s = "1323435363738390";
        String ss = ",1,,2,34,512,34,5,,1,,2,34,5,";
        String ss2 = ",,,1,2,3,4,,,,1,2,3,5,,,,";
        System.out.println(expandString(s));
        System.out.println(charRepeat(s, '3'));
        System.out.println(Arrays.toString(stringInStringArray(ss, ',')));
        System.out.println(Arrays.toString(stringInStringArray(ss2, ',')));

    }

    // Создать метод, который получает на вход текст(String) и символ(char).
    // Возвращает int значение кол-ва повторений данного символа в тексте.
    public static int charRepeat(String s, char c) {
        int repeatChar = 0;
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c)
                repeatChar++;
        }
        return repeatChar;
    }

    //  Создать метод, который получает строку(String) и переворачивает его. Пример -> “12345” -> “54321”
    public static String expandString(String s) {
        String expandString = "";
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            expandString += array[array.length - i - 1];
        }
        return expandString;
    }

    //Создать метод, который разделяет строку(String) на массив(String[]) по символу(char).
    // Пример -> “1,2,34,5” -> [“1”,”2”,”34”,”5”]
    public static String[] stringInStringArray(String string, char separator) {
        char[] charArray = string.toCharArray();
        int lenArray = 0;
        for (int i = 1; i < charArray.length; i++) {
            if(charArray[i] == separator && charArray[i-1] != separator)
                lenArray++;
        }

        String[] stringArray = new String[lenArray];
        int index = 0;
        String s = "";
        for (int i = 0; i < charArray.length; i++) { //",1,,2,34,5,"
            if (charArray[i] != separator) {
                s += charArray[i];
            }
            if (charArray[i] == separator && !s.equals("")) {
                stringArray[index] = s;
                s = "";
                index++;
            }
        }
        return stringArray;
    }

}
