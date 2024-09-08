package desafioContador;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try {
            
            System.out.println("Digite o primeiro número: ");
            int parametroUm = sc.nextInt();
            
            System.out.println("Digite o segundo número: ");
            int parametroDois = sc.nextInt();
            
            // Verifica os parâmetros
            verificarParametros(parametroUm, parametroDois);
            
            int contadorInteracoes = 1;
            
            // Contador de interações
            for (int i = parametroUm; i <= parametroDois; i++) {
                System.out.println("Interação número " + contadorInteracoes + " - número: " + i);
                contadorInteracoes++;
            }
            
        } catch (ParametrosInvalidosException e) { // Corrigido o nome da exceção
            System.out.println("Erro: " + e.getMessage());
        }
        
        sc.close(); // Fechar o Scanner
    }

    // Método verificarParametros com exceção lançada
    public static void verificarParametros(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException("Ops! O parâmetro número dois deve ser maior que o parâmetro um!");
        }
    }
}

// Classe da exceção personalizada corrigida
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
