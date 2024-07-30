import javax.swing.JOptionPane;

public class cinema {
    public static void main(String[] args) {

        int idade, visitantes = 40, quantOtimo = 0, quantRuim = 0, quantPessimo = 0; // Declaração de variáveis utilizadas no programa
        float mediaIdadeRuim = 0, porcentagemPessimo;

        JOptionPane.showMessageDialog(null, "Bem vindo a pesquisa de satisfação do Cinema!"); // Introdução à pesquisa

        for (int i = 1; i <= visitantes; i++) { // Inicio do For; a variável 'visitantes' delimita a quantidade, podendo ser facilmente alterada na declaração
            idade = Integer.parseInt( // Solicitando idade do entrevistado e registrando como Int
                    JOptionPane.showInputDialog("Para iniciarmos a pesquisa, primeiramente informe sua idade."));
            String aux = JOptionPane.showInputDialog( // Solicitando a escolha e registrando em uma variável auxiliar
                    "Qual seu nível de satisfação com nosso atendimento?\n A - Ótimo \n B - Bom \n C - Regular \n D - Ruim \n E - Péssimo");
            aux = aux.toUpperCase(); // Alterando escolha para caixa alta para evitar posspíveis erros

            if (!aux.equals("A") && !aux.equals("B") && !aux.equals("C") && !aux.equals("D") && !aux.equals("E")) { // Ínicio do If
                JOptionPane.showMessageDialog(null, "Escolha não identificada, por favor digite novamente."); // Tratamento de excessões
            } else if (aux.equals("A")) { // Caso escolha 'a' será registrado na variável 'quantOtimo'
                quantOtimo++;
            } else if (aux.equals("D")) { // Caso escolha 'd' será registrado na variável 'quantRuim'
                mediaIdadeRuim += idade; // Neste caso, a idade do entrevistado é registrada na variável 'mediaIdadeRuim'
                quantRuim++;
            } else if (aux.equals("E")) { // Caso escolha 'e' será registrado na variável 'quantPessimo'
                quantPessimo++;
            } // Fim do If
        } // Fim do For; neste programa as escolhas 'b' e 'c' são desconsideradas

        mediaIdadeRuim = mediaIdadeRuim / quantRuim; // Calculo da média das idades com base nos entrevistados que escolheram 'Ruim'
        porcentagemPessimo = (quantPessimo * 100) / visitantes; // Calculo que retorna a porcentagem de respostas 'Péssimo'

        JOptionPane.showMessageDialog(null, // Mostrando a relação de dados obtida
                "Ao fim da pesquisa, tivemos essa relação: \n Quantidade de respostas 'Ótimo': " + quantOtimo
                + "\n Média de idade das pessoas que responderam 'ruim': " + mediaIdadeRuim
                + "\n Porcentagem de respostas 'péssimo': " + porcentagemPessimo + "%");
    } // Fim do programa Main
} // Fim da Classe