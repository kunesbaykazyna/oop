package lab2.task5.model;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet; 

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean assignPet(Animal pet) {
        this.pet = pet; 
        return true;
    }

    public void removePet() {
        this.pet = null;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public abstract String getOccupation();

    public void leavePetWith(Person caretaker) {
        if (!this.hasPet()) return;
        if (caretaker.assignPet(this.pet)) {
            this.removePet();
        } else {
            System.out.println("Ошибкаааo");
        }
    }

    public void retrievePetFrom(Person caretaker) {
        if (caretaker.hasPet()) {
            this.assignPet(caretaker.getPet());
            System.out.println(this.name + " retrieved " + this.getPet().getName() + " from " + caretaker.getName());
            caretaker.removePet();
        }
    }

    @Override
    public String toString() {
        return name + " (" + getOccupation() + "), pet: " + (hasPet() ? pet : "none");
    }

	public int getAge() {
		return age;
	}
	
    public Animal getPet() {
    	return pet; 
    }
    
    public String getName() {
    	return name; 
    }

}
