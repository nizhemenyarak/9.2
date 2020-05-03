import java.util.Scanner;

public class Journal extends pechizda {

        private String nameJour;
        private int numImage;
        private Boolean code;

    public Journal() {
            super();
            nameJour = "";
            numImage = 23;
            code = false;
        }

    public Journal(String name, int s, int v, int ss, String nameJ,int n, Boolean f){
            super(name, s, v, ss);
            nameJour = name;
            numImage = n;
            code = f;
        }

        public void setNameJour (String name){
            nameJour = name;
        }
        public String getNameJour () {
            return nameJour;
        }

        public void setNumImage ( int n){
            numImage = n;
        }
        public int getNumImage () {
            return numImage;
        }

        public void setCode (Boolean b){
            code = b;
        }
        public Boolean isCode () {
            return code;
        }

        public void setAllInfo () {

            Scanner in = new Scanner(System.in);

            System.out.print("Vvedite formy jurnala: ");
            String nazv = in.next();
            setFirma(nazv);

            System.out.print("Vvedite stranicу jurnala: ");
            int s = in.nextInt();
            setStr(s);

            System.out.print("Vvedite janr jurnala: ");
            int j = in.nextInt();
            setJanr(j);

            System.out.print("Vvedite autora jurnala: ");
            int a = in.nextInt();
            setAvtor(a);

            System.out.print("Vvedite naimenovanie jurnala:");
            nameJour = in.next();

            System.out.print("Vvedite koli4estvo kartinok v jurnale: ");
            numImage = in.nextInt();

            System.out.print("Vvedite s codom ili net (true/false): ");
            code = in.nextBoolean();

            System.out.println();
        }

        public String toString () {
            return "\n\tJournal" + "\n\t" + "Firma: " + getFirma() + "\n\t" + "Stranici: "
                    + getStr() + "\n\t" + "Vipusk: " + getVipusk() + "\n\t" + "Seriya: " + getSseriya() + "\n\t" + "Naimenovanie: " + nameJour + "\n\t" + "Koli4estvo kartinok: " + numImage + "\n\t" + "s codom: "
                    + code + "\n";
        }
    }
