public class FactoryMedicine {

    /**
     * creates the medicine given the commercial name and the rule for the administration
     */
    public Medicine createMedicine(TypeOfMedicine typeOfMedicine, String name, Rule rule){
        return new Medicine(name, rule, typeOfMedicine);
    }
}
