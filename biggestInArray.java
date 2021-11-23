package cwhPractice;

public class biggestInArray {
    public static void main(String[] args) {
        //Random Values of Array
        int[] numbers = new int[]{1, 2000, 301, 4, 5010};
        //Assumed that our maximum value is at index 0.
        int maxElement = numbers[0];
        for (int i = 0; i <= numbers.length - 1; i++) {
            /*If the element at index i is greater than our assumed value
            our maxElement will be that value.
            */
            if (numbers[i] > maxElement) {
                maxElement = numbers[i];
            }
        }
        //Printing out the value.
        System.out.println(maxElement);
    }
}

