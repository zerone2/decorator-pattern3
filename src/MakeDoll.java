import Doll.*;
import DollDecorator.*;

public class MakeDoll {
    public static void main(String[] args) {
        Doll d1 = new BasicDoll();
        System.out.println("기본 인형 가격 : " + d1.getPrice());

        Doll d2 = new RibbonDecorator(d1);
        System.out.println("기본 인형 가격 + 리본 : " + d2.getPrice());

        Doll d3 = new ClothDecorator(d2);
        System.out.println("기본 인형 가격 + 리본  + 옷 : " + d3.getPrice());
    }
}
