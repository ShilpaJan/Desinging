package com.example.paresh.garagemanagment;

class User {
    private String id;
    private String first_name;
    private String last_name;
    private String avatar;

    public User (String id, String first_name, String last_name, String avatar) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.avatar = avatar;
    }

    public String getId ( ) {
        return id;
    }

    public String getFirst_name ( ) {
        return first_name;
    }

    public String getLast_name ( ) {
        return last_name;
    }

    public String getAvatar ( ) {
        return avatar;
    }
}
