public class Dequeue {
    int size;
    int head;
    int tail;
    int[] date;

    Dequeue(int size){
        date = new int[this.size = size];
    }

    void pushBack(int value){
        if(++tail == size){
            tail = 0;
        }
        date[tail] = value;
    }

    int popBack(){
        int ret = date[tail];
        if(--tail<0){
            tail = size-1;
        }
        return ret;
    }

    int popFront(){
        if(++head==size){
            head = 0;
        }
        return date[head];
    }

    void pushFront(int value){
        date[head] = value;
        if(--head<0){
            head = size-1;
        }
    }

    boolean isEmpty(){
        return head==tail;
    }
}
