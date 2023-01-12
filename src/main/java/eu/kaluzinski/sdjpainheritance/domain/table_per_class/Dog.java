package eu.kaluzinski.sdjpainheritance.domain.table_per_class;

import jakarta.persistence.Entity;

@Entity
public class Dog extends Mammal {
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    private String breed;
}
