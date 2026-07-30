class Solution 
{
   public int[] asteroidCollision(int[] asteroids) {
    Stack<Integer> collisions = new Stack<>();

    for (int ast : asteroids) {
        boolean destroyed = false;
        
        while (!collisions.isEmpty() && collisions.peek() > 0 && ast < 0) {
            if (Math.abs(collisions.peek()) < Math.abs(ast)) {
                collisions.pop();
                continue;
            } else if (Math.abs(collisions.peek()) == Math.abs(ast)) {
                collisions.pop();
                destroyed = true;
                break;
            } else {
                destroyed = true;
                break;
            }
        }
        
        if (!destroyed) {
            collisions.push(ast);
        }
    }

    int[] result = new int[collisions.size()];
    for (int i = result.length - 1; i >= 0; i--) {
        result[i] = collisions.pop();
    }
    
    return result;
}
}