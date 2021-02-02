package examenconvocatoria;

/**
 *
 * @author alvaroafonsolopez
 */
public class ExamenConvocatoria {

    public static void main(String[] args) {
        Subject bici = new Product("Bicicleta", "Es una bici clásica en perfecto estado", 100, 60);
        Subject coche = new Product("Coche", "Coche deportivo de 600CV recién pasada la ITV", 15000, 120);
        
        Observer alvaro = new Bidder("Álvaro");
        Observer pedro = new Bidder("Pedro");
        Observer laura = new Bidder("Laura");
        Observer fina = new Bidder("Fina");
        
        coche.addObserver(alvaro);
        coche.addObserver(pedro);
        coche.addObserver(laura);
        
        coche.addImage(new Image("Lateral del coche"));
        coche.addImage(new Image("Frontal del coche"));
        coche.addImage(new Image("Trasera del coche"));
        
        bici.addObserver(fina);
        bici.addObserver(laura);
        
        bici.addImage(new Image("Ruedas de la bici"));
        bici.addImage(new Image("Cadenas de la bici"));
        bici.addImage(new Image("Manillar de la bici"));
        
        coche.setAmount(alvaro, 12000);
        coche.setAmount(pedro, 20000);
        coche.setAmount(fina, 50000);
        
        coche.removeObserver(alvaro);
        
        bici.setAmount(fina, 150);
        bici.setAmount(laura, 200);
    }
    
}
