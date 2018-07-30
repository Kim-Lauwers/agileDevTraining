package be.kunlabora.refactoring.extractmethod;

class Player {
    private String name;
    private double score;

    public Player(final String name, final double score) {
        this.name = name;
        this.score = score;
    }

    void printEndScreen() {
        printBanner();

        //print details
        System.out.println("name: " + name);
        System.out.println("score: " + score);
    }

    private void printBanner() {
        System.out.println("** The Refactoring Game **");
        System.out.println("**************************");
    }
}