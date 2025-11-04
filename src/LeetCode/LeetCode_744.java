package LeetCode;
// Find Smallest Letter Greater Than Target
public class LeetCode_744 {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < letters[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        if(start > letters.length - 1){
            return letters[0];
        }
        // return letters[start % letters.length];
        return letters[start];
    }
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        System.out.println(nextGreatestLetter(letters, 'c'));
    }
}
