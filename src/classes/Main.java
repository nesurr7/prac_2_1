package classes;

public class Main {

    public static void main(String[] args) {
        Shape obj1 = new Shape("Треугольник", "Зеленый", 14);
        Shape obj2 = new Shape();
        System.out.println(obj1.toString());
        System.out.println("Цвет:" + obj1.getColorOfObj());
        obj1.setNameOfObj("Квадрат");
        System.out.println("Фигура:" + obj1.getNameOfObj());
    }
}


