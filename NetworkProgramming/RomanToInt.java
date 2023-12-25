import java.util.*;;

public class RomanToInt {
        public int romanToInt(String s) {
            HashMap<Character, Integer> romanMap = new HashMap<Character, Integer>();
            romanMap.put('I', 1);
            romanMap.put('V', 5);
            romanMap.put('X', 10);
            romanMap.put('L', 50);
            romanMap.put('C', 100);
            romanMap.put('D', 500);
            romanMap.put('M', 1000);
            
            int result = 0;
            int prev = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                // Get the integer value of the current Roman numeral from the map
                int curr = romanMap.get(s.charAt(i));
                
                // Determine whether to add or subtract the current value from the result
                if (curr < prev) {
                    result -= curr;
                } else {
                    result += curr;
                }
                
                // Update the previous value for the next iteration
                prev = curr;
            }
            
            // Return the final result
            return result;
    }
    public static void main(String[] args) {
        RomanToInt s = new RomanToInt();
        String value = "XV";
        int intValue = s.romanToInt(value);
        System.out.println(intValue);
    }
}
