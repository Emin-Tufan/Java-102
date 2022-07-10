import javax.xml.stream.FactoryConfigurationError;

public class ControlSystem {
    public void run() {
        boolean isControl = true;
        while (isControl) {
            AdressManager adressManager = new AdressManager();
            Account.showUserInfo();
            if (AuthenticationStatus.login() == AuthenticationStatus.FAİL) {
                isControl = false;
                break;

            }
            adressManager.selectAdress();
            adressManager.insurunceRegist();
        }


    }
}
