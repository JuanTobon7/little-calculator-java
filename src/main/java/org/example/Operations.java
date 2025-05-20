package org.example;

class Suma implements OperationInterface {
    @Override
    public Double operate(Double a, Double b) {
        return a + b;
    }
}

class Resta implements OperationInterface {
    @Override
    public Double operate(Double a, Double b) {
        return a - b;
    }
}

class Producto implements OperationInterface {
    @Override
    public Double operate(Double a, Double b) {
        return a * b;
    }
}

class Division implements OperationInterface {
    @Override
    public Double operate(Double a, Double b) {
        if (b == 0) throw new ArithmeticException("División por cero no permitida.");
        return a / b;
    }
}

class Potencia implements OperationInterface {
    @Override
    public Double operate(Double a, Double b) {
        return (Double) Math.pow(a, b);
    }
}

class Radicacion implements OperationInterface {
    @Override
    public Double operate(Double a, Double b) {
        if (b == 0) throw new ArithmeticException("Raíz con índice 0 no permitida.");
        return (Double) Math.pow(a, 1.0 / b);
    }
}

class Todas implements OperationInterface {
    @Override
    public Double operate(Double a, Double b) {
        System.out.println("Suma: " + new Suma().operate(a, b));
        System.out.println("Resta: " + new Resta().operate(a, b));
        System.out.println("Producto: " + new Producto().operate(a, b));
        System.out.println("División: " + new Division().operate(a, b));
        System.out.println("Potencia: " + new Potencia().operate(a, b));
        System.out.println("Radicación: " + new Radicacion().operate(a, b));
        return null; // Esta no tiene un solo resultado, solo imprime todos
    }
}
