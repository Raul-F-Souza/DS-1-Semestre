import javax.swing.JOptionPane;

public class vetor {

    public static void main(String[] args) {

        // Declaração de variáveis utilizadas no programa
        double[] alturas = new double[10];
        double maiorAltura = 0, auxAltura;
        int aux = 0;

        do { // Inicio do laço de repetição
            auxAltura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura (Ex: 1.75) :")); // Solicitando a altura
            if (auxAltura > 1.4 && auxAltura <= 2.3) { // Primeiro If; Verificando se a altura inserida está dentro da especificação
                if (auxAltura > maiorAltura){ // Segundo If; Segunda verificação que confere se a altura digitada é maior que a digitada anteriormente
                    maiorAltura = auxAltura; // Caso a altura digitada seja maior que a anterior, será adicionada a variável maiorAltura
                    alturas[aux] = auxAltura; // Adicionando a altura digitada ao vetor

                } else{ // Else referente ao primeiro If; Else para acrescentar a altura digitida no vetor mesmo que ela seja menor a anterior.
                    alturas[aux] = auxAltura; // Adicionando a altura digitada ao vetor
                }

                aux++; // Adicionando +1 na variável auxiliar que também opera como contador

            } else{ // Else referente ao segundo If; Tratamento de exceções para caso a altura digitada esteja fora do razoável
                JOptionPane.showMessageDialog(null, "A altura digitada está fora do limite rasoável para um adulto. \nPor favor, digite novamente.");
            }

        } while (aux < alturas.length); // Fim do laço de repetição após 10 alturas digitadas

        JOptionPane.showMessageDialog(null, "A maior altura digitada foi: " + maiorAltura + "m"); // Exibindo a maior altura
    
    } // Fim da programa
}// Fim da Class
