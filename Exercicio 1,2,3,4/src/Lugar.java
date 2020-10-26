public class Lugar {
    private String nome;
    private String cidade;
    private String estado;

    public Lugar(String nome, String cidade, String estado) {
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
    }

    public void viajar() {
        System.out.printf("Agora você viajou para %s", nome);
    }

    public void descricao() {
        System.out.printf("%s fica na cidade de %s, no estado de %s", nome, cidade, estado);
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}