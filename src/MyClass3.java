/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kjx33
 */
class Round {
    double Radius;
    Round(double r) {
        Radius=r;
    }
    double CountArea() {
        return 3.14*Radius*Radius;
    }
    void ChangeRadius(double NewRadius) {
        Radius=NewRadius;
    }
    double GetRadius() {
        return Radius;
    }
}
class Cone {
    Round BaseCircle;
    double height;
    Cone(Round circle, double h) {
        this.BaseCircle=circle;
	this.height=h;
}
    double CountVolume() {
        double volume;
        volume=BaseCircle.CountArea()*height/3.0;
        return volume;
    }
    void ChangeBaseCircleRadius(double r) {
        BaseCircle.ChangeRadius(r);
    }
    double GetBaseCircleRadius() {
        return BaseCircle.GetRadius();
    }
}
public class MyClass3 {
    public static void main(String[] args) {
        Round circle=new Round(10);
        Cone circular=new Cone(circle,20);
        
        System.out.println("圆锥底圆半径:"+circular.GetBaseCircleRadius());
        System.out.println("圆锥的体积:"+circular.CountVolume());
        circular.ChangeBaseCircleRadius(100);
        System.out.println("圆锥底圆半径:"+circular.GetBaseCircleRadius());
        System.out.println("圆锥的体积:"+circular.CountVolume());
    }
    
}




