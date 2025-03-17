import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class ControleDeFluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int numero2 = scanner.nextInt();


            contar(numero1, numero2);
        } catch (InputMismatchException e){
            System.out.println("Erro: Você deve digitar um número inteiro válido.");
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch(NoSuchElementException e){
            System.out.println("Erro: Vocês precisa digitar dois números.");
        } finally{
            scanner.close();
        }
    }   
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm < parametroDois){
            throw new ParametrosInvalidosException("O segundo número deve ser menor que o primeiro");
        }

        if (parametroUm <= 0 && parametroDois <= 0){
            throw new ParametrosInvalidosException("Ao menos um dos números deve ser maior que zero");
        }

        int contagem = parametroUm - parametroDois;

        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}