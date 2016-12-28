/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overload;

/**
 *
 * @author Kirizu
 */
public class OverloadMain {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int i=88;
        double result;
        // call all versions of test()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        ob.test(i);
//        result = ob.test(123.2);
//        System.out.println("Result of ob.test(123.2): " + result);
        ob.test(123.2); // this will invoke test(double)
        System.out.println(ob.test("10","2"));
    }
}
