package outrosTopicsBasic;

public class funcoesString {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG   ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();

        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace("a", "x");
        String s07 = original.replace("abc", "xy");

        int i = original.indexOf("bc ");
        int j = original.lastIndexOf("bc");

        System.out.println("-" + "Original: " + original + "-");
        System.out.println("-" + "toLowerCase: " + s01 + "-");
        System.out.println("toUpperCase: " + s02 + "-");
        System.out.println("trim: " + s03 + "-");
        System.out.println("Substring: " + s04 + "-");
        System.out.println("Substring com agurmento: " + s05 + "-");
        System.out.println("Replace: " + s06 + "-");

        System.out.println("Replace: " + s07 + "-");

        System.out.println("  ");

        System.out.println("index of' bc' " + ":" + i + "-");
        System.out.println("last index of' bc' " + ":" + j + "-");


        String s  = "potato apple lemon";
        //espaço branco como separador
        String [] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println(word1+" - "+word2+" - "+word3);

    }

}
