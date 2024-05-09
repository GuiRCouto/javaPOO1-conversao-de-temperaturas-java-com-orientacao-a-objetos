import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double temperatura = 0;
        String cidade;
        double conversao = (temperatura * 1.8 + 32);

        System.out.println("\nConversão de temperatura de Cº(célsius) para Fº(fahrenheit) : \n");
        System.out.println("Digite o nome da sua cidade:");
        cidade = leitura.nextLine();
        System.out.println("Digite a temperatura de " + cidade + " em Cº?");
        temperatura = leitura.nextDouble();
        System.out.printf
                ("""
                 A temperatura de %s em Cº é : %.0f\s
                 E convertida para Fº é : %.0f\s

                 Obrigado por utilizar nosso conversor!%n""",
                        cidade, temperatura, conversao);
    }
}