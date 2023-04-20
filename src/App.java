import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        Integer num1 = scanner.nextInt();
        System.out.println("Digite um segundo número: ");
        Integer num2 = scanner.nextInt();
        try {
            Integer contador = pegaSubtracao(num1, num2);

            for (int i = 1; i <= contador; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
       

        scanner.close();
    }

    private static Integer pegaSubtracao(Integer num1, Integer num2) {
        if(num1 > num2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        return num2 - num1;
    }

}
