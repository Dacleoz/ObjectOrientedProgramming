public class Person {

    /**
     * SA: it represent the person who has to get vaccinated
     * SC: it is represented by a string for the id, a String for the name and by the age represented by an int
     * - id not null
     * - age not null
     */

    private String id;
    private String name;
    private int age;

    public Person(String id, String name, int age) {
        this.id = id;
        this.name= name;
        this.age = age;
    }


    /**
     * @return age range of the person
     */
    public AgeRange getAgeRange() {
        if (this.age < 6) {
            return AgeRange.MINOR_6;
        }
        if (this.age > 6 && this.age < 12) {
            return AgeRange.BETWEEN_6_AND_12;
        }
        if (this.age > 12 && this.age < 18) {
            return AgeRange.BETWEEN_12_AND_18;
        } else {
            return AgeRange.GREATER_THAN_18;
        }
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}
