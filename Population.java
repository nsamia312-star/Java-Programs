class Population {
    public static void main(String[] args) {
        double A = 50;
        double B = 70;
        int years = 0;

        while (A <= B) {
            A = A * 1.03;
            B = B * 1.02;
            years++;
        }

        System.out.println("A will surpass B in " + years + " years.");
    }
}