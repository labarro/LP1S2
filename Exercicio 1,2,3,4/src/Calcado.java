public class Calcado {
    private String nome;
    private double preco;
    private boolean calcado;
    private Integer tamanho;

    public Calcado(String nome, double preco, Integer tamanho) {
        this.nome = nome;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    public void descricao() {
        System.out.printf("Nome: %s, Preco: %d, Tamanho: %s%n", nome, preco, tamanho);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }
    
    public boolean isCalcado() {
        return calcado;
    }

    public void setCalcado(boolean calcado) {
        this.calcado = calcado;
    }
}