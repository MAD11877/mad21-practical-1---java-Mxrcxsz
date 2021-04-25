import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    List<Integer> intList = new ArrayList<Integer>();
    List<Integer> mode = new ArrayList<Integer>();

    // System.out.println("Enter a number: ");
    int num = in.nextInt();

    while(num > 0){
      // System.out.println("Enter an integer: ");
      int nums = in.nextInt();
      intList.add(nums);
      mode.add(intList.get(0));
      mode.add(1);
      for(int i : intList){
        int count = 0;
        for(int j : intList){
          if(i == j){
            count++; 
          }
          if(count > mode.get(1)){
            mode.set(0, j);
            mode.set(1, count);
          }
        }
      }
      num--;
    }
    System.out.println(mode.get(0));
    
  }
}
