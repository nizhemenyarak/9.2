public class Books extends pechizda {
    private String nameBook;
    private int numPage;
    private Boolean signature;

    public Books() {
        super();
        nameBook = "noname";
        numPage = 50;
        signature = false;
    }

    public Books(String name, int s, int v, int ss, String nameB, int n, Boolean f) {
        super(name, s, v, ss);
        this.nameBook =  nameB;
        this.numPage = n;
        this.signature = f;
    }

    public void setNameBook(String name) {
        this.nameBook = name;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNumPage(int n) {
        numPage = n;
    }

    public int getNumPage() {
        return numPage;
    }

    public void setSignature(Boolean b) {
        this.signature = b;
    }

    public Boolean isPodpis() {
        return signature;
    }

    public String toString() {
        return getFirma() + " " + getStr() + " " + getVipusk() + " " + nameBook + " " + numPage + " " + signature;
    }
}
