package level_1;
import java.util.*;
public class SixDigitOTP {
    public static void main(String[] args) {
        String[] otps = new String[10];

        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs:");
        for (String otp : otps) {
            System.out.println(otp);
        }

        boolean allUnique = areOTPsUnique(otps);
        System.out.println("\nAre all OTPs unique? " + allUnique);
    }

    public static String generateOTP() {
        int otp = (int)(Math.random() * 900000) + 100000;
        return String.valueOf(otp);
    }

    public static boolean areOTPsUnique(String[] otps) {
        Set<String> otpSet = new HashSet<>();
        for (String otp : otps) {
            otpSet.add(otp);
        }
        return otpSet.size() == otps.length;
    }
}
