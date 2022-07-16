package oop;

public class Patient {
    private String firstName;
    private String lastName;
    private String iin;
    private int age;
    private int weight;
    private int height;
    private boolean isInfected;

    public Patient(String firstName, String lastName, String iin, int age, int weight, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iin = iin;
        this.age = age;
        this.weight = weight;
        this.height = height;

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIIN() {
        return iin;
    }

    public void setIIN(String IIN) {
        this.iin = IIN;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean getIsInfected() {
        return isInfected;
    }

    public void setIsInfected(boolean infected) {
        this.isInfected = infected;
    }


    @Override
    public String toString() {
        return "Пациент(" + iin + ", " + firstName + " " + lastName + ", " + age + ", " + trueOrFalse(isInfected) + ")";
    }

    public double getBMI() {
        double m = (double) height / 100;
        return (double) weight / (m * m);
    }

    public String trueOrFalse(boolean isInfected) {
        String result = null;
        if (!isInfected) {
            result = "здоров";
        } else {
            result = "инфицирован";
        }
        return result;
    }
}
