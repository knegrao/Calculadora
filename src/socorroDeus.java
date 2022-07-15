import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.Scanner;

public class socorroDeus {
    public static void main(String[] args) {
        float a;
        float b;
        String operacao;
        Scanner entrada = new Scanner(System.in);
        float resultado;
        int parcelas = 360;
        float taxa = 1.5F;
        try {
            saudacao();
            System.out.println( "Digite o primeiro número");
            a = entrada.nextFloat();
            System.out.println("Digite o segundo número");
            b = entrada.nextFloat();
            System.out.println("Qual operação matemática você quer realizar? \n +, -, /, *");
            operacao = entrada.next();
            /*
            switch (operacao) {
                case "+":
                    resultado = a + b;
                    break;
                case "-":
                    resultado = a - b;
                    break;
                case "/":
                    resultado = a / b;
                    break;
                case "*":
                    resultado = a * b;
                    break;

                default:
                    System.out.println("Caracter invalido");
                    return;
            }
*
            switch (operacao) {
                case "+" -> resultado = a + b;
                case "-" -> resultado = a - b;
                case "/" -> resultado = a / b;
                case "*" -> resultado = a * b;
                default: {
                    System.out.println("Caracter invalido");
                    return;
                }
            }

             */
            ///System.out.println(resultado);

            System.out.println(switch (operacao){
                case "+" : yield a + b;
                case "-" : yield a - b;
                case "/" : yield a / b;
                case "*" : yield a * b;
                default: throw new Exception("Caracter invalido");

            });

        } catch (Exception e) {
            System.out.println("deu ruim! \n tente novamente");
        }

    }

    public static void saudacao(){
        LocalTime hora = LocalTime.now();
        if ((hora.isBefore(LocalTime.of(12, 0)) || hora.equals(LocalTime.of(12,0)))){
            System.out.println( "Bom dia!!!");
        }else if ((hora.isBefore(LocalTime.of(18, 0)) || hora.equals(LocalTime.of(18, 0))) && hora.isAfter(LocalTime.of(12,0))) {
            System.out.println("Boa tarde!!!");
        }else
        System.out.println("Boa noite!!!");
    }
}

