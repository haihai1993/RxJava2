package com.app.cheesefinder;

/**
 * Created by Mr.Funny on 4/13/17.
 */

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String country;
    private String address;

    public User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }


    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String country;
        private String address;

        public UserBuilder(String firstName,String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public UserBuilder country(String country){
            this.country = country;
            return this;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

}
