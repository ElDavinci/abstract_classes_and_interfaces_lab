public class Circle extends Point
{
    protected double radius;
    // no-argument constructor
    public Circle()
    {
    // implicit call to superclass constructor here
    setRadius( 0 );
    }
    // constructor
    public Circle( double circleRadius, int xCoordinate, int
    yCoordinate)
    {
    super( xCoordinate, yCoordinate ); // call superclass constructor
    setRadius( circleRadius );
    }
    // set radius of Circle
    public void setRadius( double circleRadius )
    {
    radius = ( circleRadius >= 0 ? circleRadius : 0);
    }
    // get radius of Circle
    public double getRadius()
    {
    return radius;
    }
    // calculate area of Circle
    public double area()
    {
    return Math.PI * radius * radius;
    }
    // convert Circle to a String represention
    public String toString()
    {
    return String.format( "Center = %s; Radius = %f",
    super.toString(), radius );
    }
    public String getName(){
        return "Circle";
    }
}
