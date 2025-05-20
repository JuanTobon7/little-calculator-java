package org.example;

import java.util.Scanner;

public class Calculator {
    private AritmeticOperations selected;

    public Calculator() {}

    public void execute(AritmeticOperations selected) {
        Scanner scanner = new Scanner(System.in);

        Double a = readPositiveDouble(scanner, "Ingrese el primer número positivo: ");
        Double b = readPositiveDouble(scanner, "Ingrese el segundo número positivo: ");

        if (selected != AritmeticOperations.TODAS) {
            OperationInterface op = selected.getOperation();
            Double resultado = op.operate(a, b);
            System.out.println("Resultado: " + resultado);
        } else {
            for (AritmeticOperations op : AritmeticOperations.values()) {
                if (op != AritmeticOperations.TODAS) {
                    Double resultado = op.getOperation().operate(a, b);
                    System.out.println(op.name() + ": " + resultado);
                }
            }
        }
    }

    private double readPositiveDouble(Scanner scanner, String prompt) {
        double number = -1;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                number = scanner.nextDouble();
                if (number > 0) {
                    break;
                } else {
                    System.out.println("Por favor, ingrese un número positivo.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.next(); // Limpiar la entrada no válida
            }
        }
        return number;
    }
}
