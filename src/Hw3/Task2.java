package Hw3;

public class Task2 {
    public static void main(String[] args) {
        String palindrome = "Madam, I'm Adam";
        palindrome = palindrome.replaceAll("[^a-zA-Z]", "");
        String palindromeLowerCase = palindrome.toLowerCase();
        StringBuffer buffer = new StringBuffer(palindromeLowerCase);
        buffer.reverse();
        String data = buffer.toString();
        if (palindromeLowerCase.equals(data)) {
            System.out.println("Данная строка является палиндромом");
        } else {
            System.out.println("Данная строка не является палиндромом");
        }
    }
}