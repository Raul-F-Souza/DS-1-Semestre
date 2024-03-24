import java.util.Scanner;

public class Spcar {

    public static void main(String[] args){ 
        //Crianção do scanner
        Scanner leitor = new Scanner(System.in);
        //Declaração de variáveis
        double valorDiaria, total, kmPercorridos;
        int diasLocados;
        String modeloCarro;

        //Titulo do programa e leitura do modelo desejado
        System.out.println("Programa locadora SP car - calculador de custos");
        System.out.print("Digite o modelo de carro desejado: ");
        modeloCarro = leitor.nextLine();

        //Leitura do valor da diaria do modelo desejado
        System.out.print("Digite o valor da diaria desse modelo: ");
        valorDiaria = leitor.nextDouble();

        //Leitura da quantidade de dias locados
        System.out.print("Digite quantos dias de locação: ");
        diasLocados = leitor.nextInt();

        //Leitura dos KM percorridos
        System.out.print("Digite a quantidade de KM percorrido: ");
        kmPercorridos = leitor.nextDouble();

        //Processo de soma dos valores que resultam no custo total
        total = (diasLocados * valorDiaria) + (kmPercorridos * 0.20);

        //Imprimindo ao usuario o modelo e o total de custos pela locação
        System.out.println("O valor total dos custos com o modelo " + modeloCarro + "serão: R$" + total);
    }
}
