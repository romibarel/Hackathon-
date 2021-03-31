package com.example.hestory.ui.register;

public class RegisterViewModel {
    public boolean register(String username, String password, String firstname,String lastname, String phone ) {
        //server
        if(username==null|| firstname==null|| lastname==null||password==null|| phone==null)
            return false;
        if(username.equals("")|| firstname.equals("")|| lastname.equals("")||password.equals("")|| phone.equals(""))
            return false;
        if(false)
            return false;
        return true;
    }
}
