import java.util.Scanner;
//Aqui foi importado a função Scanner, da qual apresenta um espelhamento do teclado

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Aqui foi atribuido o valor sc para facilitar o uso do Scanner.

        String x;
        x = sc.next();

        // Aqui foi declarado a string x, sendo esta resultado da interação do usuário
        // no console.

        System.out.println("Você digitou:" + x);

        // System.out.println na linha de cod. soma a impressão da linha com quebra +
        // valor da string X.

        sc.close();

        // sc.close no cod. fecha a função Scanner declarada acima.

    }

}
// Foi utilizado o VSCODE para codar, portanto foi instalado juntamente com a
// IDE a Extenção "Exstension Pack For Java".
// E executado no modo Java Debug.Lembre-se a interação será feita na aba
// "terminal".
// Caso ainda queira garantir o funcionamento do código, utilize a extensão
// "CodeRunner".