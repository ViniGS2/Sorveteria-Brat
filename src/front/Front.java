package front;

import back.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Front {

    private List<CalculadorSorvete> sorvetes = new ArrayList<>();
    private Double total = 0.0;


    public Front() {}


    public void atendimento(){

        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("████████████████████████████████████████████████████████████████████");
            System.out.println("███████████████████████ Monte o seu sorvete! ███████████████████████");
            System.out.println("████████████████████████████████████████████████████████████████████\n");
            System.out.println("Quantos sorvetes você quer?");
            int quant = scan.nextInt();
            for (int i = 0; i < quant; i++) {
                CalculadorSorvete sorvete = new SorveteBase();
                System.out.println("\nMonte o " + (i + 1) + "º sorvete\n");

                System.out.println("Cobertura? [s,n]");
                String cobertura = scan.next().toLowerCase();
                int quantCobertura = 0;
                if (cobertura.equals("s")) {
                    System.out.println("Quantas Coberturas?");
                    quantCobertura = scan.nextInt();
                }

                System.out.println("Paçoca? [s,n]");
                String pacoca = scan.next().toLowerCase();
                int quantasPacocas = 0;
                if (pacoca.equals("s")) {
                    System.out.println("Quantas Paçocas?");
                    quantasPacocas = scan.nextInt();
                }

                System.out.println("MMs? [s,n]");
                String mms = scan.next().toLowerCase();
                int quantasMms = 0;
                if (mms.equals("s")) {
                    System.out.println("Quantas Colheres?");
                    quantasMms = scan.nextInt();
                }

                for (int j = 0; j < quantasMms; j++) {
                    sorvete = new Mms(sorvete);
                }

                for (int j = 0; j < quantCobertura; j++) {
                    sorvete = new Cobertura(sorvete);
                }

                for (int j = 0; j < quantasPacocas; j++) {
                    sorvete = new Pacoca(sorvete);
                }

                sorvetes.add(sorvete);
            }
        }
        catch (Exception e) {
            System.out.println("Erro durante o atendimento. Por favor insira entradas de acordo com o que for pedido.");
            System.out.println("Reiniciando...");
            atendimento();
        }
    }

    public void mostrarValor(){
        System.out.println("█████████████████████████████████████████");
        System.out.print("Você comprou:");
        for(CalculadorSorvete sorvete: sorvetes){
            total += sorvete.calcular();
            System.out.println("\n-----------------------------------------\n");
            System.out.println(sorvete.historico());
            System.out.println("Este sorvete custou: " + sorvete.calcular());
        }
        System.out.println("\n-----------------------------------------\n");
        System.out.println("A sua compra deu: " + total);
        System.out.println("█████████████████████████████████████████");
    }
}

