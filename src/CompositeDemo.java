class CompositeDemo {
    public static void main(String[] args) {
        //Initialize leafs
        Leaf teakwondo = new Leaf("Teakwondo", 19, 2);
        Leaf waterpolo = new Leaf("Waterpolo", 14, 1);
        Leaf artisticGymnastics = new Leaf("Artistic Gymnastics", 9, 0);
        Leaf shooting = new Leaf("Shooting", 15, 3);
        Leaf cycling = new Leaf("Cycling", 13, 0);
        Leaf tennis = new Leaf("Tennis", 21, 2);
        Leaf tableTennis = new Leaf("Table Tennis", 18, 1);
        Leaf footbal = new Leaf("Footbal", 11, 1);


        // Creates composites
        CompositeGraphic olympicsTeam = new CompositeGraphic("Olympics Team");
        CompositeGraphic asiaTeam = new CompositeGraphic("Asia Team");
        CompositeGraphic chinaTeam = new CompositeGraphic("China Team");
        CompositeGraphic chinaWomensTeam = new CompositeGraphic("Women's Team");
        CompositeGraphic chinaMensTeam = new CompositeGraphic("Men's Team");
        CompositeGraphic afghanistanTeam = new CompositeGraphic("Afghanistan Team");
        CompositeGraphic africaTeam = new CompositeGraphic("Africa Team");
        CompositeGraphic europeTeam = new CompositeGraphic("Europe Team");
        CompositeGraphic germanyTeam = new CompositeGraphic("Germany Team");
        CompositeGraphic germanyWomensTeam = new CompositeGraphic("Women's Team");
        CompositeGraphic germanyMensTeam = new CompositeGraphic("Men's Team");

        // Assign objects
        chinaWomensTeam.add(teakwondo);
        chinaWomensTeam.add(waterpolo);
        chinaWomensTeam.add(artisticGymnastics);
        chinaTeam.add(chinaWomensTeam);
        chinaMensTeam.add(shooting);
        chinaTeam.add(chinaMensTeam);
        asiaTeam.add(chinaTeam);
        asiaTeam.add(afghanistanTeam);
        olympicsTeam.add(asiaTeam);

        olympicsTeam.add(africaTeam);

        germanyWomensTeam.add(cycling);
        germanyWomensTeam.add(tennis);
        germanyMensTeam.add(tableTennis);
        germanyMensTeam.add(footbal);
        germanyTeam.add(germanyWomensTeam);
        germanyTeam.add(germanyMensTeam);
        europeTeam.add(germanyTeam);
        olympicsTeam.add(germanyTeam);


        // Print tasks
        System.out.println("Task A:");
        germanyTeam.printAthletes();
        System.out.println("\nTask B:");
        germanyTeam.printGoldMedals();
        System.out.println("\nTask C:");
        asiaTeam.printGoldMedals();
        System.out.println("\nTask D:");
        olympicsTeam.printAthletes();
    }
}