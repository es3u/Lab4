public class Circle extends Shape{

      private double radius ;


    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        try{
        if(radius < 0) {
            throw new Exception("Enter coerrct number!!");
        }else{
        this.radius = radius;}
       }
        catch (Exception e){
            System.out.println(e);

        }
    }

    public void position(){
        System.out.println("*CIRCLE*");
    }

    @Override
    public double culculateArea() {

        return (Math.PI * getRadius() *getRadius());
    }

    @Override
    public double calculateCircumference() {
        return (2 * Math.PI * getRadius());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
