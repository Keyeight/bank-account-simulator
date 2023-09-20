import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Emma Nora Evangeline";
        String bankAccount = "Corrente";
        double balance = 2500.55;
        int optionMenu = 0;

        String menu = """
                      \n    Operações 
                      
                      1 - Consultar Saldos
                      2 - Receber Valor
                      3 - Transferir Valor
                      4 - Sair
                      
                        Digite a opção desejada: 
                      """;

        System.out.println("\n**************************************");
        System.out.println("Nome do Cliente: " + name);
        System.out.println("Tipo de Conta: " + bankAccount);
        System.out.println("Saldo Disponível: R$ " + balance);
        System.out.println("**************************************");

        Scanner optionSelection = new Scanner(System.in);
        Scanner valueOption = new Scanner(System.in);

        while (optionMenu != 4) {
            System.out.println(menu);
            optionMenu = optionSelection.nextInt();

            if (optionMenu == 1) {
                System.out.println("O saldo atual é R$ " + balance);
            } else if (optionMenu == 2) {
                System.out.println("Informe o valor a receber: R$");
                double cashReceives = valueOption.nextDouble();
                balance += cashReceives;
                System.out.println("Saldo Atualizado R$ " + balance);
            } else if (optionMenu == 3) {
                System.out.println("Informe o valor que deseja transferir R$ ");
                double cashTransfer = valueOption.nextDouble();
                    if (cashTransfer > balance){
                        System.out.println("Saldo indisponível para transferencia");
                    } else {
                        balance -= cashTransfer;
                        System.out.println("Saldo Atualizado R$ " + balance);
                    }
            } else if (optionMenu == 4) {
                System.out.println("Fim de Operações");
            } else if (optionMenu > 4) System.out.println("Opção Inválida");
        }
    }
}
