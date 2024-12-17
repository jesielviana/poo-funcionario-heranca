public class PF extends Funcionario {
  private double imposto;
  private double salarioBase;

  public PF(String nome, double imposto, double salarioBase) {
    super(nome);
    this.imposto = imposto;
    this.salarioBase = salarioBase;
  }

  public void setImposto(double imposto) {
    this.imposto = imposto;
  }

  public void setSalarioBase(double salarioBase) {
    this.salarioBase = salarioBase;
  }

  public double getImposto() {
    return imposto;
  }

  public double getSalarioBase() {
    return salarioBase;
  }

  @Override
  public double getSalarioLiquido() {
    return salarioBase - (salarioBase * imposto);
  }

}
