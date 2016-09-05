
import java.util.ArrayList;
import java.util.List;

public class E_PrekybosCentras {
    List<D_Kasa> kasos;

    public E_PrekybosCentras(int kasųKiekis) {
        kasos = new ArrayList<>(kasųKiekis);
        for(int i=0; i<kasųKiekis; i++)
            kasos.add(new D_Kasa(i));
    }
    void vykdytiPirkimą(int kasosNr, double kaina){
        kasos.get(kasosNr).sumuoti(kaina);
    }
    void vykdytiPirkimą(int kasosNr, double kaina, int kiekis){
        kasos.get(kasosNr).sumuoti(kaina, kiekis);
    }
    void dienosPirkimai(String[] pirkimai){
        for(String p: pirkimai){
            
        }      
    }
    void demo1(){
        String[] pd = {
            "2 12.45",
            "1 22.39",
            "3 12.45 4",
            "7 19.45"
        };
        dienosPirkimai(pd);
    }
        
    public static void main(String[] args) {
        E_PrekybosCentras pcRimi = new E_PrekybosCentras(8);
        pcRimi.demo1();
    }
}
