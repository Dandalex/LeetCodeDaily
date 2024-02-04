public class MyQueue {
        private int[] myQueue;
        

        public MyQueue(int[] myQueue) {
            this.myQueue = myQueue;
        }

        public void push(int x) {
            int [] myQueue2= new int[myQueue.length+1];
            for (int i = 0; i < myQueue.length; i++) {
                myQueue2[i]=myQueue[i];
            }
            myQueue2[myQueue.length+1]=x;
            myQueue=myQueue2;
        }

        public int pop() {
            int [] myQueue2= new int[myQueue.length-1];
            for (int i = 1; i <myQueue.length; i++) {
                myQueue2[i-1]=myQueue[i];
            }
            int x=myQueue[0];
            myQueue =myQueue2;
            return x;
        }

        public int peek() {
            return myQueue[0];
        }

        public boolean empty() {
            return myQueue.length <= 0;
        }


/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
