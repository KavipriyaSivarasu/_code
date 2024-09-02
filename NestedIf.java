public class NestedIfExample {
    public static void main(String[] args) {
        int number = 8;

        if (number > 5) {
            if (number < 10) {
                System.out.println("The number is between 5 and 10.");
            } else {
                System.out.println("The number is greater than or equal to 10.");
            }
        } else {
            System.out.println("The number is 5 or less.");
        }
    }
}
