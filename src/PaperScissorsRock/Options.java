package PaperScissorsRock;

public enum Options {
    Quit("Q"),
    Paper("P"),
    Scissors("S"),
    Rock("R");

    private final String text;

    Options(String text) {
        this.text = text;
    }

    public static Options getOption(String userInput){
        for (Options option: Options.values()){
            if(option.text.equalsIgnoreCase(userInput)){
                return option;
            }
        }
        throw new IllegalArgumentException("No constant with option: " + userInput + " found");
    }
}
