import java.util.Iterator;
import java.util.List;

public class Pathology {

    /**
     * ABSTRACT STATE: represents the pathology characteristics
     * related to its prevention: (name of the disease, medicine for the prevention)
     *
     * CONCRETE STATE it is characterized by a name String and a list of medicine that can be used as a vaccine for its prevention and its severity
     * -name not null
     * -list of medicines for the vaccination not null
     */
    private String name;
    private List<Medicine> listMedicineForPrevention;
    private GravityPathology gravityPathology;
    private Rule rule;

    /**
     *
     * @param name
     * @param listMedicineForPrevention
     * @param gravityPathology
     */
    public Pathology(String name, List<Medicine> listMedicineForPrevention, GravityPathology gravityPathology) {
        this.name = name;
        this.listMedicineForPrevention = listMedicineForPrevention;
        this.gravityPathology = gravityPathology;

    }

    /**
     *
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * @return copy of a list of medicines
     */
    public List<Medicine> usableMedicines(){
        List<Medicine> copy = this.listMedicineForPrevention;
        Iterator<Medicine> it = this.listMedicineForPrevention.iterator();

        while(it.hasNext()){
            Medicine medicine = it.next();
            copy.add(medicine);
         }
         return copy;
    }

}
