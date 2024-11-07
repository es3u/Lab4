public class Rectangle extends Shape{
    private double height , witdh;

    public Rectangle() {

    }

    public Rectangle(double height, double witdh) {
        this.height = height;
        this.witdh = witdh;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
       try {
           if (height < 0){
                throw new Exception("\"Enter correct number!!\"");}
           else{
           this.height = height;}

       }catch (Exception e)
       {
           System.out.println(e);
       }
    }

    public double getWitdh() {
        return witdh;
    }

    public void setWitdh(double witdh) {
        try {
            if(witdh <0) {
                throw new Exception("Enter coerrct number!!");
            }else {
                this.witdh = witdh;
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }


    public void podition(){

        System.out.println("*RECTANGLE*");
    }
    @Override
    public double culculateArea() {
        return (getHeight() * getWitdh() );
    }

    @Override
    public double calculateCircumference() {
        return ((getWitdh() + getHeight()) * 2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", base=" + witdh +
                "} " ;
    }
}

