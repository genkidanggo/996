package Main.Day0812;

public class WuMingFen07 {
    String theMa;
    int quantity;
    boolean likeSoup;

    public WuMingFen07(String theMa, int quantity, boolean likeSoup) {
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSoup = likeSoup;
    }
    public WuMingFen07(String theMa, int quantity) {
        this.theMa = theMa;
        this.quantity = quantity;
    }

    public void check(){
        System.out.println(theMa + quantity + likeSoup);
    }

}
