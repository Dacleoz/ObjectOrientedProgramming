import java.util.List;

public class Main {

    public static void main(String arg[]) throws WrongDoseException {

        FactoryMedicine factoryMedicine = new FactoryMedicine();

        VaccinatedRegister vaccinatedRegister = new VaccinatedRegister();

        VaccinationCenter vaccinationCenter = new VaccinationCenter(vaccinatedRegister);

        Person matteo = new Person("masd56yhsds","Matteo",23);
        List<Medicine> lista = null;
        RuleImplementation.RuleImplementatioBuilder builder= vaccinationCenter.configureRule();
        Rule rule = builder.setMinimunAge(6).setDistanceMin(1).setDistanceMax(5).setDose(2, 18).setCoverage(5).build();
        Medicine medicine = factoryMedicine.createMedicine(TypeOfMedicine.ADENOVIRUS,"astrazeneca", rule);
        Pathology covid = new Pathology("Covid",lista, GravityPathology.LOW_GRAVITY);


    }
}
