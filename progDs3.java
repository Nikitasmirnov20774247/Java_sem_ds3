import java.util.ArrayList;
import java.util.Random;

public class progDs3  
{
    public static void main(String[] args) 
    {
        Random random = new Random();
        ArrayList<Integer> lst = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) 
        {
            int val = random.nextInt(100);
            lst.add(val);
        }
        System.out.println("Исходный список: " + lst);

        int min = lst.get(0);
        int max = min;
        double sumNum = 0;
        for (int i : lst)
        {
            if (i > max) 
            {
                max = i;
            }
            if (i < min) 
            {
                min = i;
            }
            sumNum += i;
        }
        double average = sumNum/lst.size();
        
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        System.out.println("Среднее арифметическое число: " + average);
    }
}
