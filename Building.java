class Building {
    int floors;
    double area;
    int occupants;

    void areaPerPerson() {
        System.out.println("Area per person: " + (area / occupants));
    }

    public static void main(String[] args) {
        Building house = new Building();
        house.area = 2000;
        house.occupants = 4;
        house.areaPerPerson();

        Building office = new Building();
        office.area = 5000;
        office.occupants = 20;
        office.areaPerPerson();
    }
}