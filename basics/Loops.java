public class Loops {
    public static void main(String[] args) {
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("While loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("Do-while loop:");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);
    }
}
