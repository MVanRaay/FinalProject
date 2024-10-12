package mypack;

import java.util.*;

import com.sun.tools.javac.util.List;

public class CategoryCounter {
    static int counter = 0;

    public static void main(String[] args) {
        Car c1 = new Car(++counter, "car1", "red");
        Car c2 = new Car(++counter, "car2", "red");
        Car c3 = new Car(++counter, "car3", "red");
        Car c4 = new Car(++counter, "car4", "blue");
        Car c5 = new Car(++counter, "car5", "blue");
        Car c6 = new Car(++counter, "car6", "green");

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);
        cars.add(c6);

        getCountOfCarsByColour(cars);
        getCountOfCarsByColourOptimized(cars);
    }

    public static void getCountOfCarsByColour(ArrayList<Car> cars) {
        int redCount = 0;
        int blueCount = 0;
        int greenCount = 0;

        for (Car car:cars) {
            if (car.getColour().equals("red")) {
                ++redCount;
            } else if (car.getColour().equals("blue")) {
                ++blueCount;
            } else {
                ++greenCount;
            }
        }

        System.out.println("Number of Red cars: " + redCount + ".\n" +
                "Number of Blue cars: " + blueCount + ".\n" +
                "Number of Green cars: " + greenCount + ".");
    }

    public static void getCountOfCarsByColourOptimized(ArrayList<Car> cars) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (Car car :cars) {
            String colour = car.getColour();
            if (!map.containsKey(colour)) {
                map.put(colour, 1);
            } else {
                int count = map.get(colour);
                map.put(colour, ++count);
            }
        }

        System.out.println("Number of Red cars: " + map.get("red") + ".\n" +
                "Number of Blue cars: " + map.get("blue") + ".\n" +
                "Number of Green cars: " + map.get("green") + ".");
    }
}

class Car {
    private int id;
    private String colour;
    private String name;
    public Car(int id, String name, String colour) {
        super();
        this.id = id;
        this.colour = colour;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
