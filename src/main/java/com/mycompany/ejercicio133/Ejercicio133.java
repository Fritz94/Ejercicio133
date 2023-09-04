/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio133;

/**
 *
 * @author Alessandro
 */
public class Ejercicio133 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Ejercicio 1
        //1.1
        if (6 < 6 * 5)
            System.out.print("Hello");
            System.out.print(" There");
        // El resultado es : Imprime Hello There
                
       // 1.2
       int x=1, y=2, z=3;
       if(x>y)
       if(x>z)
           System.out.println("1111");
       else
           System.out.println("2222");
                
        //El resultado es : No imprime nada por la instrucci+on x>y que no se cumple
        
        // 1.3
        if(x < z)
            System.out.println("*");
        else if  (x == z)
            System.out.println("&");
        else
            System.out.println("$");
        
        //El resultado es : Imprime el símbolo *
        
        // 1.4
        if(x<y)
            System.out.println("####");
        else {
            System.out.println("&&&&");
            System.out.println("**");
            
        //El resultado es : Imprime los símbolos ####
        
        // 1.5
        if(x>y)
            System.out.println("####");
        else{
            System.out.println("&&&&");
            System.out.println("**");
         
        //El resultado es : No imprime nada por la instrucción x>y que no se cumple
        
        // 1.6
        int a1=100; int a2=200;
        
        if(a1>100 && a2<=200)
            System.out.println(a1+" "+a2+" "+(a1+a2));
        else
            System.out.println(a1+" "+a2+" "+(2*a1-a2));
        
        //El resultado es : No imprime nada por la instrucción a1>100 y esta no se cumple
        
        // 1.7
        if(++x > y++ || x-- > 0)
            z++;
        else
            z--;
        System.out.println(x+" "+y+" "+z);
        }
        }
        
        //El resultado es : No imprime nada por la instrucción (++x > y++ || x-- > 0) z++;
        
        // 1.8
        if(x<y){
            System.out.println("####");
            System.out.println("**");
        }
        else 
            System.out.println("#*#");
        
        //El resultado es : Imprime los símbolos **
        
        //Ejercicio 1.9
        if('x' > 'y' || 66 > (int)('A'))
            System.out.println("#*#");
        
        //El resultado es : Imprime los símbolos #*#
        
        // 1.10
        if (x<z)
            System.out.println("*");
        else if(x==z)
            System.out.println("&");
        else 
            System.out.println("$");
        
        //El resultado es : Imprime el simbolo *
        
        //Ejercicio 2
        int num = 3;
        if (num ==3)
            System.out.println("true");
        
        //El resultado es: Imprime la palabra true ya que se cumple lo especificado
        
        //Ejercicio 3
        int numA=2, numB=4;
        if (numA== 2 && numB==4)
            System.out.println("true");
        
        //El resultado es: Imprime la palabra true porque se cumple lo requerido
        
        //Ejercicio 4
        int NumA = -5; 
        int NumB = -3; 
        if(NumA== -5 && NumB==-3)
            System.out.println("true");

        //El resultado es: Imprime la palabra true ya que cumple con lo específicado 
        
        //Ejercicio 5
        import java.util.Scanner;

        public class DiasDeLaSemana {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número del 1 al 7 para obtener el día de la semana: ");
        int numeroDia = scanner.nextInt();

        String diaSemana;

        switch (numeroDia) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Número inválido. Ingresa un número del 1 al 7.";
        }

        System.out.println("Día de la semana: " + diaSemana);
        
        //El resultado es: Colocas un número del 1 al 7 y dependiendo del número imprime el día correspondiente, sino te aparecerá número inválido.
    }
}

    }