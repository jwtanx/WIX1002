/*
 * 2. A geographic coordinate system is used to determine locations on the earth with longitude and latitude coordinates. You can use the Java Math library. The program must consist of the following methods:

- A method to request the user to enter the direction (N, S, E, W), degree, minute and second.
- A method to convert the input into decimal degree based on the formula and table below.

decimal degree = (Sign) (degree + (minute * 60 + second) / 3600)

Direction       Sign        Type
N               +           Latitude
S               -           Latitude
E               +           Longitude
W               -           Longitude

- A method to calculate the distance using haversine formula as below

a = sin²(Δφ / 2) + cos φ1 × cos φ2 × sin²(Δλ / 2)
c = 2 × atan2(√a, √(1-a))
d = R × c

φ is latitude, Δφ is the difference between two latitudes
λ is longitude, Δλ is the difference between two longitudes
(All angles need to convert to radians)
R is the earth's radius(6371), d is the distance

Sample output
Enter Location 1
Enter Direction: [N, S, E, W]: N
Enter Degree, Minute and Second : 32 45 51
Enter Direction: [N, S, E, W]: W
Enter Degree, Minute and Second : 21 19 8
Enter Location 2
Enter Direction: [N, S, E, W]: S
Enter Degree, Minute and Second : 13 22 58
Enter Direction: [N, S, E, W]: E
Enter Degree, Minute and Second : 8 11 20
Location 1 : 32.764167 Latitude , -21.318889 Longitude
Location 2 : -13.382778 Latitude , 8.188889 Longitude
Distance : 6013.08 KM

 */
package Exercise.PastFinalTerm;

import java.util.Scanner;

public class FT20S1Q2 {
    public static void main(String[] args) {
        
        String[] temp;
        
        System.out.println("Enter Location 1");
        temp = inputData();
        double lat1 = calcDecimalDegree(temp[0].charAt(0), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), Integer.parseInt(temp[3]));
        temp = inputData();
        double lon1 = calcDecimalDegree(temp[0].charAt(0), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), Integer.parseInt(temp[3]));
        
        System.out.println("Enter Location 2");
        temp = inputData();
        double lat2 = calcDecimalDegree(temp[0].charAt(0), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), Integer.parseInt(temp[3]));
        temp = inputData();
        double lon2 = calcDecimalDegree(temp[0].charAt(0), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), Integer.parseInt(temp[3]));
        
        calcDistance(lat1, lon1, lat2, lon2);
    }
    
    public static String[] inputData(){
        
        Scanner s = new Scanner(System.in);
        String[] data = new String[4];
        
        System.out.print("Enter Direction: [N, S, E, W]: ");
        data[0] = String.valueOf(s.next().charAt(0));
        s.nextLine();
        
        System.out.print("Enter Degree, Minute and Second : ");
        String[] tempData = s.nextLine().split(" ");
        data[1] = tempData[0];
        data[2] = tempData[1];
        data[3] = tempData[2];
        
        return data;
    }
    
    public static double calcDecimalDegree(char direction, double degree, double minute, double second){
        
        double decimalDegree = 0;
        
        switch(direction){
            
            case 'N':
                decimalDegree = (degree + (minute * 60 + second) / 3600);
                break;
                
            case 'S':
                decimalDegree = -(degree + (minute * 60 + second) / 3600);
                break;
                
            case 'E':
                decimalDegree = (degree + (minute * 60 + second) / 3600);
                break;
                
            case 'W':
                decimalDegree = -(degree + (minute * 60 + second) / 3600);
                break;
                
            default:
                System.out.println("Unknown direction");
                
        }
        
        return decimalDegree;
    }
    
    public static void calcDistance(double lat1, double lon1, double lat2, double lon2){
        
        double R = 6371;
        double rad = Math.PI / 180.0;
        
        System.out.printf("Location 1 : %f Latitude , %f Longitude\n", lat1, lon1);
        System.out.printf("Location 2 : %f Latitude , %f Longitude\n", lat2, lon2);
        
        double latDiff = (lat1 - lat2) * rad;
        double lonDiff = (lon1 - lon2) * rad;
        lat1 = lat1 * rad;
        lon1 = lon1 * rad;
        lat2 = lat2 * rad;
        lon2 = lon2 * rad;
        
        double a = Math.pow(Math.sin(latDiff / 2), 2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(lonDiff / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double d = R * c;
        
        System.out.printf("Distance : %.2f KM\n", d);
        
    }
}
