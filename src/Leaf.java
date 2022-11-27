class Leaf implements Graphic {
    String name;
    int numOfAthletes;
    int numOfGoldMedals;

    public Leaf(String newName, int newNumOfAthletes, int newNumOfGoldMedals) {
        name = newName;
        numOfAthletes = newNumOfAthletes;
        numOfGoldMedals = newNumOfGoldMedals;
    }

    @Override
    public void printAthletes() {
        System.out.println("Team: "+name+", Number of Athletes: "+numOfAthletes);
    }

    @Override
    public void printGoldMedals() {
        System.out.println("Team: "+name+", Number of Gold Medals: "+numOfGoldMedals);
    }
}