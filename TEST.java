public class TEST {
    public static void main(String[] args) {

        Student firstStudent = new Student("Jan", "Testowy");
        System.out.println(firstStudent.getName());
        System.out.println(firstStudent.getSurname());
        System.out.println(firstStudent.getFullName());
    }
}

class Student {
    private String name;
    private String surname;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

class Car {
    private String brand;
    private String colour;

    public Car (String Brand, String colour) {
        this.brand = Brand;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
