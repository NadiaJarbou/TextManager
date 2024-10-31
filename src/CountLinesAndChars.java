public class CountLinesAndChars {
    private int lines = 0;
    private String text = "";

    public int getLines() {
        return lines;
    }

    public void setLines() {
        this.lines = this.lines + 1;
    }

    public String getText() {
        return text;
    }

    public void setText(String input) {
        if(this.text != "") {
            this.text = String.join(" ", text, input);// java function to connect words together
        } else this.text = input;
    }

    public int getChars() {
        int numOfCharacters = text.replace(" ", "").length();
        return  numOfCharacters;
    }

    public int getWords() {
        int numOfWords = 0;
        if(!this.text.isEmpty()) {
            String[] words = text.split("\\s+");
            numOfWords = words.length;
        }

        return numOfWords;
    }

    public String getLongestWord() {
        String longestWord = "";
        if(!this.text.isEmpty()) {
            String[] words = text.split("\\s+");

            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }

        return longestWord;
    }

    public boolean isStop(String input) {
        boolean willStop = input.equalsIgnoreCase("stop");
        return willStop;
    }
}
