import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "V"; // Example: V
        
        int result = romanToInteger(romanNumeral);
        
        System.out.println(result); // Output: 5
    }
    
    public static int romanToInteger(String romanNumeral) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        int result = 0;
        int prevValue = 0;
        
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(romanNumeral.charAt(i));
            
            if (currentValue >= prevValue) {
                result += currentValue;
            } else {
                result -= currentValue;
            }
            
            prevValue = currentValue;
        }
        
        return result;
    }
}
