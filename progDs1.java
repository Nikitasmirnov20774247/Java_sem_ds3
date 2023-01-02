import java.util.Arrays;
import java.util.Random;

public class progDs1 
{
    public static void main(String[] args) 
    {
        Random random = new Random();
        int[] array = random.ints(20, 1, 100).toArray();
        System.out.println("Массив случайных чисел:\n" + Arrays.toString(array));
        mergeSort(array);
        System.out.println("Результат сортировки слиянием:\n" + Arrays.toString(array));
    }

    public static void mergeSort(int[] array) 
    {
        if (array.length > 1) 
        {
            int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
            int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);

            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }
    }

    private static void merge(int[] array, int[] left, int[] right) 
    {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) 
        {
            if (left[i] < right[j]) 
            {
                array[k] = left[i];
                i++;
            } 
            else 
            {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        
        while (i < left.length) 
        {
            array[k] = left[i];
            i++;
            k++;

        }
        while (j < right.length) 
        {
            array[k] = right[j];
            j++;
            k++;
        }
    }
}
