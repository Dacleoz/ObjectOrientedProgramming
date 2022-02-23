import java.time.LocalDateTime;

public class Vaccination {

    /**
     *
     * It represents the dose of medicine, made in a certain, given by a certain person to prevent a certain pathology
     * The date of the vaccination is changeable due to the commitments of the person who has to get vaccinated
     */
    private Person person;
    private LocalDateTime dateReservation;
    private Pathology patologia;
    private Medicine farmacoUsato;
    private int dose;

    public Vaccination(Person persona, LocalDateTime dateReservation, Pathology pathology, Medicine medicineUsed, int dose) {
        this.person = person;
        this.dateReservation = dateReservation;
        this.patologia = pathology;
        this.farmacoUsato = medicineUsed;
        this.dose = dose;
    }

    /**
     *
     * print all the information relating to vaccinations on the screen
     */
    public void printInfo(){
        System.out.print(this.person.getId() + this.dateReservation + this.patologia.getName()+ this.farmacoUsato +this.dose);

    }

    public Person getPerson() {
        return person;
    }

    public LocalDateTime getDateReservation() {
        return dateReservation;
    }

    public Pathology getPathology() {
        return patologia;
    }

    public Medicine getMedicineUsed() {
        return farmacoUsato;
    }

    public int getDose() {
        return dose;
    }
}
