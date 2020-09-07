package classes;

public class Shape {
    private int count;
    private String color;
    private String nameOfObj;

    Shape(String nameOfObj, String color, int count) {
        this.nameOfObj = nameOfObj;
        this.color = color;
        this.count = count;
    }

    Shape() {
    }

    public String toString() {
        return "Фигура:" + nameOfObj + ",Цвет:" + color + ",Номер фигуры:" + count;
    }

    public String getNameOfObj() {
        return nameOfObj;
    }

    public String getColorOfObj() {
        return color;
    }

    public int getCount() {
        return count;
    }

    public void setNameOfObj(String name) {
        this.nameOfObj = name;
    }

    public void setColorOfObj(String color) {
        this.nameOfObj = color;
    }

    public void setCountOfObj(int count) {
        this.count = count;
    }
}

