import javax.swing.JOptionPane;

public class atividadeExtra {
    
    public static void main(String[] args) {
        
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite qual tabuada deseja visualizar (6, 7, 8, 9, 10). \nDigite apenas números.")); // Solicitando a escolha de tabuada

        for (int i = 1; i <= 10; i++) { // Inicio do For limitado a 10 repetições
            int resultado = escolha * i; // Calculo antecipado do resultado
            System.out.println(escolha + " X " + i + " = " + resultado); // Impressão da tabuada
        } // Fim do For
    }
}