public class Instrumento {
    private String nome;
    private boolean tocando;
    private String cor;

    public Instrumento(String nome, int numeroCordas) {
        this.nome = nome;
    }

    public void descricao() {
        System.out.printf("O instrumento é um %s. No momento %s tocando", nome, cor, tocando == true ? "está" : "não está");
    }

    public void tocarOuParar() {
        tocando = !tocando;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
}
