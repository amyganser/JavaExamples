import java.util.Scanner;

public class ShapeDemo
{
   
    public static Shape getShape()
    {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\nEnter the shape's color (or 'done')...");
            String color = sc.nextLine();
            if (color.equalsIgnoreCase("done")) {
                return null;
            }
            if (!color.equalsIgnoreCase("red") &&
                !color.equalsIgnoreCase("blue") &&
                !color.equalsIgnoreCase("green")) {
                System.out.println("  Error - color must be 'red', 'blue', or 'green'");
                continue;
            }

            System.out.println("Enter shape type...");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("circle")) {
                System.out.println("Enter the radius...");
                double radius = sc.nextDouble();
                if (radius < 0.0) {
                    System.out.println("Radius must be non-negative");
                    continue;
                }
                return new Circle(color, radius);
            } else if (name.equalsIgnoreCase("rectangle")) {
                System.out.println("Enter the length and width...");
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                if (length < 0.0 || width < 0.0) {
                    System.out.println("length and width must be non-negative");
                    continue;
                }
                return new Rectangle(color, length, width);
            } else if (name.equalsIgnoreCase("square")) {
                System.out.println("Enter the length of a side...");
                double length = sc.nextDouble();
                if (length < 0.0) {
                    System.out.println("length must be non-negative");
                    continue;
                }
                return new Square(color, length);
            } else {
                System.out.println("shape name must be 'circle', 'rectangle', or 'square'");
                continue;
            }
        } while (true);

    }

	public static void sortArray(Shape[] sList, int numShapes) {
		for (int i=0; i<numShapes; i++) {
			for (int j=i+1; j<numShapes; j++) {
				double d1 = sList[i].area();
				double d2 = sList[j].area();
				if (d1>d2) {
					Shape s = sList[i];
					sList[i] = sList[j];
					sList[j] = s;
				}
			}
		}
	}
	
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Shape[] slist = new Shape[50];

        System.out.println("Enter a list of shapes - 'done' to end");
        Shape sp;
        int numShapes = 0;
        while (null != (sp = getShape())) {
            slist[numShapes++] = sp;
        }

        System.out.println("\nThe list of shapes entered...");
        for (int n = 0; n < numShapes; ++n) {
            System.out.println("  " + slist[n].toString());
        }

        System.out.println("\nSorting shapes into order by area...");

        sortArray(slist, numShapes);

        System.out.println("\nThe sorted list of shapes...");
        for (int n = 0; n < numShapes; ++n) {
            System.out.println("  " + slist[n].toString());
        }

        System.out.println();
        System.out.println("Done - press enter key to end program");
        String junk = sc.nextLine();
    }

}