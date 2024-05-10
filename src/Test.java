public class Test
{
// test Shape hierarchy
    public static void main( String args[] )
    {
        // create shapes
        Point point = new Point( 7, 11 );
        Circle circle = new Circle( 3.5, 22, 8 );
        Cylinder cylinder = new Cylinder( 10, 3.3, 10,
        10 );
        Shape arrayOfShapes[] = new Shape[3]; //create Shape array
        // aim arrayOfShapes[ 0 ] at subclass Point object
        arrayOfShapes[0] = ( Point ) point;
        // aim arrayOfShapes[ 1 ] at subclass Circle object
        arrayOfShapes[1] = ( Circle ) circle;
        // aim arrayOfShapes[ 2 ] at subclass Cylinder object
        arrayOfShapes[ 2 ] = ( Cylinder ) cylinder;

        for ( Shape shape : arrayOfShapes )
        {
            System.out.printf( "\n\n%s: %s\nArea =%.2f\nVolume = %.2f\n",
            shape.getName(), shape, shape.area(), shape.volume() );
        } // end for
    } // end main
}