public interface Rule {

    public int getMinAge();

    public int getMinDistance();

    public int getMaxDistance();

    public int getDose();
    
    public boolean compatibility(TypeOfMedicine farmaco);

    public int getCoverage();

    public int nextDoseTime(AgeRange ageRange, TypeOfMedicine typeOfMedicine);
}
