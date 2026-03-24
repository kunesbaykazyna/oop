package lab2.task5.model;

public class PhDStudent extends Person {
    private String researchTopic;

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age);
        this.researchTopic = researchTopic;
    }

    @Override
    public boolean assignPet(Animal pet) {
        if (pet instanceof Dog) {
            System.out.println("PhD student is too busy for a dog...");
            return false; 
        }
        return super.assignPet(pet);
    }

    @Override
    public String getOccupation() { 
    	return "PhD Researcher in " + researchTopic; 
    }
}
