
package noice;

public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page().setVisible(true);
            }
        });
    }
    
}
