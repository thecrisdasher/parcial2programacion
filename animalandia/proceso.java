package animalandia;


public class proceso {

    public static void main(String[] args) {

      
        canino perro = new canino("ladrido", "carnívora", "doméstico", "Canis lupus familiaris");
        canino lobo = new canino("maullido", "carnívora", "bosque", "Canis lupus");
        felino león = new felino("rugido", "carnívora", "pradera", "Panthera leo");
        felino gato = new felino("maullido", "roedores", "doméstico", "Felis silvestris catus");

     
        animal[] animales = {perro, lobo, león, gato};

 
        for (animal animal : animales) {
      
            String tipo = animal.getClass().getSimpleName();

         
            System.out.println(tipo);

            
            System.out.println(animal.getCaracteristicas());
        }
    }
}