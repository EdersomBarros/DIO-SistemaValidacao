package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * ProcessoSeletivo
 */
public class ProcessoSeletivo {

    public static void main(String[] args) {
         String [] candidatos = { "FELIPE", "MARCIA", 
                                "JULIA", "AUGUSTO", 
                                "MONICA"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
        do {
            //Elas precisarão sofrer alguma alteração
            atendeu = atender();
            continuaTentando = !atendeu;
            if (continuaTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO!!");
            }

        } while (continuaTentando && tentativasRealizadas < 3);
        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " tentativa");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADAS.");

        }
    }

    //método auxiliar
    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = { "FELIPE", "MARCIA", 
                                "JULIA", "AUGUSTO", 
                                "MONICA"};
    System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
    for(int i = 0; i < candidatos.length; i++){
        System.out.println("O candidato de nº " + (i+1) + " é " + candidatos[i]);
    }
    System.out.println("Forma abreviada de interação for each");

    for (String candidato: candidatos) {
        System.out.println("O candodato selecionado foi " + candidato);
    }

    }





    static void selecaoCandodatos(){
        String [] candidatos = { "FELIPE", "MARCIA", 
                                "JULIA", "AUGUSTO", 
                                "MONICA","FABRICIO", 
                                "MIRELA","DANIELA", 
                                "JORGE", "RAIMUNDO"};

        int candidatosSelecionados=0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga ");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }       
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}