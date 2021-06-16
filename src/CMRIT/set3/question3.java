package CMRIT.set3;

public class question3 {
    public static void main(String[] args) {
        String string = "manav singh";
        int count = 0;
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != ' ')
                count++;
        }
        System.out.println("Total number of characters in a string: " + count);
    }
}
