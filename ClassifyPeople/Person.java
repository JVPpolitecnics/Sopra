package ClassifyPeople;

public class Person {
    private int age;
    private boolean isFemale;

    // Constructor
    public Person(int age, boolean isFemale) {
        this.age = age;
        this.isFemale = isFemale;
    }

   //Getters and setters
    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public boolean isFemale() {
        return isFemale;
    }


    public void setFemale(boolean isFemale) {
        this.isFemale = isFemale;
    }

}
