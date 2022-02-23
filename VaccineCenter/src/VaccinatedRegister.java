import java.util.Iterator;
import java.util.List;

public class VaccinatedRegister {

    /**
     * register that contains the data of the vaccinated persons and the data of the relative vaccinations
     * carried out (pathology, dates, drug, dosage)
     * Mutable
     */
    private List<Vaccination> vaccinatedRegister;


    /**
     * copy the register and print the info of the vaccinations
     */
    public void infoVaccination() {
        List<Vaccination> copia = this.vaccinatedRegister;
        Iterator<Vaccination> it = this.vaccinatedRegister.iterator();

        while(it.hasNext()){
            Vaccination vaccination = it.next();
            vaccination.printInfo();
        }

    }

    /**
     * add vaccination in the register
     * @param vaccination
     */
    public void addVaccination(Vaccination vaccination){
        this.vaccinatedRegister.add(vaccination);
    }

}
