package aarays;

public class ArrayNewStuff {
    public static void main(String[] args) {
        String[] daysOfWeek = {"sunday","monday","tuesday","wednesday","thrusday","friday","saturday"};
        String dayWithMostCharacters = "";
        for (String day : daysOfWeek)
        {
            if(day.length()>dayWithMostCharacters.length())
            {
                dayWithMostCharacters=day;
            }
        }
        System.out.println("day with most character is :");
        System.out.println(dayWithMostCharacters);
    }
}
