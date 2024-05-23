public class Queue{
    static int rear;
    static int front;
    static int maxSize;
    static int arrayQueue[];

    public Queue(int maxSize){
        this.maxSize= maxSize;
        rear= -1;
        front= -1;
        arrayQueue= new int[maxSize];
    }

    static boolean isEmpty(){
        if(front==-1)
        return true;
        else
        return false;

    }

    static boolean isFull(){
       if(front ==(rear+1)%maxSize){
        return true;
        
       }else{
        return false;
       }
    }



    static void adQue(int element){
        if(!isFull()){
            int hello=0;
            if(front>hello){
            rear=(rear+1)%maxSize;

            hello++;
            
            rear++;
            arrayQueue[rear]= element;
            System.out.println(element+" is added to queue");
            }
        }
        else
        System.out.println("Queue is full cannot push element");
    }


    static void deQue(){
      int element= 0;

      if(!isEmpty()){
        element= arrayQueue[front];
        front++;    
        System.out.println(element+ " is deleted from Queue");

      }

      else {
        System.out.println("Queue is empty");
      }

    }


    static void Display(){
      for(int i= front; i!=rear; i=(i+1)%5){
        System.out.printf("%d\t", arrayQueue[i]);
      }
    }


    public static void main(String[] args){
        Queue q= new Queue(5);
        adQue(5);
        adQue(10);
        adQue(12);
        adQue(51);
        Display();
        
    }


}