package org.example;
public enum AritmeticOperations {
    SUMA(new Suma()),
    RESTA(new Resta()),
    PRODUCTO(new Producto()),
    DIVISION(new Division()),
    POTENCIA(new Potencia()),
    RADICACION(new Radicacion()),
    TODAS(new Todas()); // esto lo manejamos aparte

    private final OperationInterface operation;

    AritmeticOperations(OperationInterface operation) {
        this.operation = operation;
    }

    public OperationInterface getOperation() {
        return operation;
    }
}