package Agenda10_DSI_I;

import javax.swing.JOptionPane;

public class matrizes {
    
    public static void main(String[] args) {
        
        // Declaração de variáveis utilizadas no programa
        int[][] matriz = new int[3][3];
        int linha, coluna, soma = 0;

        for (linha = 0; linha < 3; linha++) { // Incio do For utilizado para obter a linha da matriz
            for (coluna = 0; coluna < 3; coluna++) { // inicio do segundo For para obter a coluna da matriz

                // Solicitação de entrada com números inteiros para matriz 3x3
                matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite números inteiros para o elemento [" + linha + "] [" + coluna + "] da matriz 3x3:"));

            } // Fim do segundo For
        } // Fim primeiro For

        for (linha = 0; linha < 3; linha++) { // Inicio do For para obter a linha da matriz
            for (coluna = 0; coluna < 3; coluna++) { // Inicio do segundo For par obter a coluna da matriz

                soma += matriz[linha][coluna]; // Cálculo que soma todos os elementos da matriz 3x3
            
            } // Fim do primeiro For 
        } // Fim do segundo For
        
        // Exibindo o resultado do cálculo
        JOptionPane.showMessageDialog(null, "O resultado da soma de todos os elementos inseridos na matriz 3x3 de números inteiros é " + soma); 

    } // Fim do programa
} // Fim da Classe