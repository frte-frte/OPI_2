public class Street {
    private String name;
    private double area;
    private int countOfHouse;
    
    public Street(String name, double area, int countOfHouse) {
        this.name = name;
        this.area = area;
        this.countOfHouse = countOfHouse;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getCountOfHouse() {
        return countOfHouse;
    }

    public void setCountOfHouse(int countOfHouse) {
        this.countOfHouse = countOfHouse;
    }
}
