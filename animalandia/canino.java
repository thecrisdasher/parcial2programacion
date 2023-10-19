package animalandia;

public class canino extends animal {

    public canino(String sonidos, String alimentos, String hábitat, String nombreCientifico) {
        super(sonidos, alimentos, hábitat, nombreCientifico);
    }

    @Override
    public String getNombreCientifico() {
        return this.nombreCientifico;
    }

    @Override
    public String getSonido() {
        return this.sonidos;
    }

    @Override
    public String getAlimentos() {
        return this.alimentos;
    }

    @Override
    public String getHábitat() {
        return this.hábitat;
    }
}