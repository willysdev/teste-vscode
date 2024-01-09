import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
     Scanner sc = new Scanner (System.in);
        System.out.println("Digite sua agência " );
            String agencia = sc.nextLine();
                    int conta = 11420;
                        String nome = "Mario";  
                             double saldo = 237.48;
                                System.out.println();
                                    System.out.printf("olá %s, Obrigado por criar uma conta em nosso banco" + " sua agência é %s," + "conta %d e seu saldo %.2f já está disponivel " + "para saque.", nome, agencia, conta, saldo);    
                                sc.close();
     
                                
    }
}
