public class MultiplicationTable {

    public static void calculation(){

        System.out.printf("   | ");
        for (int firstRow = 1; firstRow <=10 ; firstRow++) {
            System.out.printf("%2d ", firstRow);
        }

        System.out.print("\n");
        System.out.print(" ".repeat(3));
        System.out.print("┠");
        System.out.print("─".repeat(30));
        System.out.print("\n");

        for (int row = 1; row <=10; row++) {
            System.out.printf("%2d │ ",row);
            for (int columns = 1; columns <=10 ; columns++) {
                System.out.printf("%2d ",row*columns);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        calculation();
    }
}
