public class Medicine {

    /**
     * ABSTRACT STATE: it represent the medicine used as vaccines for a pathology
     * CONCRETE STATE: represented by a String for the name,rule, and yhe type of medicine
     * - nome not null immutable
     * - rules of administration can change
     */
    private String name;
    private Rule administrationRule;
    private TypeOfMedicine typeOfMedicine;


    public Medicine(String name, Rule administrationRule, TypeOfMedicine typeOfMedicine) {
        this.name = name;
        this.administrationRule = administrationRule;
        this.typeOfMedicine = typeOfMedicine;
    }

    public String getName() {
        return name;
    }

    public Rule getAdministrationRules() {
        return this.administrationRule;
    }

    public TypeOfMedicine getTypeOfMedicine() {
        return typeOfMedicine;
    }
}

