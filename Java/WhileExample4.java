/*Name the class: WhileExample4
Should just contain a main method
Sum all the numbers from 1 to 10 using a while loop
Display your final answer */
public class WhileExample4
{
    public static void main(String[] args)
    {
        int i = 1;
        int total = 0;
        while (i <= 10)
        {
            //System.out.println(i);
            total = total + i;
            i++;
            //System.out.println("Total: " + total);
        }
        System.out.println("Total: " + total);
    }
}