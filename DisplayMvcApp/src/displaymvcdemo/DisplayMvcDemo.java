package displaymvcdemo;

import javax.swing.SwingUtilities;

/**
 * Based on program in Big Java: Late Objects by Cay Horstmann; modified
 */
public class DisplayMvcDemo {

    public static void main(String[] args) {
        // https://docs.oracle.com/javase/tutorial/uiswing/concurrency/initial.html
        SwingUtilities.invokeLater(() -> {
            StudentCntl cntl = new StudentCntl();
        });

    }

}
