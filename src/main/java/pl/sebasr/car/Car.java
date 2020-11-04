package pl.sebasr.car;

public class Car {


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    private String mark;

    public Car(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    private String model;


}
