package zoo;


/**
 *
 * @author Paco lopez
 * @version 0.1
 * @see Animal
 * @serial Serialize cacareo {@value}
 * @since 13/05/19
 
 */
public class Gallina extends Ave {
 
    private String cacareo = "KOKOKO";
    
    public Gallina () {}
    
    public Gallina (Habitat habitat, String comida, int longevidad, int periodoIncubacion) {
        super(habitat, comida, longevidad, periodoIncubacion);
    }
    
    /**
     * @deprecated
     * @param cacareo Cadena
     * @throws generarEjemplo No se encuentra el método
     */
    public void setCacareo (String cacareo) { this.cacareo = cacareo; }
    
    public String getCacareo () { return cacareo; }
    
    public void cacarear () { System.out.println(cacareo); }
    
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    public void desplazar () { System.out.println("Estoy volando con mucha dificultad"); }
}
