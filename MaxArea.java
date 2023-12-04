public class MaxArea {
      public static void main(String[] args) {
        int[] array1 = {6, 2, 5, 4, 5, 1, 6};
        int[] array2 = {6, 2, 5, 4, 5, 1, 6};
        int[] array3 = {}
        
        int maxArea = maxArea(array);
        System.out.println("Largest Rectangle Area: " + maxArea);
    }

    // Calculates the max area using a stack
    public static int maxArea(int[] array) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int index = 0;

        while (index < array.length) {
            if (stack.isEmpty() || array[stack.peek()] <= array[index]) {
                stack.push(index);
                index++;
            } else {
                int top = stack.pop();
                int height = array[top];
                int width = stack.isEmpty() ? index : index - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            int height = array[top];
            int width = stack.isEmpty() ? index : index - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }
}
