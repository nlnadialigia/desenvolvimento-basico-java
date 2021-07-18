import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        var letters = "A B C D E F G";
        var phrase = "Aula de Java";
        var word = "Aula";
        var phrase2 = "1234 asda qw";

        System.out.println(letters.toCharArray());
        System.out.println(Arrays.toString(phrase.split((" "))));
        System.out.println(word.concat(" de Java"));
        System.out.println(phrase2.replaceAll("[0-9]", "#"));

    }
}
