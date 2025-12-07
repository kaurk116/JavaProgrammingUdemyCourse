package JavaPogramming.day12;

public class Box {
    double higth,width,depth;
    Box() {
        higth = width = depth = 0;
    }

    Box(double h, double w,double d){
        higth=h;
        width=w;
        depth=d;

    }
    Box(double length){
        higth = width = depth = length;
    }
    Double volume() {
        return (higth * width * depth);
    }
}
