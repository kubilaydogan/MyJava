package Konular_Level2;

public class Konu_Loop_Labeling {
    public static void main(String[] args) {

        char[][] matrix = {{'A', 'B', 'C', 'D', 'E'},
                           {'F', 'G', 'H', 'I', 'K'},
                           {'L', 'M', 'N', 'O', 'P'},
                           {'Q', 'R', 'S', 'T', 'U'}};

        StringBuilder txt = new StringBuilder();

    /*
        continue         ==> skips the current loop cycle
        continue<label>  ==> skips the labeled loop cycle
        break            ==> terminates the current loop
        break<label>     ==> terminates the labeled loop
     */

        outerLoopLabel:                             // ****
        for (char[] row : matrix) {
            for (char value : row) {
                if (value == 'C') {
                    continue;
                }
                if (value == 'H') {             // H-I-K yazilmayacak
                    continue outerLoopLabel;
                }
                if (value == 'N') {
                    break;
                }
                if (value == 'S') {
                    break outerLoopLabel;
                }
                txt.append(value);
            }
            txt.append('\n');
        }

        System.out.println(txt);

        System.out.println("**************************************************");

        int counter = 0;

        outer:
        for(int i = 0; i < 3; i++){
            middle:
            for(int j = 0; j < 3; j++){
                inner:
                for(int k = 0; k < 3; k++){{
                }
                    if(k - j > 0){
                        break middle;
                    }
                    counter++;
                }
            }
        }
        System.out.println(counter);        // 3
    }
}
