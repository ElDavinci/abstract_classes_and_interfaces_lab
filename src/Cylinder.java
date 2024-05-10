public class Cylinder extends Circle
{
    protected double height; // height of Cylinder
    // no-argument constructor
    public Cylinder()
    {
    // implicit call to superclass constructor here
    setHeight( 0 );
    }
    // constructor
    public Cylinder( double cylinderHeight, double
    cylinderRadius,
    int xCoordinate, int yCoordinate )
    {
    // call superclass constructor
    super( cylinderRadius, xCoordinate, yCoordinate );
    setHeight( cylinderHeight );
    }
    // set height of Cylinder
    public void setHeight( double cylinderHeight )
    {
    height = ( cylinderHeight >= 0 ? cylinderHeight :0 );
    }
    // get height of Cylinder
    public double getHeight()
    {
    return height;
    }
    // calculate area of Cylinder (i.e., surface area)
    public double area()
    {
    return 2 * super.area() + 2 * Math.PI * radius * height;
    }
    // calculate volume of Cylinder
    public double volume()
    {
    return super.area() * height;
    }
    public String toString()
    {
    return String.format( "%s; Height = %f",super.toString(), height );
    }
    public String getName()
    {
    return "Cylinder";
    }
}