
// Returns the distance between the current Point object and the given other Point object.
// The distance between two points is equal to the square root of the sum of the squares
// of the differences of their x- and y-coordinates. In other words, the distance between
// two points (x1, y1) and (x2, y2) can be expressed as the square root of (x2 - x1)2 + (y2 - y1)2.
// Two points with the same (x, y) coordinates should return a distance of 0.0.


public class distancePoint {
    int x;
    int y;
    public double distance(distancePoint other){
        double distance;
        if (this.x == other.x && this.y == other.y){
            return 0.0;
        }
        else{
            distance = Math.sqrt(Math.pow((this.x - other.x), 2) + Math.pow((this.y - other.y), 2));
            return distance;
        }
    }
}
