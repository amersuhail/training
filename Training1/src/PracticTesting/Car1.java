package PracticTesting;

public class Car1 {
    public void breaks() {

    }
}

class Maruti extends Car1{
    public void speed() {
        breaks();
    }
}

class Swift extends Maruti{
    public void mileage() {
        breaks();
        speed();
    }
}

class Brezza extends Maruti{
    public void design() {
        speed();
    }
}