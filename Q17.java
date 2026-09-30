// Problem: N ke digits ko K places rotate karo. Positive K left aur negative K right rotate karta hai.
class NumberRotator {
    static String rotateNumberByK(int number, int rotations) {
        // Sign ko alag rakhte hain, taaki negative number ke digits bhi rotate ho saken.
        String value = Integer.toString(number);
        String sign = value.startsWith("-") ? "-" : "";
        String digits = sign.isEmpty() ? value : value.substring(1);

        // K ko digit count ke andar normalize karne se bade aur negative K dono handle hote hain.
        int leftShift = Math.floorMod(rotations, digits.length());
        String rotated = digits.substring(leftShift) + digits.substring(0, leftShift);
        return sign + rotated;
    }
}

public class Q17 {
    public static void main(String[] args) {
        // Example: 12345 ke 5 digits par 50 rotations ka net shift zero hota hai.
        int number = 12345;
        int rotations = 50;
        System.out.println(NumberRotator.rotateNumberByK(number, rotations));
    }
}
