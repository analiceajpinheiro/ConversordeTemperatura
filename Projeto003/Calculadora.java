import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        //INTRODUÇÃO MENU
        System.out.println("------CALCULADORA------");
        System.out.println("BEM - VINDO (A) A CALCULADORA");

        //INSERIR NÚMEROS
        System.out.println("INSIRA O 1º NÚMERO:");
        Scanner n1 = new Scanner(System.in);
        double num1 = n1.nextDouble();
        

        System.out.println("INSIRA O 2º NÚMERO:");
        Scanner n2 = new Scanner(System.in);
        double num2 = n2.nextDouble();

        
        //OPÇÕES MENU
        System.out.println("ESCOLHA UMA DAS OPÇÕES ABAIXO:");

        System.out.println("1 - SOMAR\n2 - SUBTRAIR\n3 - MULTIPLICAR\n4 - DVIDIR\n5 - SAIR ");
        Scanner s = new Scanner(System.in);
        int opcao = s.nextInt();
        s.close();

        //CONDICIONAIS
        if(opcao == 1){
            System.out.println(num1 + " + " + num2 + " = " + somar(num1, num2));
        } else {
            if(opcao == 2){
                System.out.println(num1 + " - " + num2 + " = " + subtrair(num1, num2));
            } else {
                if (opcao == 3) {
                    System.out.println(num1 + " * " + num2 + " = " + multiplicar(num1, num2));
                } else {
                    if(opcao == 4){
                        System.out.println(num1 + " / " + num2 + " = " + dividir(num1, num2));
                    } else {
                        if(opcao == 5){
                            System.out.println("SAINDO..");
                        }
                    }
                }
            }
        }

    }
    //FUNÇÕES CALCULADORA
    public static double somar(double num1, double num2){
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }

    public static double dividir(double num1, double num2){
        return num1 / num2;
    }

}
