import java.util.ArrayList;

public class Shop {

    private ArrayList<pechizda> masPech = new ArrayList<pechizda>();

    public void addPech(pechizda m){
        masPech.add(m);
    }

    public void removePech(pechizda m){
        masPech.remove(m);
    }

    public Shop(){
    }

    public Boolean findPech(pechizda m){
        return masPech.contains(m);
    }

    public Shop(ArrayList<pechizda> n){
        masPech=n;
    }

    public void printShop() {
        System.out.println("V magazine: ");
        for (pechizda a:masPech){
            System.out.println("\t"+a.toString());
            if (a instanceof Books) {
                System.out.println("Eto kniga");
                System.out.println();
            }
            if (a instanceof Journal) {
                System.out.println("Eto jurnal");
                System.out.println();
            }
        }
    }
}