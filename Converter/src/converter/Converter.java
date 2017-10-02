package converter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
// Aplicação para Converter String para ASCII entre outras conversões
public class Converter extends JFrame {

    private static String b;

    public Converter() {
    }

    public static void main(String[] args) {
        // Função Principal
        do{
        String s = JOptionPane.showInputDialog("String: ");
        b = "\n";
        for (char c : s.toCharArray()) {
            b += (c + " = " + Integer.toBinaryString((c))) + '\n';
        }
        String aux = "";
        String aux2 = "";
        for (int i=0; i< s.toCharArray().length; i++){
            aux += s.toCharArray()[i] + " = " + (int)s.toCharArray()[i] + "\n";
            aux2 += s.toCharArray()[i] + "=" + Integer.toBinaryString((int)s.toCharArray()[i]) + "\n";
        }
        System.out.println(aux);
        try {
            b += s + " = " + Integer.toBinaryString(Integer.parseInt(s));
            JOptionPane.showMessageDialog(null, "Numero em Binario" + b + "\n\nNumero em Decimal = " + Integer.parseInt(s) + "\n\nEm ASCII: \"" + (char) Integer.parseInt(s) + "\"");
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Numero em Binario ASCII \n" + aux2 + "\nEm Decimal ASCII \n" + aux);
        }
        }while(JOptionPane.showConfirmDialog(null, "Deseja Realizar nova conversão? ") == 0);
    }

}
