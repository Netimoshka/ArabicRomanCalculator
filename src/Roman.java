import java.util.ArrayList;
import java.util.List;

public class Roman {

    ArrayList<String> list = new ArrayList<>();
    String[] romanarray = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};


    //Метод для извлечения числа из римских символов
    public  int romanToNumber (String romanNumber) {
        int result=0;
        switch (romanNumber) {
            case "I":
                result = 1;
                break;
            case "II":
                result= 2;
                break;
            case "III":
                result= 3;
                break;
            case "IV":
                result= 4;
                break;
            case "V":
                result= 5;
                break;
            case "VI":
                result= 6;
                break;
            case "VII":
                result= 7;
                break;
            case "VIII":
                result = 8;
                break;
            case "IX":
                result= 9;
                break;
            case "X":
                result = 10;
                break;
        }
        return result;
    }

    //Метод по проверке на наличие римской цифры
    public boolean ifcontainsroman (String symbol)
    {
        List<String> romanlist = new ArrayList<>();
        for (int a=0; a<10; a++)
        {
            romanlist.add(romanarray[a]);
        }
        return romanlist.contains(symbol);
    }

}