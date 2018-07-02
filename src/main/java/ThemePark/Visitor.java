package ThemePark;

public class Visitor {
    
    private int age;
    private int height;
    private double money;
    
    public Visitor(int age, int height, double money){
        this.age = age;
        this.height = height;
        this.money = money; 
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
