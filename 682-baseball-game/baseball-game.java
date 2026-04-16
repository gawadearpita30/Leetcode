class Solution {
    public int calPoints(String[] ops) {
        int[] stack = new int[ops.length];
        int top = -1;

        for (int i = 0; i < ops.length; i++) {
            String op = ops[i];

            if (op.equals("+")) {
                int val = stack[top] + stack[top - 1];
                stack[++top] = val;
            } 
            else if (op.equals("D")) {
                int val = 2 * stack[top];
                stack[++top] = val;
            } 
            else if (op.equals("C")) {
                top--; 
            } 
            else {
            
                int num = Integer.parseInt(op);
                stack[++top] = num;
            }
        }

        int sum = 0;
        for (int i = 0; i <= top; i++) {
            sum += stack[i];
        }

        return sum;
    }
}