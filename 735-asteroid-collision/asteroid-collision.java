class Solution {
    public int[] asteroidCollision(int[] asteroids) {
Stack<Integer> stack = new Stack<>();

for (int a : asteroids) {
while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {
int diff = a + stack.peek();
if (diff < 0) {
stack.pop(); // Asteroid a survives, top of stack explodes
continue;
} else if (diff > 0) {
a = 0; // Asteroid a explodes
} else {
stack.pop(); // Both explode
a = 0;
}
}
if (a != 0) {
stack.push(a);
}
}

return stack.stream().mapToInt(i -> i).toArray();
}
}