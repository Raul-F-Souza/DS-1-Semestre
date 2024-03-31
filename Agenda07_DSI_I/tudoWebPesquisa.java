import javax.swing.JOptionPane;

public class tudoWebPesquisa {

    public static void main(String[] args) {
        int quantExcelente = 0, quantBom = 0, quantRuim = 0; // Criação das variáveis auxiliares

        for (int i = 0; i < 10; i++) { // Iniciação de laço de repetição com o limitador de 10 repetições
            JOptionPane.showMessageDialog(null, "Bem vindo a pesquisa de satisfação da Tudo Web."); // Apresentação da pesquisa
            String nome = JOptionPane
                    .showInputDialog("Para dar inicio a pesquisa precisamos iniciamente do seu nome: "); // Solicitando o nome do entrevistado
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Agora informe sua idade: ")); // Solicitando a idade do entrevistado

            int escolha = Integer.parseInt(JOptionPane.showInputDialog(
                    "Qual seu nível de satisfação com nosso atendimento?\n 1 - Excelente\n 2 - Bom\n 3 - Ruim")); // Solicitando o nível de satisfação do entrevistado
            switch (escolha) { // Iniciação do switch para armazenar a quantidade de cada escolha
                case 1:
                    quantExcelente += 1; // Caso o entrevistado escolha '1', será resgistrado na variável
                    break;
                case 2:
                    quantBom += 1; // Caso o entrevistado escolha '1', será resgistrado na variável
                    break;
                case 3:
                    quantRuim += 1; // Caso o entrevistado escolha '1', será resgistrado na variável
                    break;
                default:
                    JOptionPane.showMessageDialog(null, // Tratamento de exceções para caso não seja digitado um número de 1 a 3
                            "Desculpe, mas não foi possível identificar a escolha.\n Tente novamente digitando apenas: 1, 2 ou 3.");
                    break;
            } // Fim do switch
        } // Fim do For

        JOptionPane.showMessageDialog(null, // Exibição da quantidade de cada escolha
                "Após a pesquisa com 10 entrevistados tivemos a seguinte relação:\n Quantos entrevistados acharam Excelente: "
                        + quantExcelente + "\n Quantos entrevistados acharam Ruim: " + quantRuim);
    }
}