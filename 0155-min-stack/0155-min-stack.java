class MinStack {
    Long min;
    Stack<Long> stack = new Stack<>();
    public MinStack() {
        min = Long.MAX_VALUE;
    }
    
    public void push(int val) {
        Long value = Long.valueOf(val);
        if(stack.empty()){
            min = value;
            stack.push(value);
        }else{
            if(value < min){
                stack.push(2*value - min);
                min = value;
            }else{
                stack.push(value);
            }
        }
    }
    
    public void pop() {
        if(stack.empty())return;
        Long val = stack.pop();
        if(val < min){
            min = 2*min - val;
        }
    }
    
    public int top() {
        Long val = stack.peek();
        if(val < min){
            return (int) (long) min;
        }
        return (int) (long) val;
    }
    
    public int getMin() {
        return (int) (long) min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */