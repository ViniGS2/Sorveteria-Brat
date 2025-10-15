package front;

import java.util.Scanner;

public class Main {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Front front = new Front();


        System.out.println(
                "██████████████████████████████████████████████"+ANSI_GREEN+"██████████████████████\n"+ANSI_RESET+
                "█───█────█────█─█─█───█───█───█────█───█────██"+ANSI_GREEN+"██────██────█────█───█\n"+ANSI_RESET+
                "█─███─██─█─██─█─█─█─████─██─███─██─██─██─██─██"+ANSI_GREEN+"██─██──█─██─█─██─██─██\n"+ANSI_RESET+
                "█───█─██─█────█─█─█───██─██───█────██─██────██"+ANSI_GREEN+"██────██────█────██─██\n"+ANSI_RESET+
                "███─█─██─█─█─██───█─████─██─███─█─███─██─██─██"+ANSI_GREEN+"██─██──█─█─██─██─██─██\n"+ANSI_RESET+
                "█───█────█─█─███─██───██─██───█─█─██───█─██─██"+ANSI_GREEN+"██────██─█─██─██─██─██"+ANSI_RESET

        );
        while(true){
            Scanner sc = new Scanner(System.in);
            front.atendimento();
            front.mostrarValor();

            System.out.println("Deseja sair?[s,n]");
            String sair = sc.nextLine().toLowerCase();
            if(sair.equals("s")){
                System.out.println("█─█─████─█───███─███────███─███─█───█─████─████─███\n" +
                        "█─█─█──█─█────█──█──────█───█───██─██─█──█─█──█─█──\n" +
                        "█─█─█──█─█────█──███────███─███─█─█─█─████─████─███\n" +
                        "███─█──█─█────█──█────────█─█───█───█─█────█─█──█──\n" +
                        "─█──████─███──█──███────███─███─█───█─█────█─█──███"
                );
                break;
            }
        }
    }
}