import java.util.Scanner;

public class ConversordeTemperatura {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);

        System.out.println("CHOOSE AN OPTION:");
        System.out.println("1-CELSIUS PARA FAHRENHEIT");
        System.out.println("2-FAHRENHEIT PARA CELSIUS ");
        
        int escolha = s.nextInt();

        if(escolha == 1){
            System.out.println("CELSIUS");
            converterCparaF();
        } else {
            if(escolha == 2){
                System.out.println("FAHRENHEIT");
                converterFparaC();
            } else {
                System.out.println("OPCAO INVALIDA");
            }
        }

       

    }

    public static void converterCparaF(){

        Scanner s =  new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsius:");

        double celsius = s.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " Ccd convertido eh igual a: " + fahrenheit + "F");
    }

    public static void converterFparaC(){

        Scanner s =  new Scanner(System.in);

        System.out.println("Informe a temperatura em fahrenheit:");

        double fahrenheit = s.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + "fahrenheit convertido eh igual a: " + celsius + "C");
    }
    }
    
    

    
    

  

