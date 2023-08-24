public class Calculadora {
    public static void main(String[] args) {
        double celsius = 30;
        int conversão = (int) (celsius * 1.8) + 32;
        System.out.println(String.format("A conversão de Celsius para Fahrenheit é: %d", conversão));
    }
}
