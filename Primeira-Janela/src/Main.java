import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Exemplo", "Exemplo", JOptionPane.INFORMATION_MESSAGE);
        
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        JOptionPane.showMessageDialog(null,"Hey " + nome +" Welcome");
        
        int resposta = JOptionPane.showConfirmDialog(
            null,
            "Deseja continuar?",
            "Confirmação",
            JOptionPane.YES_NO_OPTION
        );
        if(resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,"Você escolheu continuar");
        } else {
            JOptionPane.showMessageDialog(null,"Você escolheu não continuar");
  
        }
    
    }
}