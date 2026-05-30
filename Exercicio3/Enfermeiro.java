package Exercicio3;

public class Enfermeiro extends Funcionario {
    public Enfermeiro(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String exibirFuncao() {
        return "Presta cuidados aos pacientes e auxilia o medico.";
    }
}
