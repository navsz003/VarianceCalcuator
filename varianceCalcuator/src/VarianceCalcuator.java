import java.util.Scanner;

public class VarianceCalcuator{
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        //return result
        getVariance(getData());
    }

    //collect data
    public static double[] getData(){
        int num = 0;

        System.out.println("Enter the number of data: ");
        num = input.nextInt();

        double[] data = new double[num];

        for(int i = 0; i < num; i++){
            System.out.println("Enter the " + (i + 1) + " number: ");
            data[i] = input.nextDouble();
        }

        return data;
    }


    public static double getMean(double[] data){
        double size = data.length;
        double total = 0.0;
        double mean = 0.0;

        for (int i = 0; i < size; i++){
            total += data[i];
        }
        
        mean = total / size;
        System.out.println("Mean:\t\t" + mean);
        return mean;
    }



    public static double getVariance(double[] data){
        double mean = getMean(data);
        double size = data.length;
        double numerator = 0.0;
        double squareVariance = 0.0;
        double variance = 0.0;

        //get numerator here
        for(int i = 0; i < size; i++){
            numerator += (data[i] - mean)*(data[i] - mean);
        }

        variance = numerator / size;
        System.out.println("Variance:\t" + variance);
        System.out.println("Stan Dev:\t" + Math.pow(variance,0.5));
        return variance;
    }
    
}
