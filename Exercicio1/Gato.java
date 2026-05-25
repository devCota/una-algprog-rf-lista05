public class Gato extends Animal {
    
    public Gato(String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public String emitirSom() {
        return "MINHAU!";
    }

    @Override
    public String toString() {
        return "Gato: " + this.getNome() + ", Idade: " + this.getIdade();
    }

    
}   
