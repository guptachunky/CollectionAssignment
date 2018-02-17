class Stack {

    static final int MAX = 1000;
    int top;
    int minimum=Integer.MAX_VALUE;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return (top < 0);
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        if (top >= MAX) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            if(x<minimum){
                minimum=x;
            }
            a[++top] = x;
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            if(a[top]==minimum){
                findMin();
            }
            int x = a[top--];
            return x;
        }
    }

    void findMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < top; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        minimum=min;
    }

    int getMin() {
        //return min;
       if(isEmpty()){
           return -1;
       }
       else
       {
           return minimum;
       }
    }
}

public class Question7 {

    public static void main(String[] args) {
        Stack obj=new Stack();
        System.out.println(obj.getMin());;
        System.out.println(obj.push(5));
        System.out.println(obj.getMin());;
    }

}
