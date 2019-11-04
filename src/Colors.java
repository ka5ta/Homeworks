import java.util.Scanner;

public class Colors {

    public static void getColor() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("What colour do you want?");
            String color = sc.next().toUpperCase();

            switch (color) {
                case "R":
                    System.out.println("You have choosen Red");
                    break;
                case "G":
                    System.out.println("You have choosen Green");
                    break;
                case "B":
                    System.out.println("You have choosen Blue");
                    break;
                case "Q":
                    System.out.println("Game ended");
                    return;
                default:
                    System.out.println("Unknown color: " + color);
            }
        }
    }

    public static void main(String[] args) {
        getColor();
    }
}
