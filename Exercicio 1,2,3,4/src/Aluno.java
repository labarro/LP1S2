public class Aluno {
    private String nome;
    private String ra;
    private Integer notas;

    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public void descricao() {
        System.out.printf("Nome: %s, RA: %s, Notas: %d%n", nome, ra, notas);
    }

    public void darNota(Integer nota) {
        notas = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Integer getNotas() {
        return notas;
    }

    public void setNotas(Integer notas) {
        this.notas = notas;
    }
}