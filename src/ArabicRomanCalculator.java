import java.util.InputMismatchException;
import java.util.Scanner;

public class ArabicRomanCalculator {
    static Scanner scanner = new Scanner(System.in);
    static int a; //первое слагаемое
    static int b; // второе слагаемое
    static String romanresult; // результат в римских цифрах
    static int arabicresult; // результат в арабских цифрах
    public static void main(String[] args)
    {
        System.out.println("Введите два числа от 1 до 10 в виде двух арабских (1...9) или римских (I...X) символов, знак арифметеической операции между ними, и нажмите Enter ");

        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int numberOfElements = parts.length;


        if ((numberOfElements!=3)|| ((!parts[1].equals("+"))&&(!parts[1].equals("-"))&&(!parts[1].equals("/"))&&(!parts[1].equals("*"))))
        {
            throw new InputMismatchException("Некорректное выражение");
        }//проводим первичную проверку - во введённом выражении должно быть три составляющих и вторая составляющая должжна быть символом алгебраической операции
        Roman roman = new Roman();
        ArithmeticalProcessing processing = new ArithmeticalProcessing();

        // Проверяем на наличие римских цифр:
        boolean ifaIsRome =  roman.ifcontainsroman(parts[0]);
        boolean ifbIsRome = roman.ifcontainsroman(parts[2]);

        //Если первая и третья сотавляющая ввода являются римкими цифрами, преобразуем в int и, проверив на допустимый диапазон значений, обрабатываем в арифметическом блоке
        if (ifaIsRome&&ifbIsRome)
        {

            a =  roman.romanToNumber(parts[0]);
            b = roman.romanToNumber(parts[2]);
            if (!processing.ifNubersWithinInterval(a,b))
            {throw new InputMismatchException("Недопустимый диапазон вводных значений");}



            arabicresult = processing.calculation(a, b, parts[1]);
            try
            {
                romanresult = roman.romanarray[arabicresult - 1];
                System.out.println(romanresult);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Недопустимый диапазон выходных значений");
                throw e;
            }
        }
        //Если первая и третья составляющая не являются одновременно римскими цифрами, парсим их на int.
        else {
            try {
                a = Integer.parseInt(parts[0]);
                b = Integer.parseInt(parts[2]);
            }
            catch (Exception e)
            {
                System.out.println("Неверный формат данных");
                throw e;
            }
            if (!processing.ifNubersWithinInterval(a,b))
            {
                throw new InputMismatchException("Недопустимый диапазон вводных значений");
            }
            arabicresult = processing.calculation(a, b, parts[1]);
            System.out.println(arabicresult);
        }
    }




}
