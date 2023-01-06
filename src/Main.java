import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("zde napiš své jméno");
        JOptionPane.showMessageDialog(null, "Ahoj " + name);
        int vek = Integer.parseInt(JOptionPane.showInputDialog("zde napiš svůj věk"));
        JOptionPane.showMessageDialog(null, "máš " + vek + " let");
        double vyska = Double.parseDouble(JOptionPane.showInputDialog("Jak jsi vysoký?"));
        JOptionPane.showMessageDialog(null, "Jsi " + vyska + "cm vysoký");
    }
}