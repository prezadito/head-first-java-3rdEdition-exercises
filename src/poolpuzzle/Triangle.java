package poolpuzzle;

/*
Desired output:
triangle 0, area = 4.0
triangle 1, area = 10.0
triangle 2, area = 18.0
triangle 3, area =
y =
 */

public class Triangle {
    double area;
    int height;
    int length;

    public static void main(String[] args) {
        int x = 0;
        Triangle[] ta = new Triangle[4];
        while(x < 4) {
            //
            ta[x].height = (x +1) * 2;
            ta[x].length = x + 4;
            //
            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);
            x = x + 1;
        }
        //
        x = 27;
        Triangle t5 = ta[2];
        System.out.println("y = " + y);
        System.out.println(", t5 area = " + t5.area);
    }
    void setArea() {
        //
    }
}
