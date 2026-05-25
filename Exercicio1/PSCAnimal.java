public class PSCAnimal {
    public static void main(String[] args) {
        
        Animal animal = new Animal("Ollie", 5);
        Cachorro cachorro = new Cachorro("Rex", 3);
        Gato gato = new Gato("Zatana", 2);

        System.out.println("=== Animais ===");
        System.out.println(animal.emitirSom());
        System.out.println(animal.toString());

        System.out.println("=== Cachorro ===");
        System.out.println(cachorro.emitirSom());
        System.out.println(cachorro.toString());

        System.out.println("=== Gato ===");
        System.out.println(gato.emitirSom());
        System.out.println(gato.toString());

    }
}