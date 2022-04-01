public class ArithmeticalProcessing
{

    //Метод для арифметической обработки ввода
    public int calculation(int a, int b, String sign)
    {
        int result=0;
        switch(sign)
        {
            case "+": result = a+b;
                break;
            case "-": result = a-b;
                break;
            case "/": result = (int) ((double)a/(double)b);
                break;
            case "*": result = a*b;
                break;

        }
        return result;
    }
    //Метод для проверки на приемлемый диапазон значений
    public boolean ifNubersWithinInterval (int a, int b)
    {
        return a<=10&&a>=1&&b<=10&&b>=1;
    }



}
