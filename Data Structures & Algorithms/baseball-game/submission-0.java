class Solution {
    public int calPoints(String[] operations) 
    {
      Stack<Integer> stack = new Stack<>();
        
        for (String op : operations) {
            if (op.equals("+")) {
                // Sum the last two scores
                int top = stack.pop();
                int newScore = top + stack.peek();
                stack.push(top);
                stack.push(newScore);
            } else if (op.equals("D")) {
                // Double the last score
                stack.push(2 * stack.peek());
            } else if (op.equals("C")) {
                // Remove the last score
                stack.pop();
            } else {
                // Record a new integer score
                stack.push(Integer.parseInt(op));
            }
        }
        
        // Calculate the sum of all elements in the stack
        int sum = 0;
        for (int score : stack) {
            sum += score;
        }
        
        return sum;
    }
}