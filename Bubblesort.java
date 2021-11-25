import java.util.Scanner;
 public class Bubblesort {
  public static void main(String []args) {
    int n;
    Scanner input = new Scanner(System.in);
    n = input.nextInt();
    int array[] = new int[n];
     System.out.println("Enter " + n + " integers");
     for (int i = 0; i < n; i++)
      array[i] = input.nextInt();
   
    for (int i = 0; i < n - 1; i++) {
   Boolean swapped = false;
      for (int j = 0; j < n - i - 1; j++) {
        if (array[j] > array[j+1])
        {
          int temp = array[j];
          array[j]= array[j+1];
          array[j+1] = temp;

      swapped = true;
        }
      }
   if(!swapped)
      break;
   } 
System.out.println("Sorted list of numbers:");
for (int i = 0; i < n; i++)
System.out.println(array[i]);
  }
}

