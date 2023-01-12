package eu.kaluzinski.sdjpainheritance.domain.single_table;

import jakarta.persistence.Entity;

@Entity
public class Bike extends Vehicle {
    private Double chainLength;

    public Double getChainLength() {
        return chainLength;
    }

    public void setChainLength(Double chainLength) {
        this.chainLength = chainLength;
    }
}
