import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        analisarCandidato(1900);
        analisarCandidato(2000);
        analisarCandidato(3000);
        selecaoCandidatos();
        imprimirSelecionados();
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for(String candidato: candidatos){


        }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false; 
        do{
                atendeu = atender();
                continuarTentando = !  atendeu;
                if ( continuarTentando)
                    tentativasRealizadas++;
                else
                    System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while(continuarTentando && tentativasRealizadas<3);
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        for (int indice = 0; indice < candidatos.length;indice++){
            System.out.println("O candidato de nº "+ indice + " é "+ candidatos[indice]);

        }

        for(String candidato: candidatos){
            System.out.println("o candidato selecionado foi:" + candidato);
        }
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido =valorPretendido();

            System.out.println("O CANDIDATO " + candidato+ " SOLICITOU ESTE VALOR DE SALÁRIO: "+ salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O CANDIDATO " + candidato + " FOI SELECIONADO PARA A VAGA");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase> salarioPretendido){
            System.out.println("Ligar para candidato");

        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }
    
}
