package niit.assignment;

public class VoterImpl {
    public static void main(String[] args) {
        // Creating an object of the Voter class
        Voter voter = new Voter();

        // Setting values using setter methods
        voter.setName("John");
        voter.setAge(10);

        // Calling getAgeCriteria method and displaying the result
        System.out.println(voter.getAgeCriteria()); // Output: John Is Not Eligible to Vote
    }
}
