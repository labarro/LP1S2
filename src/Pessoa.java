public class Pessoa {
    private String nome;
    private String sexo;
    private String email;
    private Integer idade;

    public Pessoa(String nome, String sexo, String email, Integer idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.email = email;
        this.idade = idade;
    }

    public void idade() {
        System.out.printf("%s tem %s ano(s)", nome, idade);
    }

    public void descricao() {
        System.out.printf("%s é do sexo %s, seu email é %s e tem %s%n anos", nome, sexo, email, idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}