package Exercicio3;

public class Recepcionista extends Funcionario {
    public Recepcionista(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String exibirFuncao() {
        return "Atende pacientes e organiza agendamentos.";
    }
}
