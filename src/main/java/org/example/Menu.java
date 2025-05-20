package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Scanner;
@AllArgsConstructor
@Data
public class Menu {
    private int option;
    private AritmeticOperations operations;
    public Menu(){
        System.out.println("""
                **********Menu**********\n
                Acontinuación escoja la operación aritmetica a realizar:\n                    
                        1. Suma\n
                        2. Resta\n
                        3. Producto\n
                        4. División\n
                        5. Potenciación\n
                        6. Radicación\n
                        7. Todas\n
                        8. Salir\n              
                """);
        this.option = new Scanner(System.in).nextInt();
        AritmeticOperations[] ops = {
                AritmeticOperations.SUMA,
                AritmeticOperations.RESTA,
                AritmeticOperations.PRODUCTO,
                AritmeticOperations.DIVISION,
                AritmeticOperations.POTENCIA,
                AritmeticOperations.RADICACION,
                AritmeticOperations.TODAS
        };
        if(option >= 1 && option <= 7) {
            this.operations = ops[option - 1];
        } else if (option == 8) {
            System.out.println("Saliendo del programa...");
            System.exit(0);
        } else {
            System.out.println("Opción inválida.");
            System.exit(1);
        }
    }

}
