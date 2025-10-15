package back;

public class Pacoca implements CalculadorSorvete{
    private CalculadorSorvete calculadorSorvete;
    final Double preco = 4.00;

    public Pacoca(CalculadorSorvete calculadorSorvete) {
        this.calculadorSorvete = calculadorSorvete;
    }

    @Override
    public Double calcular() {
        return this.preco + calculadorSorvete.calcular();
    }

    @Override
    public String historico() {
        return calculadorSorvete.historico() + "\nPaçoca";
    }
}
