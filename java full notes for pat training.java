insta
import java.util.*;
class Instagram{
    String username = "you*iae.ac";
    private String password="12345678";
    public void updatePassword(String newPassword){
        password=new newPassword;
        
    }
    public String getPassword(){
        return password;
    }
}
public class sample{
    public static void main(String[] args){
        Instagram s1= new Instagram();
        System.out.println(s1.getPassword());
    }
}
----------------------------------------------------------------------------------------------------------
****exceptions
import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        try{
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println("oops buddy,no error");
        }finally{
            System.out.println("finally");
        }
        System.out.println("program complited")
    }
}
==========================================================================================================
***date 28/02/2023
inheritance(first class)(absent)
**polymorphisim: method acting differently producing different outputs at different varaibles
these are two types
1: run time polymorphism(method overriding):two different classes ,same method and same signiture
2: compiler time polymorphism(metho overloading): same class,same method but different signitures
**
----------------------------------------------------------------------------------------------------------
#abstraction:hiding the data from user
ex:
abstract class shape{
    abstract public void welcome();
    public void print(){
        System.out,println("hellow people");
    }
    
}
class dog extends shape{
    public void welcome();{
        System.out,println("hellow java trainers");
    }
}

public static void mai(strin[] args){
Scanner sc new Scanner (System.in);
try{
int age =sc.nextInt();
if(age<18){
throw new Exeption("under age 18");
}
else{
//continue execution
}
System.out.println("valid age");
}
catch(Exception e){
System.out.println("valid age");
}
}
***website anima**
**willbot
*chatgbt
*
===================================================================================================================
DATE 14-MAR-2023;
*ARRAYLIST
import java.util.ArrayList;

class sample{
    public static void main(String[] args) {
        ArrayList<Integer> = new ArrayList<Integer>();
        arr.add(12);
        arr.add(2);
        arr.add(15);
        arr.add(18);
        arr.remove(0);
       
        System.out.println(arr);
        System.out.println( arr.get(0));
        System.out.println( arr.size());
         
    }
}
-------------------------------------------------------------------------------------------------------------------

2)STACK IMPLEMENTATION IN JAVA;
import java.util.ArrayList;

class stack{
    ArrayList<Integer> stk= new ArrayList<Integer>();
    public void push(int element){
        if (stk.size()==size){
            System.out.println(x)
        }else{
            stk.add(stk.size()0)
        }
    }
    public void pop(){
        if (isEmpty()){
            System.out,println(x);
            
            
        }else{
            stk.remove(stk.size()-1);
        }
    }
}

-------------------------------------------------------------------------------------------------------------------
*Queue
class Queue {   
      
    private static int front, rear, capacity;   
    private static int queue[];   
     
    Queue(int size) {   
        front = rear = 0;   
        capacity = size;   
        queue = new int[capacity];   
    }   
    static void queueEnqueue(int item)  {   
        if (capacity == rear) {   
            System.out.printf("\nQueue is full\n");   
            return;   
        }   
        else {   
            queue[rear] = item;   
            rear++;   
        }   
        return;   
    } 
    static void queueDequeue()  {  
        if (front == rear) {   
            System.out.printf("\nQueue is empty\n");   
            return;   
        }    
        else {   
            for (int i = 0; i < rear - 1; i++) {   
                queue[i] = queue[i + 1];   
            }  
            if (rear < capacity)   
                queue[rear] = 0; 
            rear--;   
        }   
        return;   
    }    
    static void queueDisplay()   
    {   
        int i;   
        if (front == rear) {   
            System.out.printf("Queue is Empty\n");   
            return;   
        }   
        for (i = front; i < rear; i++) {   
            System.out.printf(" %d , ", queue[i]);   
        }   
        return;   
    }   
    static void queueFront()   
    {   
        if (front == rear) {   
            System.out.printf("Queue is Empty\n");   
            return;   
        }   
        System.out.printf("\nFront Element of the queue: %d", queue[front]);   
        return;   
    }   
}   
   
public class QueueArrayImplementation {  
    public static void main(String[] args) { 
        Queue q = new Queue(4);   
        System.out.println("Initial Queue:");     
        q.queueDisplay();   
        q.queueEnqueue(10);   
        q.queueEnqueue(30);   
        q.queueEnqueue(50);   
        q.queueEnqueue(70);
        System.out.println("Queue after Enqueue Operation:");  
        q.queueDisplay(); 
        q.queueFront();  
        q.queueEnqueue(90);
        q.queueDisplay();   
        q.queueDequeue();   
        q.queueDequeue();   
        System.out.printf();
        q.queueDisplay();   
        q.queueFront();   
    }   
}

--------------------------------------------------------------------------------------------------------------


***linked list****


class Node{
    int data;
    Node next;
    public Node(int value){
        this.data=value;
        next =null;
    }
}
class LinkedList{
    public void addElement(int data){
        Node new_node =new Node(data);
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=new_node;
    }
    public void deletelement(){
        
    }
    public void printlist(){
        Node cur=head;
        while(cur.next!=null){
            System.out.print(cur.data+"->");
            cur=cur.next;
        }
        
    }
}
public class Main{
    public static void Main(String[] args){
        Linkedlist LL=new LinkedList();
        Node head=new Node(10);
        LL.addElement(20);
        LL.addElement(30);
        LL.addElement(40);
        LL.printlist(head);
        
    }
}
correct one



class Node {
    int data;
    Node next;
    
    public Node(int value) {
        this.data = value;
        next = null;
    }
}

class LinkedList {
    public Node Elementstart(Node head, int data) {
        
        Node new_node = new Node(data);
        Node temp=head;
        head=new_node;
        head.next=temp;
        return head;
    }
    
    public void addElement(Node head, int data) {
        
        Node new_node = new Node(data);
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new_node;
        //new_node.prev=cur;
    }
    
    public void deleteElement(Node head) {
        // code to delete an element
    }
    
    public void printList(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + "->");
            cur = cur.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        Node head = new Node(10);
        LL.addElement(head, 20);
        LL.addElement(head, 30);
        LL.addElement(head, 40);
        LL.printList(head);
       // LL.addElement();
        
    }
}

2nd approach****
public class LinkedList {
    Node head;

    // Inner class representing a single node of the linked list
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}
------------------------------------------------------------------------------------------------------------------



****double linked list*****


public class DoublyLinkedList {
    Node head;

    // Inner class representing a single node of the linked list
    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.prev = currentNode;
        }
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}
DoublyLinkedList myList = new DoublyLinkedList();
myList.add(1);
myList.add(2);
myList.add(3);
myList.printList(); // Output: 1 2 3


---------------------------------------------------------------------------------------------------------------
BST(binary search tree)

in-order=left root right
pre-order=root left right
post order=left right root



----------------------------------------------------------------------------------------------------------
*****HASHING******
hash_function =num%10
h(k)=value
h(1)=1
h()

=============================================================================================================
