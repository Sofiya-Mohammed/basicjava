package niit.assignment;

public class Voter {
    private String name;
    private int age;
    static final int VOTER_ELIGIBLE_AGE = 18;

    public Voter() {}

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to get age criteria
    public String getAgeCriteria() {
        if (age >= VOTER_ELIGIBLE_AGE) {
            return name + " Is Eligible to Vote";
        } else if (age > 0) {
            return name + " Is Not Eligible to Vote";
        } else {
            return "Age Can't Be Negative or Zero";
        }
    }

}
