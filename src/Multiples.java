public class Multiples {
    public static void main(String[] args) {

        int counter = 0;
        int x = 1;

        while (x < 1000)
        {
            boolean divisibleBy3 = x % 3 == 0;
            boolean divisibleBy5 = x % 5 == 0;

            if (divisibleBy3 || divisibleBy5)
            {
                counter++;
            }

            x++;
        }

        System.out.println(counter);

    }
}
