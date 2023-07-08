public class icecream {
   private String icecreamType;
    private String icecreamCom;
    private double icecreamPrice;



    public void setIcecreamType(String icecreamType){
        this.icecreamType = icecreamType;
    }
    public void setIcecreamCom(String icecreamCom){
        this.icecreamCom = icecreamCom;
    }
    public void setIcecreamPrice(double icecreamPrice){
        this.icecreamPrice = icecreamPrice;
    }

    public String toString(){
        String result = "\nIce Cream type " + this.icecreamType + "\nIce cream Company "+ this.icecreamCom + "\nPrice is "+this.icecreamPrice;
    return result;
    }
    public String getIcecreamType(){
        return this.icecreamType;
    }
    public String getIcecreamCom(){
        return this.icecreamCom;
    }
    public double getIcecreamPrice(){
        return this.icecreamPrice;
    }
public boolean equals (icecream I){
        if(this.icecreamPrice == I.icecreamPrice)
            return true;
        else
            return false;
}
public int compare(icecream I){
        if (this.icecreamPrice > I.icecreamPrice)
            return 1;
        else if (this.icecreamPrice == I.icecreamPrice)
            return 0;
            return  -1;

}
}
