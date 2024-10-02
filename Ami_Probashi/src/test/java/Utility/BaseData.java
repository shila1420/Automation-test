package Utility;

import de.taimos.totp.TOTP;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Hex;

public class BaseData {
    public static String BaseUrlMain() {
        String PortalTst = BasePortals.portalsDev();
        String URL = PortalTst;
        return URL;
    }


    public static String BaseEmail() throws Exception {
        String Email = BaseCredentials.BaseEmailList();
        return Email;
    }


    public static String BaseEmailApproval() throws Exception {
        String Email = BaseCredentials.BaseEmailListApproval();
        return Email;
    }

    public static String BaseEmailPdoSupport() throws Exception {
        String Email = BaseCredentials.BaseEmailListPDOSupport();
        return Email;
    }

    public static String PDOPassword() throws Exception {
        String Password = BaseCredentials.PdoPassword();
        return Password;
    }

    public static String BaseEmailPdoPrincipal() throws Exception {
        String Email = BaseCredentials.BaseEmailListPDOPrincipal();
        return Email;
    }
//Brac Protal

    public static String BaseEmailBrac() throws Exception {
        String Email = BaseCredentials.BaseEmailBrac();
        return Email;
    }

    public static String BracPassword() throws Exception {
        String Password = BaseCredentials.BasePasswordBrac();
        return Password;
    }

//TTC Protal

    public static String BaseEmailTTC() throws Exception {
        String Email = BaseCredentials.BaseEmailTTC();
        return Email;
    }

    public static String TTCPassword() throws Exception {
        String Password = BaseCredentials.BasePasswordTTC();
        return Password;
    }



    public static String BaseEmailDG() throws Exception {
        String Email = BaseCredentials.BaseEmailListDG();
        return Email;
    }

    public static String DGPassword() throws Exception {
        String Password = BaseCredentials.DGPassword();
        return Password;
    }

    public static String PrincipalPassword() throws Exception {
        String Password = BaseCredentials.PrincipalPassword();
        return Password;
    }

    public static String ApprovePassword() throws Exception {
        String Password = BaseCredentials.ApprovalPassword();
        return Password;
}

    public static String BasePassword() throws Exception {
        String Password = BaseCredentials.BasePassword();
        return Password;
    }

    public static String BaseOtp() throws Exception {
        String secretKey = BaseCredentials.BaseOTPList();
        String code = getTOTPCode(secretKey);
        return code;
    }

    private static String getTOTPCode(String secretKey) throws InterruptedException {
        Base32 base32 = new Base32();
        byte[] bytes = base32.decode(secretKey);
        String hexKey = Hex.encodeHexString(bytes);
//        System.out.println("2FA Code: " + TOTP.getOTP(hexKey));
        return TOTP.getOTP(hexKey);
    }

//    Apexx Card number
    public static String cardNumber() {
        String number = "5200000000001005";
//        String number = "4456530000001005";
        return number;
    }

    public static String cardMonth() {
        String month = "11";
        return month;
    }

    public static String cardYear() {
        String year = "31";
        return year;
    }

    public static String cardCvv() {
        String cvv = "003";
        return cvv;
    }

//    Stripe Card Number
    public static String stripeCardNumber() {
        String number = "5555555555554444";
        return number;
    }

    public static String stripeCardExpiry() {
        String date = "1130";
        return date;
    }

}
