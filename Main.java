public class Main {
    public static void main(String[] args) {
        ProveedorTasaCambio banco = new TasaBancoCentral();
        ConversorMoneda conversor = new ConversorMoneda(banco);
        double resultado = conversor.convertir(100, "usd", "ars");
        System.out.println("banco central: $ " + resultado);
        ProveedorTasaCambio mercado = new TasaMercadoLibre();
        conversor = new ConversorMoneda(mercado);
        resultado = conversor.convertir(100, "usd" , "ars");
        System.out.println("mercado libre: $ " + resultado);

    }
}
