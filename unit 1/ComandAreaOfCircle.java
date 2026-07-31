class ComandAreaOfCircle {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        float pi = 3.14f;
        float aoc;

        aoc = pi * r * r;

        System.out.println("Area of circle is: " + aoc);
    }
}