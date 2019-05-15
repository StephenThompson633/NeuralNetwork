import java.util.ArrayList;
public class Layer{
    //this array list will hold 

    ArrayList<Double> activations = new ArrayList<>();
    //number of neurons stored in the array if decided to change list to array 
    int nuerons = activations.size();
    //default constructor 
    public Layer(){}

    //print layer activations 
    public void printLayer(ArrayList<Double> vector){
        for (Double a : vector){
            System.out.println("["+ a +"]");
            System.out.println();       
        }
    }


    

}