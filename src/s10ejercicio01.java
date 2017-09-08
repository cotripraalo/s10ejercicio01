import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class s10ejercicio01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Creando objeto Scanner
        Scanner input = new Scanner(System.in);
               
        // Mostrar mensaje al usuario
        System.out.println("ESTADOS CIVILES");
        System.out.println(" ");
        System.out.println("1.Soltero(a) ");
        System.out.println("2.Casado(a) Conviviente o Viudo(a)");
        System.out.println("3.Casado(a) Separado(a)");
        System.out.println("4.Soltero");
        System.out.println(" ");
        
        System.out.print("INGRESE ESTADO CIVIL: ");
        int estado= input.nextInt();
        
        //Impuesto calculado
        double impuesto=0;
        double ingreso=0;
        if (estado ==1){        //soltero
            
            if(ingreso <= 8350 ){       //Ingreso anual menor igual a $ 8350
                impuesto = ingreso * 0.10;
           }
           else if(ingreso <= 33950){   //Ingreso anual menor igual a $ 33950
                impuesto = 8350 * 0.10 *
                        (ingreso - 8350) * 0.15;
           }
           else if(ingreso <= 82250){   //Ingreso anual menor igual a $ 82250
                impuesto = 8350 * 0.10
                        + (33950 - 8350) * 0.15
                        + (ingreso -  33950) *0.25;
           }
           else if(ingreso <=171550){   //Ingreso anual menor igusl a $ 171550
                impuesto = 8350 * 0.10
                        + (33950 - 8350) * 0.15
                        + (82250 - 33950)*0.25
                        + (ingreso - 82250)*0.28;
           }
           else if(ingreso <= 372950){  //Ingreso anual menor igual a $ 372.950.00
                impuesto = 8350 * 0.10 
                        + (33950 - 8350)*0.15
                        + (82250 - 33950) * 0.25
                        + (171550 - 82250) *0.28
                        + (ingreso - 171550)* 0.33;
           }
           else{
                impuesto = 8350 * 0.10 
                        + (33950 - 8350)*0.15
                        + (82250 - 33950) * 0.25
                        + (171550 - 82250) *0.28
                        + (372950 - 171550)*0.33
                        + (ingreso - 372950)*0.35; 
           }
            
       }
               
        else if (estado == 2){  // casado o viudo
              if(ingreso <= 16700 ){       //Ingreso anual menor igual a $ 8350
                impuesto = ingreso * 0.10;
           }
           else if(ingreso <= 67900){   //Ingreso anual menor igual a $ 33950
                impuesto = 16700 * 0.10 *
                        (ingreso - 16700) * 0.15;
           }
           else if(ingreso <= 137050){   //Ingreso anual menor igual a $ 82250
                impuesto = 16700 * 0.10
                        + (67900 - 16700) * 0.15
                        + (ingreso -  67900) *0.25;
           }
           else if(ingreso <=208850){   //Ingreso anual menor igusl a $ 171550
                impuesto = 16700 * 0.10
                        + (67900 - 16700) * 0.15
                        + (137050 - 67900)*0.25
                        + (ingreso - 137050)*0.28;
           }
           else if(ingreso <= 372950){  //Ingreso anual menor igual a $ 372.950.00
                impuesto = 16700 * 0.10 
                        + (67900 - 16700)*0.15
                        + (137050 - 67900) * 0.25
                        + (208850 - 137050) *0.28
                        + (ingreso - 208850)* 0.33;
           }
           else{
                impuesto = 16700 * 0.10 
                        + (67900 - 16700)*0.15
                        + (137050 - 67900) * 0.25
                        + (208850 - 137050) *0.28
                        + (372950 - 208850)*0.33
                        + (ingreso - 372950)*0.35; 
           }
        }
        else if (estado ==3){  // casado (separado)
             
            if(ingreso <= 8350 ){       //Ingreso anual menor igual a $ 8350
                impuesto = ingreso * 0.10;
           }
           else if(ingreso <= 33950){   //Ingreso anual menor igual a $ 33950
                impuesto = 8350 * 0.10 *
                        (ingreso - 8350) * 0.15;
           }
           else if(ingreso <= 68525){   //Ingreso anual menor igual a $ 82250
                impuesto = 8350 * 0.10
                        + (33950 - 8350) * 0.15
                        + (ingreso -  33950) *0.25;
           }
           else if(ingreso <= 104425){   //Ingreso anual menor igusl a $ 171550
                impuesto = 8350 * 0.10
                        + (33950 - 8350) * 0.15
                        + (68525 - 33950)*0.25
                        + (ingreso - 68525)*0.28;
           }
           else if(ingreso <= 186475){  //Ingreso anual menor igual a $ 372.950.00
                impuesto = 8350 * 0.10 
                        + (33950 - 8350)*0.15
                        + (68525 - 33950) * 0.25
                        + (104425 - 68525) *0.28
                        + (ingreso - 104425)* 0.33;
           }
           else{
                impuesto = 8350 * 0.10 
                        + (33950 - 8350)*0.15
                        + (68525 - 33950) * 0.25
                        + (104425 - 68525) *0.28
                        + (186475 - 104425)*0.33
                        + (ingreso - 186475)*0.35; 
           }
        }
        else if (estado ==4){  // guardian
            
            if(ingreso <= 11950 ){       //Ingreso anual menor igual a $ 11950
                impuesto = ingreso * 0.10;
           }
           else if(ingreso <= 45500){   //Ingreso anual menor igual a $ 45500
                impuesto = 11950 * 0.10 *
                        (ingreso - 11950) * 0.15;
           }
           else if(ingreso <= 117450){   //Ingreso anual menor igual a $ 117450
                impuesto = 11950 * 0.10
                        + (45500 - 11950) * 0.15
                        + (ingreso -  45500) *0.25;
           }
           else if(ingreso <=190200){   //Ingreso anual menor igusl a $ 190200
                impuesto = 11950 * 0.10
                        + (45500 - 11950) * 0.15
                        + (117450 - 45500)*0.25
                        + (ingreso - 117450)*0.28;
           }
           else if(ingreso <= 372950){  //Ingreso anual menor igual a $ 372.950.00
                impuesto = 11950 * 0.10 
                        + (45500 - 11950)*0.15
                        + (117450 - 45500) * 0.25
                        + (190200 - 117450) *0.28
                        + (ingreso - 190200)* 0.33;
           }
           else{
                impuesto = 11950 * 0.10 
                        + (45500 - 11950)*0.15
                        + (117450 - 45500) * 0.25
                        + (190200 - 117450) *0.28
                        + (372950 - 190200)*0.33
                        + (ingreso - 372950)*0.35; 
           }
            
        }
        
        System.out.print("INGRESE SALARIO ANUAL: ");
        System.out.println("IMPUESTO CALCULADO ES: " + impuesto);
    }
      
}
