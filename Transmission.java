class Transmission {
    public static void main(String[] args) {
        double fileSize = 419430400; // bytes
        double speed = 960; // chars/sec

        double time = fileSize / speed;
        System.out.println("Time required (seconds): " + time);
    }
}