import java.util.Scanner;
class Stacks{

    int size;
    int [] data;
    int top;

    Stacks(int s) {

        size = s;
        data = new int[size];
        top = -1;
    }

    void push(int i) {
        if(top == size - 1) {
            System.out.println("overlfow");
            return;
        }
        top++;
        data[top] = i;
    }
    void pop() {
        if(top < 0)
        {
            System.out.println("underflow");
            return;
        }
        top--;
    }
    int top() {

        return data[top];
    }
    public static void main(String args[]){

        Stacks s = new Stacks(10);
        s.push(10);
        s.pop();
        s.pop();
        s.push(5);
        s.push(11);
        s.pop();

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();
        
        Stack stack = new Stack(size);

        System.out.println("Enter elements into the stack:");
        for (int i = 0; i < size; i++) {
            int a=sc.nextInt();
            stack.push(a);
        }

        System.out.println("Peek: " + stack.peek());

        System.out.println("ENTER HOW MANY ELEMNTS YOU WANT TO POP : ");
        int aa=sc.nextInt();

        if(aa>size){
            System.out.println("NO ELEMENTS EXCEED SIZE OF STACK");
        }

        else{
        for(int i=0;i<aa;i++){
            stack.pop();
        }
        }

        if(stack.isEmpty()) {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack is not empty");
        }
 



    }
}