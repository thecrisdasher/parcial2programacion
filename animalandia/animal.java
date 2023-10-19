package animalandia;

public abstract class animal {

    protected String sonidos;
    protected String alimentos;
    protected String hábitat;
    protected String nombreCientifico;

    public animal(String sonidos, String alimentos, String hábitat, String nombreCientifico) {
        this.sonidos = sonidos;
        this.alimentos = alimentos;
        this.hábitat = hábitat;
        this.nombreCientifico = nombreCientifico;
    }

    public abstract String getNombreCientifico();

    public abstract String getSonido();

    public abstract String getAlimentos();

    public abstract String getHábitat();

    public String getCaracteristicas() {
        return "Nombre científico: " + this.getNombreCientifico() + "\n" +
                "Sonido: " + this.getSonido() + "\n" +
                "Alimentos: " + this.getAlimentos() + "\n" +
                "Hábitat: " + this.getHábitat();
    }
}
