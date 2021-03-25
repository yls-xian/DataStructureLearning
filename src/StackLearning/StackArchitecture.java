package StackLearning;

import java.util.Scanner;

/**
 * @author yulinsheng
 * @time 2021-03-24 10:10
 */
public class StackArchitecture {
//栈结构测试
    public static void main(String[] args) {
//        首先初始化一个栈
        StackTest s1 = new StackTest(4);
//        定义需要进行的操作
        String key = "";
//        控制操作是否推出
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        while(loop){
            System.out.println("show:显示栈元素");
            System.out.println("exit:退出程序");
            System.out.println("push:添加数据到栈（入栈操作）");
            System.out.println("pop:从栈中取出元素(出栈操作)");
            System.out.println("输入你的选择");
            key  = scanner.next();
            switch(key){
                case "show":
                    s1.list();
                    break;
                case "exit":
                    scanner.close();
                    loop = false;
                    break;
                case "push":
                    System.out.println("请输入要添加的元素");
                    int value = scanner.nextInt();
                    s1.push(value);
                    break;
                case "pop":
                    try{
                        int res = s1.pop();
                        System.out.println("出栈的数据是"+res);
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());

                }
                    break;

            }

        }
        System.out.println("程序退出");
    }
}
//实现的基本操作，入栈出栈，判断栈是否满，判断栈是否为空
class StackTest{
//    首先初始化一个栈的最大值
    private  int maxSize;
//    定义栈顶值为-1
    private int top = -1;
//    利用数组定义栈元素
    int [] stack;
//    定义构造器，给栈初始化操作
    public StackTest(int maxSize){
        this.maxSize = maxSize;
//        定义栈的结构
        stack = new int [maxSize];
    }


//    判断栈是否满了,top从零开始定义
    public boolean isFull(){
        return top == maxSize - 1;
    }

//    判断栈是否为空,top的值为-1,则栈的原始为空
    public boolean isEmpty(){
        return top == -1;
    }



//    定义入栈和出栈操作
    public void push(int value){
//        先判断是否满栈
        if(isFull()){
            System.out.println("栈已经满了");
            return;
        }
        top++;
        stack[top] = value;
    }
    public int pop(){
//        判断栈是否为空
        if(isEmpty()){
            throw new RuntimeException("栈空，没有数据");
        }
        int temp = stack[top];
        top--;
        return temp;
    }


//    遍历显示栈的情况，从栈顶开始显示，先进后出
    public void list(){
        if(isEmpty()){
            System.out.println("栈空，没有数据");
        }
        for(int i = top;i >= 0;i--){
            System.out.printf("stack[%d] = %d\n",i,stack[i]);
        }
    }

}