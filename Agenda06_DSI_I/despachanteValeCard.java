package Agenda06_DSI_I;
import javax.swing.JOptionPane;

public class despachanteValeCard {
    public static void main (String[] args) {

        // Declaração de variaveis
        int escolha;

        escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite apenas o último número da placa de seu veiculo para consultar o vencimento do IPVA: ")); // Solicitando o digito ao usuário

        switch (escolha) { // Criação do switch para tratamento do número digitado.
            case 1:
            JOptionPane.showMessageDialog(null, "O pagamento deve ser realizado até 30/04");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "O pagamento deve ser realizado até 31/05");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "O pagamento deve ser realizado até 30/06");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "O pagamento deve ser realizado até 31/07");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "O pagamento deve ser realizado até 31/08");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "O pagamento deve ser realizado até 30/09");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "O pagamento deve ser realizado até 31/10");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "O pagamento deve ser realizado até 30/11");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "O pagamento deve ser realizado até 31/12");
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "O pagamento deve ser realizado até 31/12");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ocorreu um erro: digito incorreto! \nPor favor digitar apenas o último número da placa."); // Caso o usuário digite mais que um digito
                break;
        }
        
    }
}