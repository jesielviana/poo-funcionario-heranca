import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        PF funcionarioPF = new PF("PF1", 0.27, 10000);
        PJ funcionarioPJ = new PJ("PJ1", 100, 160);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(funcionarioPF);
        funcionarios.add(funcionarioPJ);

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome() + ", salário: " + funcionario.getSalarioLiquido());
        }

    }
}
