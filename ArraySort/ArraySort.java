import java.util.Scanner;

public class ArraySort {

 public static void fillArray (int[] array)
 {
  Scanner sc = new Scanner(System.in);
  for (int i = 0; i < array.length; i++)
  { 
   System.out.println ("Enter value for element " + i);
   array[i] = sc.nextInt();
  }
 }
 public static void printArray(int[] array)
 {
  for (int i = 0; i < array.length; i++)
  { 
   System.out.println (array[i]);
  }
 }
 
 public static void sortArray(int[] array)

 {
  int temp;
  boolean swapped;
  do
  {
   swapped = false;
   for (int i = 0; i < array.length - 1; i++)
   {
    if (array[i] > array[i + 1])
    {
     temp = array[i];
     array[i] = array[i + 1];
     array[i + 1] = temp;
     swapped = true;
    }
   }
  } 
  while (swapped == true);
 }
 public static void main(String[] args) 
{
  
  int i;
   
  do
  {
   System.out.println ("Enter the size of the array (3 - 10): ");
   Scanner n = new Scanner(System.in);
   i = n.nextInt();
   
  } while (i < 3 || i > 10);
    
  System.out.println ("Enter " + i + " values");
  
  int[] array= new int[i];
 
  ArraySort.fillArray(array);
    
  System.out.println ("The unsorted values…");
  
  ArraySort.printArray(array);
  
  System.out.println ("The sorted values…");
  
  ArraySort.sortArray(array);
  
  ArraySort.printArray(array);

}
}