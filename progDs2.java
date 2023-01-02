import java.util.ArrayList;
import java.util.Random;

public class progDs2
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

        System.out.println("Исходный список:\n" + lst);
        int i = 0;
        while (i < lst.size()) 
        {
            if (lst.get(i) % 2 == 0) 
            {
                lst.remove(i);
            }
            else 
            {
                i++;
            }
        }
        System.out.println("Результат удаления чётных чисел из списка:\n" + lst);
    }
}
