public class Hello {
    final static int delayMs = 200;

    public static void main(String[] args) {
        try {
            System.out.print("\n");
            delayPrint("            +-------------------------------------------------------+");
            delayPrint("           /                                                       /|");
            delayPrint("          /                JAVA DOCKER EXAMPLE #3                 / |");
            delayPrint("         /                                                       /  |");
            delayPrint("        *-------------------------------------------------------*   |");
            delayPrint("        |                                                       |   |");
            delayPrint("        |    There once was a great reception,                  |   |");
            delayPrint("        |    When Java had its conception.                      |   |");
            delayPrint("        |    For many fell in love,                             |   |");
            delayPrint("        |    But none could rise above,                         |  /");
            delayPrint("        |    When they encountered a null pointer exception.    | /");
            delayPrint("        |                                                       |/");
            delayPrint("        *-------------------------------------------------------*");
            System.out.print("\n\n\n");
            System.out.flush();
        } catch (InterruptedException ex) {
            System.out.println("Our simple java application crashed. How embarrassing! ಠ_ಠ");
            System.out.println(ex.getMessage());
        }
    }

    static void delayPrint(String msg) throws InterruptedException {
        System.out.println(msg);
        Thread.sleep(delayMs);
    }
}
