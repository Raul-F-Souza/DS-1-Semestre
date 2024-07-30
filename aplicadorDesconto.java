import javax.swing.JOptionPane;

public class aplicadorDesconto {
    
    public static void main(String[] args) {
        //Declaração das variáveis utilizadas no programa
        double valorCompra, desconto;
        String auxiliar;

        auxiliar = JOptionPane.showInputDialog("Digite o valor total da sua compra: "); // Solicitando o valor total de compra para o usuário
        valorCompra = Double.parseDouble(auxiliar); // COnversão do Input String para o tipo Double

        if (valorCompra < 200) { // 1° if para 5% de desconto
            desconto = (valorCompra * 5) / 100; // Operação para calculo do desconto
            valorCompra = valorCompra - desconto; // Aplicando o desconto ao valor de compra
            JOptionPane.showMessageDialog(null, 
            "Será aplicado 5% de desconto a sua compra: R$" + desconto + "\nVocê deve pagar: R$" + valorCompra); // Exibindo o valor do desconto e o valor com desconto aplicado
        } else {
            if (valorCompra >= 200 && valorCompra < 300){ // 2° if para 10% de desconto
                desconto = (valorCompra * 10) / 100;
                valorCompra = valorCompra - desconto;
                JOptionPane.showMessageDialog(null, "Será aplicado 10% de desconto a sua compra: R$" + desconto + "\nVocê deve pagar: R$" + valorCompra);
            } else {
                if (valorCompra >= 300) { // 3° if para 15% de desconto
                    desconto = (valorCompra * 15) / 100;
                    valorCompra = valorCompra - desconto;
                    JOptionPane.showMessageDialog(null, "Será aplicado 15% de desconto a sua compra: R$" + desconto + "\nVocê deve pagar: R$" + valorCompra);
                }
            }
        }
    }
}
