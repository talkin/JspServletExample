package servlet;

public class AccountBean {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isValid() {
        if (userName.length() >= 5 && userName.length() <= 10) {
            String expectPassword = userName + userName;
            if (password.equals(expectPassword)) {
                return true;
            }
        }
        return false;
    }
}
