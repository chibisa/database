package lesson3.modul;

public class LapTop {
    int id ;
    String name ;
    String url;
    String maker;
    String type;
    String ram ;
    String cpu;
    String ssd;
    String hdd ;
    float price ;
    String card ;
    String screen_resolution;
    float screen_size ;
    int sold;
    String create_timestamp;
    String last_update_timestamp;

    public LapTop() {
    }

    public LapTop(int id, String name, String url, String maker, String type, String ram, String cpu, String ssd, String hdd, float price, String card, String screen_resolution, float screen_size, int sold, String create_timestamp, String last_update_timestamp) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.maker = maker;
        this.type = type;
        this.ram = ram;
        this.cpu = cpu;
        this.ssd = ssd;
        this.hdd = hdd;
        this.price = price;
        this.card = card;
        this.screen_resolution = screen_resolution;
        this.screen_size = screen_size;
        this.sold = sold;
        this.create_timestamp = create_timestamp;
        this.last_update_timestamp = last_update_timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getScreen_resolution() {
        return screen_resolution;
    }

    public void setScreen_resolution(String screen_resolution) {
        this.screen_resolution = screen_resolution;
    }

    public float getScreen_size() {
        return screen_size;
    }

    public void setScreen_size(float screen_size) {
        this.screen_size = screen_size;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public String getCreate_timestamp() {
        return create_timestamp;
    }

    public void setCreate_timestamp(String create_timestamp) {
        this.create_timestamp = create_timestamp;
    }

    public String getLast_update_timestamp() {
        return last_update_timestamp;
    }

    public void setLast_update_timestamp(String last_update_timestamp) {
        this.last_update_timestamp = last_update_timestamp;
    }
}
