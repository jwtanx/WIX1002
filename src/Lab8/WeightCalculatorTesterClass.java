/*
 3. Define a class name WeightCalculator. The class has an input method that accepts the user’s age and height. Besides, the class consists a method that calculating the recommend weight with this formula recommend weight = (height – 100 + age / 10) * 0.9 The class will display the user’s age, height and the recommend weight. Create a Tester class to test the program. 
 */
package Lab8;

public class WeightCalculatorTesterClass {
    public static void main(String[] args) {
        
        WeightCalculator user1 = new WeightCalculator(20, 176);
        user1.calcRecommendedWeight(user1.getAge(), user1.getHeight());
        System.out.println(user1.toString());
    }
}
