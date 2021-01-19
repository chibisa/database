package lesson42.modul;

public class Statistic {

    String maker;
    int sold;
    float totalMoney;
    public Statistic() {
    }
    public Statistic(String maker, int sold, float totalMoney){
        this.maker = maker;
        this.sold = sold;
        this.totalMoney = totalMoney;
    }
    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public float getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(float totalMoney) {
        this.totalMoney = totalMoney;
    }
}
