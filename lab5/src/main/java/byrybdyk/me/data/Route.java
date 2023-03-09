package byrybdyk.me.data;

import java.time.LocalDate;
import java.util.Objects;

public class Route {
    private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private LocationFrom from; //Поле не может быть null
    private LocationTo to; //Поле не может быть null
    private int distance; //Значение поля должно быть больше 1

    public Route(){}

    public Route(long id, String name, Coordinates coordinates, LocalDate creationDate, LocationFrom from, LocationTo to, int distance) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.from = from;
        this.to = to;
        this.distance = distance;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Coordinates getCoordinates(){
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates){
        this.coordinates = coordinates;
    }

    public LocalDate getCreationDate(){
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate){
        this.creationDate = creationDate;
    }

    public LocationFrom getFrom(){
        return from;
    }

    public void setFrom(LocationFrom from){
        this.from = from;
    }

    public LocationTo getTo(){
        return to;
    }

    public void setFrom(LocationTo to){
        this.to = to;
    }

    public int getDistance(){
        return distance;
    }

    public void setDistance(int distance){
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route that = (Route) o;
        return id == that.id && name.equals(that.name) && coordinates.equals(that.coordinates) &&
                creationDate.equals(that.creationDate) && from.equals(that.from) &&
                to.equals(that.to) && distance == that.distance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, coordinates, creationDate, from, to, distance);
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", name='" + name + '\'' + ", coordinates=" + coordinates + ", creationDate=" + creationDate +
                ", from=" + from + ", to=" + to + ", distance=" + distance + '}';
    }
}