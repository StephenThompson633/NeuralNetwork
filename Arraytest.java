public class Arraytest{
    public static void main (String[]args){
       System.out.println("{");
       int i = 1;
       int [][]array = new int [3][2];
       for(int row = 0; row< array.length; row++){
            for(int col= 0; col < array[0].length; col++){
              array[row][col] = i;
              i++;
            }
          
        }
        for(int col = 0; col< array[0].length; col++){
          for(int row= 0; row < array.length; row++){
            System.out.println(array[row][col] +  ", ");
          
          }
          
        }
        System.out.println("}");
       
    }
}