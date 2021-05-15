package aarays;

public class ArrayNewStuff {
    public static void main(String[] args) {
        String[] daysOfWeek = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        String dayWithMostCharacters = "";
        for (String day : daysOfWeek)
        {
            if(day.length()>dayWithMostCharacters.length())
            {
                dayWithMostCharacters=day;
            }
        }
        System.out.print("day with most character is : ");
        System.out.println(dayWithMostCharacters);
    }
}
