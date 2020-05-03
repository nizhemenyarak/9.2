public class pechizda {

    private String firma;
    private int str;
    private int vipusk;
    private int sseriya;

    public void setFirma(String name){
        firma = name;
    }

    public void setStr(int s){
        str = s;
    }

    public void setJanr(int v){
        str = v;
    }

    public void setAvtor(int ss){
        str = ss;
    }

    public String getFirma(){
        return firma;
    }

    public int getStr(){
        return str;
    }

    public int getVipusk(){
        return vipusk;
    }

    public int getSseriya(){
        return sseriya;
    }
    public pechizda(){
        firma = "unknown";
        str = 0;
        vipusk = 0;
        sseriya = 0;

    }

    public pechizda(String name, int s, int v, int ss ){
        firma = name;
        str = s;
        vipusk = v;
        sseriya = ss;
    }
}
