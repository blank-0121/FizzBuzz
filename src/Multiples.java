public class Multiples {
    public static void main(String[] args) {

        int x = 1;
        int counter = 0;

        while (x < 1000)
        {
   
            if (x % 3 == 0 || x % 5 == 0)
            {
                counter++;
            }

            x++;
        }

        System.out.println(counter);

    }
}
