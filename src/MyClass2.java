/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kjx33
 */
class People {
    String face;
    void setFace(String s){
        face=s;
    }
}
class A {
    void f(int x, double y, People p) {
    x=x+1;
    y=y+1;
    p.setFace("笑脸");
    System.out.println("参数x和y的值分别是:"+x+","+y);
    System.out.println("参数对象p的face是:"+p.face);
    } 
}
public class MyClass2 {
    public static void main(String[] args) {
        int x=100;
        double y=100.88;
        People zhang=new People();
        zhang.setFace("很严肃的样子");
        A a=new A();
        a.f(x,y,zhang);
	System.out.println("main方法中x和y的值仍然分别是:"+x+","+y);
	System.out.println("main方法中对象zhang的face是:"+zhang.face);
    }
}

/*class People {
    String face;
    void setFace(String s){
        face=s;
    }
}
class A {
    void f(int x, double y, People p) {
    x=x+1;
    y=y+1;
    p.setFace("笑脸");
    System.out.println("参数x和y的值分别是:"+x+","+y);
    System.out.println("参数对象p的face是:"+p.face);
    } 
}
public class MyClass2 {
    public static void main(String args[]) {
        int x=100;
        double y=100.88;
        People zhang=new People();
        zhang.setFace("很严肃的样子");
        A a=new A();
        a.f(x,y,zhang);
	System.out.println("main方法中x和y的值仍然分别是:"+x+","+y);
	System.out.println("main方法中对象zhang的face是:"+zhang.face);
    }
}*/
