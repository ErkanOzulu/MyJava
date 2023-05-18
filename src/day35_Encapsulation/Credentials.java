package day35_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Credentials {
    private String username;
    private String password;

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (isStrongPassWord(password)==false){
            return;
        }
        this.password = password;
    }
    public boolean isStrongPassWord(String password){
        boolean strong=false;
        int count1=0;
        int count2=0;
        int count3=0;
        if (password.length()>=8&&!password.contains(" ")){
            for (char c : password.toCharArray()) {
                if(!Character.isLetterOrDigit(c)){
                    count1++;}else if (Character.isLetter(c)){
                    count2++;

            }else if (Character.isDigit(c)){
                    count3++;
                }


            }
            if (count1>0&&count2>0&count3>0){
                strong=true;
            }else strong=false;
        }else{
            strong=false;
        }
          return strong;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
