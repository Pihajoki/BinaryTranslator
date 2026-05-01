import java.util.Scanner;
import java.util.ArrayList;

    public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    ArrayList<String> translatedBinary = new ArrayList<String>();
    String toTranslate = " ";
    int translateType = 0;
    
    String[] binaries = {
        "01100001", "01100010", "01100011", "01100100", "01100101", "01100110", "01100111",
        "01001000", "01001001", "01001010", "01001011", "01001100", "01001101", "01001110",
        "01001111", "01010000", "01010001", "01010010", "01010011", "01010100", "01010101",
        "01010110", "01010111", "01011000", "01011001", "01011010", "11000011", "10000101",
        "11000011", "10000100", "11000011", "10010110", "00100000"
    };

    String[] alphabet = {
        "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
        "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
        "å", "ä", "ö", " "
    };

    System.out.println("Do you want to translate: ");
    System.out.println("1) Binary To Text");
    System.out.println("2) Text to BInary");
    System.out.println("Please enter: 1 or 2");
    translateType = Integer.parseInt(in.nextLine());


    if(translateType == 1){
        do{
            System.out.println("Insert binary or if you want to stop insert STOP");
            toTranslate = in.nextLine();
                for(int i = 0; i < binaries.length; i++){
                    if(toTranslate.equalsIgnoreCase(binaries[i])){
                        translatedBinary.add(alphabet[i]);
                    }
                }
            } while (!toTranslate.equalsIgnoreCase("STOP"));

    for(int i = 0; i < translatedBinary.size(); i++){
        System.out.println(translatedBinary.get(i) + " ");
    }
    }


    if(translateType == 2){
        do{
            System.out.println("Insert character or if you want to stop insert STOP");
            toTranslate = in.nextLine();
                for(int i = 0; i < alphabet.length; i++){
                    if(toTranslate.equalsIgnoreCase(alphabet[i])){
                        translatedBinary.add(binaries[i]);
                    }
                }
            } while (!toTranslate.equalsIgnoreCase("STOP"));

    for(int i = 0; i < translatedBinary.size(); i++){
        System.out.println(translatedBinary.get(i) + " ");
    }
    }
}
