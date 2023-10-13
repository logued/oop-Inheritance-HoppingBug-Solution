/*                          //21Oct2019
 * P8.12 - Bug movement
 */
package org.example;

//  INCOMPLETE - this solution needs to be derived from the HoppingBug starter code for consistency
//  ******************
// ************

public class MainApp
{
    public static void main(String[] args)
    {
        Bug bug1 = new Bug( 0  );  // start at position 0
        System.out.println("bug1 starts at position :" + bug1.getPosition());
        bug1.move();
        System.out.println("After move(), bug1 is at position: " + bug1.getPosition());
        bug1.move();
        System.out.println("After another move(), bug1 is at position: " + bug1.getPosition());
        bug1.turn(); // change direction
        System.out.println("bug1 has turned.");
        bug1.move();
        System.out.println("After another move(), bug1 is at position: " + bug1.getPosition());


        // Using HoppingBug subclass objects
        System.out.println("HoppingBug behaviour---------------------------------");
        HoppingBug hopper1 = new HoppingBug( 0, 3); // start at 0, hop distance of 3
        System.out.println("hopper1 starts at position :" + hopper1.getPosition());
        hopper1.move();
        System.out.println("After move(), hopper1 is at position: " + hopper1.getPosition());
        hopper1.move();
        System.out.println("After another move(), hopper1 is at position: " + hopper1.getPosition());

        hopper1.turn(); // change direction // calls the superclass turn()
        System.out.println("hopper1 has turned.");
        hopper1.move();
        System.out.println("After another move(), hopper1 is at position: " + hopper1.getPosition());

        System.out.println("hopper1.toString() : " + hopper1.toString());

        System.out.println("printing object hopper1, will also call toString(): " + hopper1);
    }

}
