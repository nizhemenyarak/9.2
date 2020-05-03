public class testShop {
    public static void main(String[] args) {
        Shop myShop = new Shop();

        Books myBook1 = new Books("Vlastelin", 320, 21 , 333 , "Kniga dlya 4teniya",7,false);

        myShop.addPech(myBook1);

        myShop.addPech(new Books("Zemlya", 100,26 , 444, "Knigomir", 4, false));

        Journal myJournal = new Journal("Jurfix",58,3,43,"Jurnal",105,true);

        myShop.addPech(myJournal);

        myShop.printShop();

        if (myShop.findPech(myBook1)) {
            System.out.println("Da");
        }
        else {
            System.out.println("Net");
        }

        System.out.println();
        System.out.println("Magazin posle udaleniya knigi");
        myShop.removePech(myBook1);
        myShop.printShop();
    }
}