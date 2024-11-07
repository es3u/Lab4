public class Main {
    public static void main(String[] args) {

        Circle c =new Circle();

        c.position();
        c.setRadius(-2);
        c.setRadius(4);
        System.out.println(c.getRadius());

        System.out.println("Area : " + Math.round(c.culculateArea() *100/ 100) );
        System.out.println("Circumference :" + Math.round(c.calculateCircumference()*100 / 100));

        System.out.println("**********************************");
        ////////////////////////
        System.out.println();
        Rectangle r  = new Rectangle();

        r.podition();
        r.setWitdh(-2);
        r.setWitdh(7);
        r.setHeight(2);

        System.out.println("the height : " + r.getHeight() );


        System.out.println("Area : " + r.culculateArea());
        System.out.println("Circumference :" + r.calculateCircumference() );
        System.out.println(r.toString());

        System.out.println("**********************************");


        Triangle t =new Triangle();

        t.position();



        t.setHieght(7);
        t.setBase(9);

        System.out.println("the height : " + t.getHieght());


        System.out.println("Area : " + t.culculateArea() );
        System.out.println("Circumference :" + t.calculateCircumference());
        System.out.println(t.toString());

        System.out.println("**********************************");















    }
}