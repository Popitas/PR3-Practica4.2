
import javax.swing.JFrame;

public class App {

    private static Vector vector;

    public static void main(String[] args) {
        vector = GeneraVector.generaVectorAleatorio(50, 200);
        JFrame frmPrincipal = new FrmPrincipal();

        frmPrincipal.setLocationRelativeTo(null);
        frmPrincipal.setVisible(true);
    }

    public static Vector getVector() {
        return vector;
    }

}
