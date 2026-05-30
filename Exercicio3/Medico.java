package Exercicio3;

public class Medico extends Funcionario {
    public Medico(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String exibirFuncao() {
        return "Realiza consultas e diagnosticos.";
    }
}
