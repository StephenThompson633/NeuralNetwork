import java.util.*;
public class Test{
    
    public static void main (String[]args){
        //test input layer 
        double [] input_activations = {1, 1, 1};
        Layer input_layer = new Layer();
        for(double a : input_activations){
            input_layer.activations.add(a);
        }

        //create weight matrix 
        //pass thru number of neurons for (input,output) to create matrix
        WeightMatrix matrix = new WeightMatrix(input_layer.neurons,3);
        double[][] w = matrix.createWeights();
        
        
        
        //print matrix
        matrix.printWeights(w);

        //creating activations and store in vector 
        System.out.println("---------------Output Activation Vector-----------");
        
        Layer hidden_layer1 = new Layer();
        hidden_layer1.activations = multiply(w, input_activations);
        
        //print activations 
        hidden_layer1.printLayer(hidden_layer1.activations);

        //storing the layers in a network
        LinkedList<Layer> network = new LinkedList<>();
        network.add(input_layer);
        network.add(hidden_layer1);
        
        
       
    }
    /*---------------------------End of Main Method---------------------------------*/
    //crunch function to make activations between one and zero
    public static double sigmoidfunc(double x){
        return (1/( 1 + Math.pow(Math.E,(-1*x))));
    }

    //looping through to multiply the number from the activations times the perspective weights
    public static ArrayList<Double> multiply(double [][] w, double [] activations){
        ArrayList<Double> product = new ArrayList<>();
        double sum; 
        int count;
        for(int col  = 0; col < w[0].length; col++)
        {
            sum = 0;
            count = 0;
            for(double activation : activations){
                sum += (activation * w[count][col]);
                count++;
            }
            product.add(sigmoidfunc(sum));
        }
        return product;
    }
    
}
