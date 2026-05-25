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

        List<Animal> animais = new ArrayList<>();
        animais.add(animal);
        animais.add(cachorro);
        animais.add(gato);

        for (Animal animal : animais) {
            System.out.println(animal.toString());
            System.out.println(animal.emitirSom());
        }

    }
}
