import java.util.Random;
import java.lang.Math; 
import java.util.*;
public class WeightMatrix{
    Random rand = new Random();
    
    public int input_layer;
    public int next_layer;
    public int weightsize;

    public WeightMatrix(){}
    
    //creates number of neurons for input and next layer 
    public WeightMatrix(int i, int n){
        input_layer = i;
        next_layer = n;
        weightsize = input_layer * next_layer;
    }

    
    //create random weights based on number of input and output neurons in a layer
    public double[][] createWeights(){
        
        double [][] weights = new double [input_layer][next_layer];
        for(int col  = 0; col < weights[0].length; col++){
            for(int row = 0; row < weights.length; row++){
                weights[row][col] = Math.random() * 1 + 0;
            }
        }
        return weights;
        
    }
    public void printWeights(double[][] w){
       System.out.println("---------------Weight Matrix-----------");
       System.out.println("{");
       
       for(int row = 0; row< w.length; row++){
            for(int col= 0; col < w[0].length; col++){
              System.out.print(w[row][col]+ ", ");
              
            }
            System.out.println("");
            System.out.println();
        }
        System.out.println("}");
    }

}