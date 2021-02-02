package examenconvocatoria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alvaroafonsolopez
 */
public class Product implements Subject{
    
    private String description;
    private String name;
    private double currentBid;
    private Observer currentBider;
    private double initialAmount;
    private List<Observer> observers = new ArrayList<>();
    private List<Image> images = new ArrayList<>();
    private int daysToFinish;
    
    public Product(String name, String description, double initialAmount, int days){
        this.name = name;
        this.description = description;
        this.initialAmount = initialAmount;
        currentBid = initialAmount;
        daysToFinish = days;
    }

    @Override
    public void addObserver(Observer ob) {
        observers.add(ob);
        System.out.println("El usuario " + ob.getName() + " acaba de unirse a la subasta de " + name);

    }

    @Override
    public void removeObserver(Observer ob) {
        observers.remove(ob);
        System.out.println("El usuario " + ob.getName() + " acaba de retirarse de la subasta de " + name);
    }

    @Override
    public void notifyOb() {
        for (Observer observer : observers) {
            observer.update(currentBider, this);
        }
    }

    @Override
    public void setAmount(Observer ob, double amount) {
        if(observers.contains(ob)){
            if(amount > currentBid){
                currentBid = amount;
                currentBider = ob;
                notifyOb();
            }else{
                System.out.println(ob.getName() + ": La cantidad debe ser superior a la puja actual");
            }
        }else{
            System.out.println("El usuario " + ob.getName() + " no pertenece a la puja.");
        }
    }
    
    @Override
    public String toString(){
        return "Producto: " + name + "\n" +
              description + "\n" +
              "Empezó en " + initialAmount + " euros." + "\n" +
              "La puja actual es de " + currentBid + ", perteneciente a " + currentBider.getName() + "\n" + 
              "Quedan " + daysToFinish + " días para que finalice la puja" + "\n\n" + 
              "Fotos: \n" + 
              getImageDescriptions();
    }
    
    private String getImageDescriptions(){
        String result = "";
        for (Image image : images) {
            result += image.getDescription() + "\n";
        }
        return result;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addImage(Image img) {
        images.add(img);
    }
    
}
