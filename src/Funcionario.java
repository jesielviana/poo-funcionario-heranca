public abstract class Funcionario {
  protected String nome;

  public Funcionario(String nome) {
    this.nome = nome;
  }

  public abstract double getSalarioLiquido();

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

}