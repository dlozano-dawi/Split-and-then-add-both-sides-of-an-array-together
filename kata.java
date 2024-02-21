public class kata {

    public static void main(String[] args) {
        int[] solve = splitAndAdd(new int[]{4, 2, 5, 3, 2, 5, 7}, 3);
        for (int i = 0; i < solve.length; i++) {
            System.out.print(solve[i] + ", ");
        }
    }
    public static int[] splitAndAdd(int[] numbers, int n) {
        for (int i = 0; i < n; i++) {
            if (numbers.length < 2) return numbers;
            else numbers = split(numbers);
        }
        return numbers;
    }
    public static int[] split(int[] numbers){
        int[] numbersSplitted = new int[(int) Math.ceil((double) numbers.length / (double)2)];
        int[] left = new int[(int) Math.floor((double) numbers.length / (double)2)];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers.length % 2 == 0) {
                if (i < numbers.length / 2) left[i] = numbers[i];
                else numbersSplitted[i-left.length] = numbers[i];
            } else {
                if (i < numbersSplitted.length - 1) left[i] = numbers[i];
                else numbersSplitted[i-left.length] = numbers[i];
            }
        }
        
        for (int i = 1; i <= left.length; i++) numbersSplitted[numbersSplitted.length - i] += left[left.length - i];

        return numbersSplitted;
    }
    
}