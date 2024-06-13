package dataStructure;

public class Main {


    public static void main(String[] args) {
        Stack myStack = new Stack(2);
        myStack.push(1);

        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop() == null);

//
//        myStack.getTop();
//        myStack.getHeight();
//        myStack.print();
//
//
//        myStack.print();
//
//        myStack.getTop();
//        myStack.getHeight();
    }
}
