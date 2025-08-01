public class ConvertTheTemperature {

    public static void main(String[] args) {
        double [] ans= convertTemperature(36.50);
        printArray(ans);
    }
    public static double[] convertTemperature(double celsius) {
        double [] res=new double[2];
        res[0]=celsius+273.15;
        res[1]=(celsius*1.80)+32.00;
        return res;
    }
    public static void printArray(double [] ans){
        for (double d:ans){
            System.out.print(d+" ");
        }
    }

}


/*
2469. Convert the Temperature
You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.
You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].
Return the array ans. Answers within 10-5 of the actual answer will be accepted.

Note that:
Kelvin = Celsius + 273.15
Fahrenheit = Celsius * 1.80 + 32.00

Example 1:
Input: celsius = 36.50
Output: [309.65000,97.70000]
Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65 and converted in Fahrenheit is 97.70.

*/