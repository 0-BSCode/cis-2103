/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;

/**
 *
 * @author User
 */
public class Geometry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyPoint newPoint = new MyPoint(-5, -10);
        
        System.out.println(newPoint.toString());
        System.out.println(String.format("%.2f", newPoint.getDistance()));
        System.out.println(String.format("%.2f", newPoint.getAngle()));
        System.out.println(String.format("%d", newPoint.getQuadrant()));

    }
}
