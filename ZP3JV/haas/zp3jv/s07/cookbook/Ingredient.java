package haas.zp3jv.s07.cookbook;

/**
 * Created by AntoninHaas.
 */
public class Ingredient {
    private String name;
    private Unit unit;
    private double price;

    public Ingredient(String name, Unit unit, double price) {
        this.name = name;
        this.unit = unit;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ingredient that = (Ingredient) o;

        if (Double.compare(that.price, price) != 0) return false;
        if (!name.equals(that.name)) return false;
        return unit.equals(that.unit);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + unit.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
