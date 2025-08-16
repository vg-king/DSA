import java.util.*;
class Queue{
    int f = -1;
    int r = -1;
    int size = 0;
    int [] arr = new int[100];
   
    public void enqueue(int val){
        if (r==arr.length) {
            System.out.println("Queue is Full");
            return;
        }
        if (f==-1) {
            f=r=0;
            arr[0] = val;
        }
        else{
            arr[++r] = val;
        }
        size++;
    }
    public int dequeue(){
        if (size==0) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int x = arr[r];
        r--;
        size--;
        return x;
    }
    public int peek(){
         if (size==0) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[r];
    }
    public boolean isEmpty(){
        if (size==0) {
            return true;
        }
        return false;
    }
    public void display(){
         if (size==0) {
            System.out.println("Queue Underflow");
            return ;
        }
        for (int i = f; i <=r; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
public class ImplementStackUsingQueue {

    public static void main(String[] args) {
        
    }
}
