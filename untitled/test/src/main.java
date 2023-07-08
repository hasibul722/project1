public class main {
    public static void main(String[] args) {
        icecream ice1 = new icecream();
        icecream ice2 = new icecream();
        ice1.setIcecreamCom("Xyz");
        ice1.setIcecreamPrice(120);
        ice1.setIcecreamType("Vanilla");
        ice2.setIcecreamCom("Xyz");
        ice2.setIcecreamPrice(120);
        ice2.setIcecreamType("Vanilla");
        if(ice1.equals(ice2)){
            System.out.println("Equals");
        }
        else
            System.out.println("NOT equal");
         int result = ice1.compare(ice2);

         System.out.println(result+"\n");
        System.out.println(ice1);
        System.out.println(ice2.toString());
    }
}

