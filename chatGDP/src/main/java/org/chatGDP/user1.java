package org.chatGDP;

public class user1 {
    private String name;
    private String id;
    private String lastName;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void getUsersWithMessages(String name){
        // select * from users where name = name and exists (select * from messages where user_id = users.id);
    }
}
