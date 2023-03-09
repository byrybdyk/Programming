package byrybdyk.me.data;

import java.util.Objects;

public class LocationTo {
    private float x;
    private Integer y; //Поле не может быть null
    private String name; //Строка не может быть пустой, Поле может быть null

    public LocationTo(){}

    public LocationTo(float x, Integer y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getName(){
        return name;
    }

    public  void setName(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationTo that = (LocationTo) o;
        return Float.compare(that.x, x) == 0 && y.equals(that.y) && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, name);
    }

    @Override
    public String toString() {
        return "Coordinates " + name + "{x= " + x + ", y= " + y + '}';
    }
}