import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int paramentroUm = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int paramentroDois = scanner.nextInt();

        try {
            contar(paramentroUm, paramentroDois);
        } catch(ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
        }

        scanner.close();
    }
    
    static void contar(int paramentroUm, int paramentroDois) throws ParametrosInvalidosException {
        if(paramentroUm > paramentroDois) {
            throw new ParametrosInvalidosException();
        }

        for(int i = 1; i <= paramentroDois - paramentroUm; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
