class MyStack {

    int q1[] = new int[100];
    int q2[] = new int[100];

    int f1 = 0, r1 = -1;
    int f2 = 0, r2 = -1;

    // push element
    public void push(int x) {
        // add to q2
        q2[++r2] = x;

        // move all from q1 to q2
        while (f1 <= r1) {
            q2[++r2] = q1[f1++];
        }

        // copy q2 back to q1
        f1 = 0; 
        r1 = -1;
        for (int i = f2; i <= r2; i++) {
            q1[++r1] = q2[i];
        }

        // reset q2
        f2 = 0; 
        r2 = -1;
    }

    // pop element
    public int pop() {
        if (empty()) return -1;
        return q1[f1++];
    }

    // top element
    public int top() {
        if (empty()) return -1;
        return q1[f1];
    }

    // check empty
    public boolean empty() {
        return f1 > r1;
    }
}