import java.util.*;

public class Hello {


    public static void main(String[] args) {
        try {
            int delay = 200;
            System.out.println("");
            System.out.println("           +-------------------------------------------------------+");
            Thread.sleep(delay);
            System.out.println("          /                                                       /|");
            Thread.sleep(delay);
            System.out.println("         /                                                       / |");
            Thread.sleep(delay);
            System.out.println("        *-------------------------------------------------------*  |");
            Thread.sleep(delay);
            System.out.println("        |                                                       |  |");
            Thread.sleep(delay);
            System.out.println("        |    There once was a great reception,                  |  |");
            Thread.sleep(delay);
            System.out.println("        |    When Java had its conception.                      |  |");
            Thread.sleep(delay);
            System.out.println("        |    For many fell in love,                             |  |");
            Thread.sleep(delay);
            System.out.println("        |    But none could rise above,                         |  |");
            Thread.sleep(delay);
            System.out.println("        |    When they encountered a null pointer exception.    | /");
            Thread.sleep(delay);
            System.out.println("        |                                                       |/");
            Thread.sleep(delay);
            System.out.println("        *-------------------------------------------------------*");
            System.out.println("");
            System.out.flush();
        } catch (InterruptedException e) {
            System.out.println("Our simple java application crashed ಠ_ಠ");
        }
    }
}
