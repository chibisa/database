package lesson5_2.modul;

public class NumberOfLaptop {
    String name;
    int  quantityincreased;
    int sold_first;
    int sold_now;
    String last_updated_timestamp;

    public NumberOfLaptop() {
    }

    public NumberOfLaptop(String name, int quantityincreased, int sold_first, int sold_now, String last_updated_timestamp) {
        this.name = name;
        this.quantityincreased = quantityincreased;
        this.sold_first = sold_first;
        this.sold_now = sold_now;
        this.last_updated_timestamp = last_updated_timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityincreased() {
        return quantityincreased;
    }

    public void setQuantityincreased(int quantityincreased) {
        this.quantityincreased = quantityincreased;
    }

    public int getSold_first() {
        return sold_first;
    }

    public void setSold_first(int sold_first) {
        this.sold_first = sold_first;
    }

    public int getSold_now() {
        return sold_now;
    }

    public void setSold_now(int sold_now) {
        this.sold_now = sold_now;
    }

    public String getLast_updated_timestamp() {
        return last_updated_timestamp;
    }

    public void setLast_updated_timestamp(String last_updated_timestamp) {
        this.last_updated_timestamp = last_updated_timestamp;
    }

    @Override
    public String toString() {
        return "NumberOfLaptop{" +
                "name='" + name + '\'' +
                ", quantityincreased=" + quantityincreased +
                ", sold_first=" + sold_first +
                ", sold_now=" + sold_now +
                ", last_updated_timestamp='" + last_updated_timestamp + '\'' +
                '}';
    }

}
