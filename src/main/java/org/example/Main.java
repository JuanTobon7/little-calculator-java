package org.example;

public class Main {
    public static void main(String[] args) {
        while (true){
            Menu mainMenu = new Menu();
            int opt = mainMenu.getOption();
            Calculator calculator = new Calculator();
            calculator.execute(mainMenu.getOperations());
        }
    }
}