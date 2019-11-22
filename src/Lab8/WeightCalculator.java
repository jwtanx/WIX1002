/*
3. Define a class name WeightCalculator. The class has an input method that accepts the user’s age and height. Besides, the class consists a method that calculating the recommend weight with this formula recommend weight = (height – 100 + age / 10) * 0.9 The class will display the user’s age, height and the recommend weight. Create a Tester class to test the program. 
 */
package Lab8;

public class WeightCalculator {
    
    private int age;
    private int height;
    private double recommendedWeight;
    
    public WeightCalculator(){
        age = 0;
        height = 0;
        recommendedWeight = 0.00;
    }
    
    public WeightCalculator(int age, int height){
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public void calcRecommendedWeight(int a, int h){
        this.recommendedWeight = ((h - 100) + (a / 10)) * 0.9;
    }

    @Override
    public String toString() {
        return "Age\t\t\t: " + age + 
                "\nHeight\t\t\t: " + height + " cm" + 
                "\nRecommended Weight\t: " + recommendedWeight + " kg";
    }
    
    
    
    
}
