package stackDsa;

    class twoStack {
        int size;
        int top1;
        int top2;
        int arr[];

        twoStack(int n) {
            arr = new int[n];
            size = n;
            top1 = -1;
            top2 = size;

        }

        //push element in the stack 1

        public void push1(int x) {
            if (top1 < top2 - 1) {
                top1++;
                arr[top1] = x;
            } else {
                System.out.println("undeflow");
                return;
            }
        }
        // push element in the stack2

        public void push2(int x) {
            if (top1 < top2 - 1) {
                top2--;
                arr[top2] = x;
            } else {
                System.out.println("overflow");
                return;
            }
        }

        //pop1

        public int pop1() {
            if (top1 >= 0) {
                int x = arr[top1];
                top1--;
                return x;
            } else {
                System.out.println("underflow");
            }
            return 0;
        }

        public int pop2() {
            if (top2 < size) {
                int x = arr[top2];
                top2++;
                return x;
            } else {
                System.out.println("underflow");
            }
            return 0;
        }
    }

    class twoStackInAnArray {
        public static void main(String[] args) {
            twoStack ts = new twoStack(5);
            ts.push1(1);
            ts.push1(2);
            ts.push1(3);
            ts.push1(4);
            ts.push1(5);
            ts.push1(40);

        }
    }


