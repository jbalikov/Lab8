import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class runner
{
    public static void main(String[] args)
    {
        List<Point> pointList = readInPoints();
        List<Point> newPointList = pointList.stream().filter(p -> p.getZ() <= 2)
                                    .map(p -> new Point((p.getX()/2)-150, (p.getY()/2)-37, p.getZ()))
                                    .collect(Collectors.toList());
        writePoints(newPointList);
    }

    public static List<Point> readInPoints()
    {

        List<Point> points = new ArrayList<>();
        File text = new File("C:\\Users\\Balik\\OneDrive\\Jacob Docs\\Cal Poly\\Winter 2020\\CPE 203\\Lab8\\drawMe.txt");
        try {
            Scanner sc = new Scanner(text);
            sc.nextLine();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] lineVector = line.split(", ");
                points.add(new Point(Double.parseDouble(lineVector[0]),
                        Double.parseDouble(lineVector[1]),
                        Integer.parseInt(lineVector[2])));
            }
        } catch(Exception e){
            System.out.println("Can't open input file");
        }
        return points;
    }

    public static void writePoints(List<Point> points)
    {
        try
        {
            PrintStream ps = new PrintStream("writtenPoints.txt");

            for (Point p : points)
            {
                ps.print(p.getX()+", ");
                ps.print(p.getY()+", ");
                ps.println(p.getZ());
            }
        }
        catch (Exception e)
        {
            System.out.println("Can't open output file.");
        }
    }
}
