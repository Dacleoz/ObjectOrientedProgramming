import java.util.List;

public class RuleImplementation implements Rule {

    /**
     * represents the rules associated with a medicine and which must be respected for its administration
     */
    private int minimunAge;
    private int distanceMin;
    private int distanceMax;
    private int dose;
    private List<TypeOfMedicine> compatibleMedicine;
    private int coverage;


    public RuleImplementation(RuleImplementatioBuilder ruleImplementatioBuilder) {
        this.distanceMin = ruleImplementatioBuilder.distanceMin;
        this.distanceMax = ruleImplementatioBuilder.distanceMax;
        this.dose = ruleImplementatioBuilder.dose;
        this.compatibleMedicine = ruleImplementatioBuilder.compatibleMedicine;
        this.coverage = ruleImplementatioBuilder.coverage;
    }

    @Override
    public int getMinAge() {
        return this.minimunAge;
    }

    @Override
    public int getMinDistance() {
        return this.distanceMin;
    }

    @Override
    public int getMaxDistance() {
        return this.distanceMax;
    }

    @Override
    public int getDose() {
        return this.dose;
    }

    /**
     * @param medicine
     * @return true if the medicine is in the list of the compatible medicine
     */
    @Override
    public boolean compatibility(TypeOfMedicine medicine) {
        if (compatibleMedicine.contains(medicine)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getCoverage() {
        return coverage;
    }

    /**
     * @require fasciaEtà not null
     * @require tipo di farmaco  not null
     * in base alla tipologia del farmaco e alla fascia di età della persona viene deciso se
     * la persona dovrebbe vaccinarsi subito o può aspettare la distanza max per vaccinaizone succesiva
     */
    public int nextDoseTime(AgeRange ageRange, TypeOfMedicine typeOfMedicine) {
         if (typeOfMedicine.equals(TypeOfMedicine.ADENOVIRUS) && ageRange.equals(AgeRange.GREATER_THAN_18)) {
            return distanceMin;
        }
        if(typeOfMedicine.equals(TypeOfMedicine.ADENOVIRUS)&& ageRange.equals(AgeRange.BETWEEN_6_AND_12)&& ageRange.equals(AgeRange.MINOR_6)){
            return distanceMax;
        }else{
            return distanceMin;
        }
    }


    public static class RuleImplementatioBuilder {
        private int minimunAge;
        private int distanceMin;
        private int distanceMax;
        private int dose;
        private List<TypeOfMedicine> compatibleMedicine;
        private int coverage;

        public RuleImplementatioBuilder setMinimunAge(int minimunAge) {
            this.minimunAge = minimunAge;
            return this;
        }

        /**
         * @param distanceMin
         * @return RuleImplementatioBuilder
         */
        public RuleImplementatioBuilder setDistanceMin(int distanceMin) {
            this.distanceMin = distanceMin;
            return this;
        }

        /**
         * @param distanceMax
         * @return RuleImplementatioBuilder
         */
        public RuleImplementatioBuilder setDistanceMax(int distanceMax) {
            this.distanceMax = distanceMax;
            return this;
        }

        /**
         * @param dose
         * @param age
         * @return RuleImplementatioBuilder
         * @throws WrongDoseException for
         *                            dose <=0
         *                            age<6 && dose>1
         *                            6< age && age <12 && dose >1
         *                            12<age && age<18 && dose >2
         *                            age>18 && dose <2
         */
        public RuleImplementatioBuilder setDose(int dose, int age) throws WrongDoseException {
            if (dose <= 0) {
                throw new WrongDoseException();
            }
            if (age < 6 && dose > 1) {
                throw new WrongDoseException("Check dose and age");
            }
            if (6 < age && age < 12 && dose > 1) {
                throw new WrongDoseException("Check dose and age");
            }
            if (12 < age && age < 18 && dose > 2) {
                throw new WrongDoseException("Check dose and age");
            }
            if (age > 18 && dose < 2) {
                throw new WrongDoseException("Check dose and age");
            }
            return this;
        }

        /**
         * @param compatibleMedicine
         * @return RuleImplementatioBuilder
         */
        public RuleImplementatioBuilder setcompatibleMedicine(List<TypeOfMedicine> compatibleMedicine) {
            this.compatibleMedicine = compatibleMedicine;
            return this;
        }

        /**
         * @param coverage
         * @return RuleImplementatioBuilder
         */
        public RuleImplementatioBuilder setCoverage(int coverage) {
            this.coverage = coverage;
            return this;
        }

        /**
         * build the rule
         * @return RuleImplementation
         */
        public RuleImplementation build() {
            return new RuleImplementation(this);

        }


    }


}
