import java.util.Iterator;
import java.util.List;

/**
 * it contains the APIs
 */
public class VaccinationCenter {

    private VaccinatedRegister vaccinatedRegister;

    public VaccinationCenter(VaccinatedRegister vaccinatedRegister) {
        this.vaccinatedRegister = vaccinatedRegister;
    }


    /**
     * it allows to extract the vaccinated persons and produce the data
     * of the vaccinations carried out
     * (id, pathology, date, medicine, dosage)
     *
     * @return print all the info about the vaccinations contained in the register
     */
    public void listVaccinatedPeople(){

      this.vaccinatedRegister.infoVaccination();
    }

    /**
     * given a person and a pathology, allows to say wto say what the duration of vaccination coverage
     * is and when it would be appropriate for the person to undergo a vaccination.
     * The time between one vacination and the next is at least the minimum time set
     * in the rule based on the age ranges
     *
     * @param person
     * @param pathology
     */
    public void coverage(Person person, Pathology pathology) {
        List<Medicine> medicinesUsed = pathology.usableMedicines();
        Iterator<Medicine> it = medicinesUsed.iterator();
        while (it.hasNext()) {
            Medicine medicine = it.next();
            System.out.println(medicine.getAdministrationRules().nextDoseTime(person.getAgeRange(), medicine.getTypeOfMedicine()) + medicine.getAdministrationRules().getCoverage());
        }
    }


    /**
     *
     * @return RuleImplementatioBuilder
     */
    public RuleImplementation.RuleImplementatioBuilder configureRule(){

        return new RuleImplementation.RuleImplementatioBuilder();

    }


}
