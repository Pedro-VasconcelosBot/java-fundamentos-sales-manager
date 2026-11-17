import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        double venda = 0;
        double total = 0;
        double comissao = 0;
        int meta = 10000;


        System.out.println("=====SALES MANAGER=====");
        String menu = """
                *Digite a opção desejada*
                
                1 - Registrar Venda
                2 - Consultar total vendido
                3 - Calcular comissão
                4 - Verificar meta
                5 - Sair                
                
                """;

        while (opcao !=5){
            System.out.println(menu);
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:

                    System.out.println("Registrar Venda");
                    venda = scanner.nextDouble();
                    if (venda > 0){
                        total += venda;
                        System.out.println("Venda Registrada");
                    }
                    else {
                        System.out.println("Valor inválido");
                    }
                    break;

                case 2:
                    System.out.println("Consultar total vendido");
                    if (total > 0){
                        System.out.println("O Total é de: R$ " + total);
                    }
                    else{
                        System.out.println("Nenhuma venda registrada!");
                    }
                    break;
                case 3:
                    System.out.println("Calcular Comissão");
                    comissao = calcularComissao(total);
                    if (comissao > 0){
                        System.out.println(" Sua comissão é de: R$ " + comissao);
                    }
                    else {
                        System.out.println("Sem valor de comissão");
                    }
                    break;
                case 4:
                    System.out.println("Verificar Meta");
                    if (verificarMeta(meta, total)){
                        System.out.println("Meta batida");
                    }
                    else {
                        System.out.println("Meta não batida");
                    }
                    break;
                case 5:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }

        }
        scanner.close();
    }

    static double calcularComissao(double total) {
        return total * 0.05;
    }

    static boolean verificarMeta (double meta, double total) {
        return total >= meta;}



}



