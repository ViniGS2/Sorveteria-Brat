package back;

public class Cobertura implements CalculadorSorvete{
    private CalculadorSorvete calculadorSorvete;
    final Double preco = 2.50;

    public Cobertura(CalculadorSorvete calculadorSorvete) {
        this.calculadorSorvete = calculadorSorvete;
    }

    @Override
    public Double calcular() {
        return this.preco + calculadorSorvete.calcular();
    }

    @Override
    public String historico() {
        return calculadorSorvete.historico() + "\nCobertura";
    }

}
