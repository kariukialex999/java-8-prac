package org.kariioke.tostring;


public class ToString {
    private String name;
    private String password;

    ToString(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
