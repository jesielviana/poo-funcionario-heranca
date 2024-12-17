public class PJ extends Funcionario {
  private double valorHora;
  private int quantidadeHorasTrabalhadas;

  public PJ(String nome, double valorHora, int quantidadeHorasTrabalhadas) {
    super(nome);
    this.valorHora = valorHora;
    this.quantidadeHorasTrabalhadas = quantidadeHorasTrabalhadas;
  }

  public void setQuantidadeHorasTrabalhadas(int quantidadeHorasTrabalhadas) {
    this.quantidadeHorasTrabalhadas = quantidadeHorasTrabalhadas;
  }

  public void setValorHora(double valorHora) {
    this.valorHora = valorHora;
  }

  public int getQuantidadeHorasTrabalhadas() {
    return quantidadeHorasTrabalhadas;
  }

  public double getValorHora() {
    return valorHora;
  }

  @Override
  public double getSalarioLiquido() {
    return valorHora * quantidadeHorasTrabalhadas;
  }

}
