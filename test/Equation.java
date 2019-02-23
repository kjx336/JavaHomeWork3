/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kjx33
 */
public class Equation {
    float a,b,c;
    double DT;
    Equation(float x,float y,float z){
        a=x;
        b=y;
        c=z;
    }
    void GetDT(){
        DT = Math.pow(b,2)-4*a*c;
    } 
    
    void Judge(){
        GetDT();
        if(DT>0.0){
            System.out.println("方程有两个不相等的实数根。");
        }else if(DT==0.0){
            System.out.println("方程有两个相等的实数根。");
        }else{
            System.out.println("方程无实数根，但有2个共轭复根。");
        }
    }
    void Count(){
        GetDT();
        if(DT>0.0){
            System.out.println("方程的第一个根为"+(Math.sqrt(DT)-b)/2*a);
            System.out.println("方程的第二个根为"+(-Math.sqrt(DT)-b)/2*a);
        }else if(DT==0.0){
            System.out.println("方程实根为"+(Math.sqrt(DT)-b)/2*a);
        }else{
            System.out.println("方程无实数根，但有2个共轭复根。");
        }
    }
    void Print(){
        System.out.println("方程输出为："+a+"x^2"+b+"x"+c);
    }
}
