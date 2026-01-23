/**

 * Project: Lab 1
 * Purpose Details:
 * Course: IST 242
 * Author: Shayla Morris
 * Date Developed:1/21/26
 * Last Date Changed:1/23/26
 * Revision:

 */
class Main{
    public static void main(String[] args){
        Motorcycle m1 = new Motorcycle("RED");
        System.out.println(m1.getColor());
        Motorcycle m2 = new Motorcycle("BLUE");
        System.out.println(m2.getColor());
        Engine red = new Engine(600,1000,"Yamaha");
        System.out.println("The CC of the bike is: " + red.getCC() + "\nThe Horsepower of the bike is: " + red.gethp() + "\nThe brand of the bike is: " + red.getbrand());

    }
}

/** main java file creating motorcycle m1 and m2 and the engine and printing it **/