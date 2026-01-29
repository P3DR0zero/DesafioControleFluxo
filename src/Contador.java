import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametro1= ler.nextInt();
        System.out.println("Digite o segund parâmetro: ");
        int parametro2= ler.nextInt();
        try{
        contar(parametro1,parametro2);
        } catch (ParametrosInvalidosException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = parametro2 - parametro1;
        System.out.println("Imprimindo o número " + contagem );
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}