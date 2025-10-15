package back;

public class Mms implements CalculadorSorvete{
    private final Double preco = 1.50;
    private CalculadorSorvete calculadorSorvete;

    @Override
    public Double calcular() {
        return preco + calculadorSorvete.calcular();
    }

    @Override
    public String historico() {
        return calculadorSorvete.historico() + "\nMMs";
    }

    public Mms(CalculadorSorvete calculadorSorvete) {
        this.calculadorSorvete = calculadorSorvete;
    }
}
