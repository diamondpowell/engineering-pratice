public class SmallestEvenMultiple {
    public static int smallestEvenMultiple(int n)
    {
        // given a positive integer n
        // return smallest positive number that is
        // a multiple of both 2 and n

        // n = 5
        // 5 mulitple of 5? yes
        // 5 multiple of 2? no
        // 10 multipe of 5? yes
        // 10 multiple of 2? yes
        // answer = 5 * 2

        // n = 8
        // 8 muiltiple of 8? yes
        // 8 multiple of 2? yes

        // if n is even, use the same number
        // if n is odd, multiply by 2

        if (n % 2 == 0)
        {
            return n;
        }
        else
        {
            return n * 2;
        }
    }
    public static void main (String[] args){
        System.out.println(smallestEvenMultiple(6));
    }
}
