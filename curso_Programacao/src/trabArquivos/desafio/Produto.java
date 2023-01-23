package trabArquivos.desafio;

public class Produto {
    String nome;
    Double preco;
    Integer quantidade;
    
    public Produto(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    @Override
    public String toString() {
        return nome + "," + preco + "," + quantidade;
    }
    
    public String outFiles() {
        return nome + "," + calcularTotal();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public Double calcularTotal() {
        return this.preco*this.quantidade;
    }
    
}
