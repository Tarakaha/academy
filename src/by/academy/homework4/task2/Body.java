package by.academy.homework4.task2;

public class Body {
    private Heart heart;
    private Lungs lungs;

    public Body() {
        heart = new Heart();
        lungs = new Lungs();
    }


    private class Heart {

        public void live() {
            for (int i = 0; i < Integer.MAX_VALUE - 1; i++) {
                if (i % 100 == 0) {
                    System.out.println("Knock-knock-knocking' on heaven's door");
                }
            }
        }
    }

    private class Lungs {

        public void live() {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                if (i % 50 == 0) {
                    System.out.println("breathe in");
                }
                if (i % 100 == 0) {
                    System.out.println("breathe out");
                }
            }
        }
    }

    public void live() {
        heart.live();
        lungs.live();
        System.out.println("You stand on the shore and feel the salty smell of the wind that blows from the sea." +
                "\nAnd I believe that you are free, and life has only begun.");
    }

}

