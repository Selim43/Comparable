package example.comparable;

public class Fruit implements Comparable<Fruit>{

    private String fruitName;
    private String fruitDesc;
    private int fruitNQty;

    public Fruit(String name) {
        this.fruitName = name;
    }

    public Fruit(String fruitName, int fruitNQty) {
        this.fruitName = fruitName;
        this.fruitNQty = fruitNQty;
    }

    @Override
    public int compareTo(Fruit that) {

        if (this.fruitName.compareTo(that.fruitName) < 0){
            return -1;
        }else if (this.fruitName.compareTo(that.fruitName) > 0){
            return 1;
        }else{
            if (this.fruitNQty < that.fruitNQty){
                return -1;
            }else if (this.fruitNQty > that.fruitNQty){
                return 1;
            }
        }
        return 0;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitDesc() {
        return fruitDesc;
    }

    public void setFruitDesc(String fruitDesc) {
        this.fruitDesc = fruitDesc;
    }

    public int getFruitNQty() {
        return fruitNQty;
    }

    public void setFruitNQty(int fruitNQty) {
        this.fruitNQty = fruitNQty;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruit{");
        sb.append("fruitName='").append(fruitName).append('\'');
        sb.append(", fruitDesc='").append(fruitDesc).append('\'');
        sb.append(", fruitNQty=").append(fruitNQty);
        sb.append('}');
        return sb.toString();
    }
}
