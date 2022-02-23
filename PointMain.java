package org.zerock;

public class PointMain {
    public static void main(String[] args) {
        Point pEast= new Point(37.5665298,127.0070349,"동대문ddp");
        Point pWest= new Point(37.5657882,126.9363833,"연세대학교");
        Point pNorth= new Point(37.5790015,126.9842252,"북촌 한옥마을");
        Point pSouth= new Point(37.5790385,126.9689043,"남대문");

        Point target = new Point(37.56650780456897, 126.97794509966826,"");

        Point []arr = new Point[4];
        arr[0]=pEast;
        arr[1]=pWest;
        arr[2]=pNorth;
        arr[3]=pSouth;

        double minDistanace = 10000000;
        Point minPoint = null;

        for (Point p:arr
             ) {
            double distance =
                    Math.sqrt(Math.pow(p.lat- target.lat,2))+
                            (Math.pow(p.lng- target.lng,2));
            System.out.println(p.name+":"+distance);
        if(minDistanace>distance){
            minDistanace =distance;
            minPoint=p;
             }

        }
        System.out.println("mindistance:"+minDistanace);
        System.out.println(minPoint.name);
    }
}
