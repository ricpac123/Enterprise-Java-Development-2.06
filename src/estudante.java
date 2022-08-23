public class estudante {
    private String nome;
    private static int nota;

    public estudante(String nome, int nota) {
        this.nome=nome;
        setNota(nota);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        if (nota >= 0 && nota <= 100) {this.nota=nota;}
        else if (nota<0) {
            System.out.print("Nota menor que 0%\n");
        }
        else if (nota>100) {
            System.out.print("Nota maior que 100%\n");
        }
    }

    @Override
    public String toString() {
        return "estudante: "+nome+" com nota: "+nota+"%";
    }
}
