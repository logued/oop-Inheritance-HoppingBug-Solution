package org.example;

/**
 * Demonstrates INHERITANCE.
 * The HoppingBug class extends the Bug class, so,
 * HoppingBug inherits all fields and methods from the Bug class.
 * <p>
 * One new field "hoppingDistance" is added to the HoppingBug, to store the hop distance.
 * <p>
 * The move method() in HoppingBug must be different from the one defined in Bug
 * because the HoppingBug will move a 'hop' distance each time move() is called.
 * Therefore, we must override the move() method in the HoppingBug class to
 * change its behavior.
 * <p>
 * We must write a HoppingBug constructor that initializes the hop distance field,
 * and which initializes the fields defined in the Bug (base class/ superclass),
 * using a call to "super( ... )"
 *
 * Open/Closed Principle is demonstrated here.
 *
 * The Open/Closed Principle states that classes should be open for extension,
 * but closed for modification. (This the "O" in SOLID Principles)
 * The Bug class is Closed to modification (we don't change it) but
 * is Open to extension - here we extend Bug (in HoppingBug)
 * and override and extend its behaviour.
 */

public class HoppingBug extends Bug {

    private final int hoppingDistance;

    public HoppingBug( int initialPosition, int hoppingDistance) {
        super(initialPosition); // calls the constructor defined in superclass (Bug)

        this.hoppingDistance = hoppingDistance;
    }

    /**
     * Moves the HoppingBug by its 'hoppingDistance' in the direction it is facing.
     * This move() method overrides the move() method that is inherited from
     * the Bug class.  This must be done as this HoppingBug moves in a different
     * way (it hops over a number of positions, not just one at a time)
     * The behavior is different.
     * We call the superclass  move() method tby the hoppingDistance number of times
     */
    @Override
    public void move() {
        for (int i=0; i< hoppingDistance; i++)  // make required number of moves to equal hoppingDistance
            super.move();   // call the superclass move method to do our work
    }

    public int getHoppingDistance() {
        return hoppingDistance;
    }

    @Override                   // overrides the toString() method from the Bug class
    public String toString() {
        // call the superclass toString()
        return super.toString() + "{hoppingDistance=" + hoppingDistance + '}';
    }
}
