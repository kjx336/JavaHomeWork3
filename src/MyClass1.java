/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kjx33
 */

class Trapezoidal {
    float TopLine, BaseLine, High, Acreage;
    Trapezoidal (float x, float y, float h) {
        TopLine=x;
        BaseLine=y;
        High=h;
    }
    float CountAcreage() {
        Acreage=(TopLine+BaseLine)*High/2.0f;
        return Acreage;
    }
    void ChangeHigh(float height) {
        High=height;
    }
    float GetHigh() {
        return High;
    }
}

public class MyClass1 {
    public static void main(String[] args) {
        Trapezoidal laderOne=new Trapezoidal(12.0f, 3.5f, 50), laderTwo=new Trapezoidal(2.67f, 3.0f, 10);
        System.out.println("laderOne的高是:"+laderOne.GetHigh());
        System.out.println("laderTwo的高是:"+laderTwo.GetHigh());
        System.out.println("laderOne的面积是:"+laderOne.CountAcreage());
        System.out.println("laderTwo的面积是:"+laderTwo.CountAcreage());
        laderOne.ChangeHigh(10);
        float h=laderOne.GetHigh();
        laderTwo.ChangeHigh(h*2);
        System.out.println("laderOne现在的高是:"+laderOne.GetHigh());
        System.out.println("laderTwo现在的高是:"+laderTwo.GetHigh());
        System.out.println("laderOne现在的面积是:"+laderOne.CountAcreage());
        System.out.println("laderTwo现在的面积是:"+laderTwo.CountAcreage());
    }
    
}



/*class Trapezoidal {
    float TopLine, BaseLine, High, Acreage;
    Trapezoidal (float x, float y, float h) {
        TopLine=x;
        BaseLine=y;
        High=h;
    }
    float CountAcreage() {
        Acreage=(TopLine+BaseLine)*High/2.0f;
        return Acreage;
    }
    void ChangeHigh(float height) {
        High=height;
    }
    float GetHigh() {
        return High;
    }
}
public class MyClass1 {
	public static void main(String args[]) {
            Trapezoidal laderOne=new Trapezoidal(12.0f, 3.5f, 50), laderTwo=new Trapezoidal(2.67f, 3.0f, 10);
            System.out.println("laderOne的高是:"+laderOne.GetHigh());
            System.out.println("laderTwo的高是:"+laderTwo.GetHigh());
            System.out.println("laderOne的面积是:"+laderOne.CountAcreage());
            System.out.println("laderTwo的面积是:"+laderTwo.CountAcreage());
            laderOne.ChangeHigh(10);
            float h=laderOne.GetHigh();
            laderTwo.ChangeHigh(h*2);
            System.out.println("laderOne现在的高是:"+laderOne.GetHigh());
            System.out.println("laderTwo现在的高是:"+laderTwo.GetHigh());
            System.out.println("laderOne现在的面积是:"+laderOne.CountAcreage());
            System.out.println("laderTwo现在的面积是:"+laderTwo.CountAcreage());
        } 
} */

