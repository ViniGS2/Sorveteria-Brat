package back;

public class SorveteBase implements CalculadorSorvete{
    final Double valor = 6.00;


    @Override
    public Double calcular() {
        return valor;
    }

    @Override
    public String historico() {
        return "Sorvete";
    }
}
