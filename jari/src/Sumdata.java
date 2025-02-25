import java.util.ArrayList;
public class Sumdata {
    public static void main(String[] args) {
        Valami sth = new Valami();
        for (Valami some: sth){
            if(some.uzemanyag == "benzin"){
                System.out.println(some.rendszam+" "+ some.gyarto+" "+
                 some.uzemanyag+" "+ some.ar+" "+ some.van_klima+
                 " "+ some.forgalmi);
            }
        }
    }
}
