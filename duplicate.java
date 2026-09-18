public class duplicate {

    public static void main(String[] args) {

        String name = "ritomkumararit";

        int vowel = 0;
        int cons = 0;
        int count = 0;

        for (int i = 0; i < name.length(); i++) {

            for (int j = i + 1; j < name.length(); j++) {

                if (name.charAt(i) == name.charAt(j)) {
                    System.out.println("found = " + name.charAt(i));
                }
            }
        }

        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } else {
                cons++;
            }
        }
         for (int i = 0; i < name.length(); i++) {

            for (int j = i + 1; j < name.length(); j++) {

                if (name.charAt(i) == name.charAt(j)) {
                     count++;
                     System.out.println("duplicate num = " + count);
                }
            }
        }

        System.out.println("Vowel = " + vowel);
        System.out.println("Consonant = " + cons);

    }
}