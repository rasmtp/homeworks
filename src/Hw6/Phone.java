package Hw6;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public static void main(String[] args) {
        Phone samsumg = new Phone();
        samsumg.setNumber("+421915536658");
        samsumg.setModel("S22");
        Phone iphone = new Phone();
        iphone.setNumber("+380997777777");
        iphone.model = "15 Pro Max";
        iphone.weight = 192.5;
        Phone sony = new Phone();
        System.out.println(iphone.number + " - Номер телефона Iphone; " + iphone.model + " - Модель телефона Iphone; " + iphone.weight + " - Вес телефона Iphone.");
        System.out.println(samsumg.number + " - Номер телефона Samsung; " + samsumg.model + " - Модель телефона Samsung.");
    }


    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall() {
        System.out.println("Звонит{name}");
    }

    public String getNumber() {
        return getNumber();
    }


}