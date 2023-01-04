public class LocationProbailities{

    public static void populateLocationProbabilities( double[] drywetProbability, double[] wetwetProbability,
    double longitude, double latitude,
    double[] [] drywet, double[ ] [] wetwet) {
    
    for (int i = 0; i< drywet . length; i++) {
    for (int j = 0; j < drywet[i]. length; j++){
    if (longitude == drywet[i] [0] && latitude == drywet[i][1]) {
    drywetProbability[i] = drywet[i][j + 2];
    }
    }
    }
    for (int i = 0; i< wetwet . length; i++) {
    for (int j = 0; j < wetwet[i]. length; j++){
    if (longitude == wetwet[i] [0] && latitude == wetwet[i][1]) {
    wetwetProbability[i] = wetwet[i][j + 2];
    }
    }
    }
    }


public static void main(String[] args) {

double[] drywetProbability = new double[12];
double[] wetwetProbability = new double[12];

double longitude = -77.036133;
double latitude = 38.895111;

double[][] drywet = {{-77.036133,38.895111,0.37,8.43,0.38,0.48,0.42,0.49,0.57,0.70,0.48,0.44,0.44,0.36}, 
{-77.036133,38.895112,0.76,8.75,0.77,0.74,0.80,0.86,0.94,0.97,0.89,0.77,0.74,0.77}};
double[][] wetwet = {{-77.036133,38.895111,0.37,8.43,0.38,0.48,0.42,0.49,0.57,0.70,0.48,0.44,0.44,0.36}, 
{-77.036133,38.895112,0.76,8.75,0.77,0.74,0.80,0.86,0.94,0.97,0.89,0.77,0.74,0.77}};

populateLocationProbabilities(drywetProbability, wetwetProbability, longitude, latitude, drywet, wetwet);

System.out.println("Drywet Probability: ");
for (int i = 0; i < drywetProbability.length; i++) {
System.out.print(drywetProbability[i] + " ");
}

System.out.println();

System.out.println("Wetwet Probability: ");
for (int i = 0; i < wetwetProbability.length; i++) {
System.out.print(wetwetProbability[i] + " ");
}

}
}