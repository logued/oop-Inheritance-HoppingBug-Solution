/* P8.12   Bug 
 */
package org.example;

/**
 * - uses enum Direction as datatype of direction instance variable.
 * - uses static Counter to give each new Bug a unique sequential ID
 */
public class Bug
{
    private final String id;              // unique id code e.g. "B1"
    private int position;           // range:  negative int...0...positive int
    private Direction direction;    // an Enum (Enumeration) type variable

    private static int counter = 0;     //class variable to maintain count

    public Bug(int initialPosition)
    {
        Bug.counter++;  // Increment static variable
        this.id =  "Bug" + counter; // use static count to generate ID for this Bug
        this.position = initialPosition;
        this.direction = Direction.RIGHT; // default initial direction
    }

    public int getPosition()
    {
        return this.position;
    }

    public String getId() { return this.id; }

    // We deliberately do NOT provide a setId() because id is set using the static variable

    public void turn() {
        if (this.direction == Direction.RIGHT)
            this.direction = Direction.LEFT;
        else
            this.direction = Direction.RIGHT;
    }

    /**
     * Move Bug object position one place along line in the direction it is facing.
     * If RIGHT then add 1, if LEFT then subtract 1
     */
    public void move() {
        if (this.direction == Direction.RIGHT)
            this.position += 1;
        else
            this.position -= 1;
    }

    // Returns an enum value - as defined in the Direction enum
    public Direction getDirection()
    {
        return this.direction;
    }

    @Override
    public String toString()
    {
        return "Bug{" +
                "id=" + id +
                ", position=" + position +
                ", direction=" + direction +
                '}';
    }
}

