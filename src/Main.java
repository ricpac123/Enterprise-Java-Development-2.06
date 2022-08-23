import java.util.HashMap;

public class Main {
    private static HashMap<String, estudante> estudantesHM = new HashMap<>();

    public static void main(String[] args) {
        estudante Ricardo = new estudante("Ricardo", 95);

        estudantesHM.put(Ricardo.getNome(), Ricardo);

        System.out.println(estudantesHM.values());
        System.out.println(aumentarNotaEmDez(estudantesHM).values());

    }
    public static HashMap<String,estudante> aumentarNotaEmDez(HashMap<String,estudante> estudantesNN) {
        for (estudante estudanteNN : estudantesNN.values()) {
            int novaNota = (int) ((estudanteNN.getNota()*0.1)+estudanteNN.getNota());
            if (novaNota>100) {novaNota=100;}
            estudanteNN.setNota(novaNota);
        }
        return estudantesNN;
    }
}