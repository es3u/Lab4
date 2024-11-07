public class Triangle extends Shape{
    private double hieght , base ;



    public Triangle() {
    }

    public Triangle(double hieght, double base) {
        this.hieght = hieght;
        this.base = base;
    }



    public double getHieght() {
        return hieght;
    }

    public void setHieght(double hieght) {
        try{
            if(hieght< 0){
                throw new Exception("Eenter cocrrecct number!!");
            }else{
            this.hieght = hieght;}
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        try {
            if(base < 0){
                throw new Exception("Enter coerrct number");
            }else{
            this.base = base;}
        }catch (Exception e){
            System.out.println(e);
        }
    }




    public void position(){
        System.out.println("*Tringle*");
    }

    @Override
    public double culculateArea() {
        return ((hieght * base)/2 );
    }

    @Override
    public double calculateCircumference() {
       double a = getHieght() * getHieght();
       double b = getBase() * getBase();

//////////// افترضنا ان المثلث قايم الزاوية


        return Math.sqrt(a + b) + getBase() + getHieght() ;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "hieght=" + hieght +
                ", base=" + base +
                "} " ;
    }
}
