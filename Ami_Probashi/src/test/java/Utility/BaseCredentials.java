package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseCredentials {

    public static String BaseEmailList() throws Exception {

        Properties prop = new Properties();
        FileInputStream file;
        file = new FileInputStream("./src/test/resources/config.properties");
        prop.load(file);
        String Email = prop.getProperty("Email");
        return Email;
    }

    public static String BaseEmailListApproval() throws Exception {

        Properties prop = new Properties();
        FileInputStream file;
        file = new FileInputStream("./src/test/resources/approve.properties");
        prop.load(file);
        String Email = prop.getProperty("Email");
        return Email;
    }

    public static String BaseEmailListPDOSupport() throws Exception {

        Properties prop = new Properties();
        FileInputStream file;
        file = new FileInputStream("./src/test/resources/pdosupport.properties");
        prop.load(file);
        String Email = prop.getProperty("Email");
        return Email;
    }

    public static String BaseEmailListPDOPrincipal() throws Exception {

        Properties prop = new Properties();
        FileInputStream file;
        file = new FileInputStream("./src/test/resources/principalconfig.properties");
        prop.load(file);
        String Email = prop.getProperty("Email");
        return Email;
    }

    public static String BaseEmailListDG() throws Exception {

        Properties prop = new Properties();
        FileInputStream file;
        file = new FileInputStream("./src/test/resources/dgconfig.properties");
        prop.load(file);
        String Email = prop.getProperty("Email");
        return Email;
    }
   //Brac Protal

    public static String BaseEmailBrac () throws Exception {

        Properties prop = new Properties();
        FileInputStream file;
        file = new FileInputStream("./src/test/resources/TestBracLoginConfig.properties");
        prop.load(file);
        String secretKey = prop.getProperty("Email");
        return secretKey;
    }

    public static String BasePasswordBrac () throws Exception {

        Properties prop = new Properties();
        FileInputStream file;
        file = new FileInputStream("./src/test/resources/TestBracLoginConfig.properties");
        prop.load(file);
        String Password = prop.getProperty("Password");
        return Password;
    }

   //TTC Protal


    public static String BaseEmailTTC () throws Exception {

        Properties prop = new Properties();
        FileInputStream file;
        file = new FileInputStream("./src/test/resources/Test_ttc.properties");
        prop.load(file);
        String secretKey = prop.getProperty("Email");
        return secretKey;
    }

    public static String BasePasswordTTC () throws Exception {

        Properties prop = new Properties();
        FileInputStream file;
        file = new FileInputStream("./src/test/resources/Test_ttc.properties");
        prop.load(file);
        String Password = prop.getProperty("Password");
        return Password;
    }





        public static String ApprovalPassword() throws Exception {

            Properties prop = new Properties();
            FileInputStream file;
            file = new FileInputStream("./src/test/resources/approve.properties");
            prop.load(file);
            String Password = prop.getProperty("Password");
            return Password;
        }

        public static String PdoPassword() throws Exception {

            Properties prop = new Properties();
            FileInputStream file;
            file = new FileInputStream("./src/test/resources/pdosupport.properties");
            prop.load(file);
            String Password = prop.getProperty("Password");
            return Password;
        }

        public static String PrincipalPassword() throws Exception {

        Properties prop = new Properties();
        FileInputStream file;
        file = new FileInputStream("./src/test/resources/principalconfig.properties");
        prop.load(file);
        String Password = prop.getProperty("Password");
        return Password;
    }

        public static String DGPassword() throws Exception {

        Properties prop = new Properties();
        FileInputStream file;
        file = new FileInputStream("./src/test/resources/dgconfig.properties");
        prop.load(file);
        String Password = prop.getProperty("Password");
        return Password;
    }

        public static String BaseOTPList () throws Exception {

            Properties prop = new Properties();
            FileInputStream file;
            file = new FileInputStream("./src/test/resources/config.properties");
            prop.load(file);
            String secretKey = prop.getProperty("secretKey");
            return secretKey;
        }

        public static String BasePassword () throws Exception {

            Properties prop = new Properties();
            FileInputStream file;
            file = new FileInputStream("./src/test/resources/config.properties");
            prop.load(file);
            String Password = prop.getProperty("Password");
            return Password;
        }

        public static String testEnv() throws Exception {

            Properties prop = new Properties();
            FileInputStream file;
            file = new FileInputStream("./src/test/resources/config.properties");
            prop.load(file);
            String Environment = prop.getProperty("Environment");
            return Environment;
        }
    }

