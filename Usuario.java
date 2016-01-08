
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    // instance variables
    private String nombreUsuario;
    private float proteinas;
    private float carbohidratos;
    private float grasas;
    private float caloriasTotales;
    

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String nombreUsuario)
    {
        // initialise instance variables
        this.nombreUsuario=nombreUsuario;
        proteinas=0;
        carbohidratos=0;
        grasas=0;
        caloriasTotales=0;
        
    }

    /**
     * Método con dos parámetros capaz de recibir la clase de alimento y la cantidad del mismo
     */
    public void comer(Alimento comida, float cantidad)
    {
     proteinas = proteinas + comida.getProteinas()*cantidad/100;
     carbohidratos = carbohidratos + comida.getCarbohidratos()*cantidad/100;
     grasas = grasas + comida.getGrasas()*cantidad/100;
     caloriasTotales = caloriasTotales + comida.getcaloriasTotales()*cantidad/10; 
     
    }
    
    /**
     * Método que muestra por pantalla el estado actual del usuario
     */
    public void mostrarDatos()
    {
        
    }
}
