public class NumPointsInRange {
    public static void main(String[] args) {
        int[] list1 = {1, 4, 6, 8, 10};
        int[] list2 = {1, 14, 16, 28, 100, 120};
        int[] list3 = {100, 142, 165, 384, 1000};

        System.out.println(numPointsInRange(list1, 0, 5));
        System.out.println(numPointsInRange(list1, 6, 10));
        System.out.println(numPointsInRange(list1, 7, 100));

            System.out.println();
        
        System.out.println(numPointsInRange(list2, 0, 50));
        System.out.println(numPointsInRange(list2, 6, 100));
        System.out.println(numPointsInRange(list2, 27, 1000));

            System.out.println();
        
        System.out.println(numPointsInRange(list3, 0, 50));
        System.out.println(numPointsInRange(list3, 6, 130));
        System.out.println(numPointsInRange(list3, 7, 1000));
    }

    // could also just iterate through each element since the arrays are small, but left/right pointers are more efficient
    public static int numPointsInRange(int[] list, int min, int max) {
        int leftPointer = 0;
        int rightPointer = list.length - 1;

        while (leftPointer < list.length && list[leftPointer] < min) {
            leftPointer++;
        }

        while (rightPointer >= 0 && list[rightPointer] > max) {
            rightPointer--;
        }

        if (leftPointer > rightPointer || leftPointer == list.length || rightPointer == -1) {
            return 0;
        }

        return rightPointer - leftPointer + 1;
    }

}
