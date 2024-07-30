import javax.swing.JOptionPane;

public class atividadeExtra {

    public static void main(String[] args) {

        int escolha, resultado, aux = 1; // Declaração de variáveis utilizadas no programa

        escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para mostrar sua tabuada até 10:")); // Solicitando o número para tabuada

        do { // ìnicio do Do While
            resultado = aux * escolha; // Realizando o calculo do resultado antecipadamente e resgistrando na variável 'resultado'
            System.out.println(escolha + " X " + aux + " = " + resultado); // Exibindo tabuada do número solicitado

            aux++; // Adicionado +1 na variável auxiliar que também opera como contador
        } while (aux <= 10); // Fim do Do While após 10 repetições
    } // Fim do programa
} // Fim da Classe