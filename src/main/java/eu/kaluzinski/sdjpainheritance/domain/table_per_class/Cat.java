package eu.kaluzinski.sdjpainheritance.domain.table_per_class;

import jakarta.persistence.Entity;

@Entity
public class Cat extends Mammal {

    private Boolean hasSpots;

    public Boolean getHasSpots() {
        return hasSpots;
    }

    public void setHasSpots(Boolean hasSpots) {
        this.hasSpots = hasSpots;
    }

}
