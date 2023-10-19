package animalandia;

// Clase de prueba
public class proceso {

    public static void main(String[] args) {

        // Instanciar animales
        canino perro = new canino("ladrido", "carnívora", "doméstico", "Canis lupus familiaris");
        canino lobo = new canino("maullido", "carnívora", "bosque", "Canis lupus");
        felino león = new felino("rugido", "carnívora", "pradera", "Panthera leo");
        felino gato = new felino("maullido", "roedores", "doméstico", "Felis silvestris catus");

        // Crear un array de animales
        animal[] animales = {perro, lobo, león, gato};

        // Imprimir los valores de los atributos de los animales
        for (animal animal : animales) {
            // Obtener el tipo de animal
            String tipo = animal.getClass().getSimpleName();

            // Imprimir el tipo de animal
            System.out.println(tipo);

            // Imprimir el nombre científico y todas las características del animal
            System.out.println(animal.getCaracteristicas());
        }
    }
}