import java.awt.geom.Point2D;
import java.util.*;

public class WhittleGame {

    static class Point implements Comparable<Point> {
        double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(Point p) {
            if (this.y != p.y) return Double.compare(this.y, p.y);
            return Double.compare(this.x, p.x);
        }
    }

    // Function to calculate area of polygon
    static double polygonArea(List<Point> points) {
        double area = 0.0;
        int n = points.size();
        for (int i = 0; i < n; i++) {
            area += points.get(i).x * points.get((i + 1) % n).y - points.get((i + 1) % n).x * points.get(i).y;
        }
        return Math.abs(area / 2.0);
    }

    // Function to find the convex hull
    static List<Point> convexHull(Point[] points) {
        Arrays.sort(points);
        Stack<Point> hull = new Stack<>();
        // Lower hull
        for (Point p : points) {
            while (hull.size() >= 2 && cross(hull.get(hull.size() - 2), hull.get(hull.size() - 1), p) <= 0) {
                hull.pop();
            }
            hull.push(p);
        }
        hull.pop();
        // Upper hull
        for (int i = points.length - 1; i >= 0; i--) {
            Point p = points[i];
            while (hull.size() >= 2 && cross(hull.get(hull.size() - 2), hull.get(hull.size() - 1), p) <= 0) {
                hull.pop();
            }
            hull.push(p);
        }
        return new ArrayList<>(hull);
    }

    static double cross(Point O, Point A, Point B) {
        return (A.x - O.x) * (B.y - O.y) - (A.y - O.y) * (B.x - O.x);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            points[i] = new Point(x, y);
        }
        int m = scanner.nextInt();

        // Implement the game logic here based on the convex hull and area reduction

        // Example: Print convex hull points
        List<Point> hull = convexHull(points);
        for (Point p : hull) {
            System.out.println(p.x + " " + p.y);
        }

        // Add logic for selecting nails to remove based on the rules

        scanner.close();
    }
}
