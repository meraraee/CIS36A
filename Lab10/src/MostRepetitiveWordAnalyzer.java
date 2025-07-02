//STRETCH GOAL PT. 2
public class MostRepetitiveWordAnalyzer extends TextAnalyzer{

    //constructors
    public MostRepetitiveWordAnalyzer(){
        this.reportPrefix = "Most repetitive word length: ";
    }
    public MostRepetitiveWordAnalyzer(String t){
        super(t);
        this.reportPrefix = "Most repetitive word length: ";
    }

    //instance method
    @Override
    public void analyze() {

        String[] words = getText().trim().split("\\s+");
//STRETCH GOAL PT. 2
        public class MostRepetitiveWordAnalyzer extends TextAnalyzer{

            //constructors
            public MostRepetitiveWordAnalyzer(){
                this.reportPrefix = "Most repetitive word length: ";
            }
            public MostRepetitiveWordAnalyzer(String t){
                super(t);
                this.reportPrefix = "Most repetitive word length: ";
            }

            //instance method
            @Override
            public void analyze() {

                String[] words = getText().trim().split("\\s+");

                int maxRepetition = 0;
                int theWordLengthWithMaxRepetition = 0;

                for(String word: words) {

                    //creating an array with 256 slots to count how many times each character appears in the word
                    // 256 is used because it covers all standard ASCII characters
                    int counts[] = new int[256];

                    for (int i = 0; i < word.length(); i++) {
                        counts[word.charAt(i)]++;
                    }

                    //find the most repeated character count in a SPECIFIC word
                    int mostRepeatedCharacter = 0;

                    for (int count : counts) {

                        if (count > mostRepeatedCharacter) {
                            mostRepeatedCharacter = count;
                        }
                    }

                    //if this SPECIFIC word has the most repeated character, then update result
                    if (mostRepeatedCharacter > maxRepetition) {
                        results = (double)theWordLengthWithMaxRepetition;
                    }
                }
            }
        }

        int maxRepetition = 0;
        int theWordLengthWithMaxRepetition = 0;

        for(String word: words) {

            //creating an array with 256 slots to count how many times each character appears in the word
            // 256 is used because it covers all standard ASCII characters
            int counts[] = new int[256];

            for (int i = 0; i < word.length(); i++) {
                counts[word.charAt(i)]++;
            }

            //find the most repeated character count in a SPECIFIC word
            int mostRepeatedCharacter = 0;

            for (int count : counts) {

                if (count > mostRepeatedCharacter) {
                    mostRepeatedCharacter = count;
                }
            }

            //if this SPECIFIC word has the most repeated character, then update result
            if (mostRepeatedCharacter > maxRepetition) {
                results = (double)theWordLengthWithMaxRepetition;
            }
        }
    }
}
