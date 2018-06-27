package OOP.task5.Groups;

public enum Disciplines {
    MATHEMATICS,
    CHEMISTRY,
    PHYSICS,
    LATIN,
    BIOLOGY,
    COMPUTER_SCIENCE,
    ECOMOMICS,
    SOCIOLOGY,
    HISTORY;

    public String getGroup() {
        if (super.equals(Disciplines.MATHEMATICS)
                || super.equals(Disciplines.COMPUTER_SCIENCE)
                || super.equals(Disciplines.PHYSICS))
            return "MathGroup";
        if (super.equals(Disciplines.CHEMISTRY)
                || super.equals(Disciplines.LATIN)
                || super.equals(Disciplines.BIOLOGY))
            return "BiologyGroup";
        if (super.equals(Disciplines.ECOMOMICS)
                || super.equals(Disciplines.SOCIOLOGY)
                || super.equals(Disciplines.HISTORY))
            return "SocioEconomicGroup";
        return null;
    }


}
