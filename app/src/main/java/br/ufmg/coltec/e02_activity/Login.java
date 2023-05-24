package br.ufmg.coltec.e02_activity;

public class Login {

    private String login;
    private String password;

    public Login(String login, String password){
         this.login = login;
         this.password = password;
    }

    public boolean validade() {
        if (this.login.compareTo("admin") == 0) {
            if(this.password.compareTo("admin123") == 0) {
                return true;
            }
            else{
                return false;
            }
        } else {
            return false;
        }
    }
}
