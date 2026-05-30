package Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        funcionarios.add(new Medico("Dr. Carlos", 12000.00));
        funcionarios.add(new Recepcionista("Marina", 2500.00));
        funcionarios.add(new Enfermeiro("Joao", 4500.00));

        System.out.println("Funcionarios da clinica:");

        for (Funcionario funcionario : funcionarios) {
            System.out.printf(
                "Nome: %s | Salario: R$ %.2f | Funcao: %s%n",
                funcionario.getNome(),
                funcionario.getSalario(),
                funcionario.exibirFuncao()
            );
        }
    }
}
