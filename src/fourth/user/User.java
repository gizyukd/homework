package fourth.user;

import java.util.Objects;

public class User implements Comparable {
    private int age;
    private String name;
    private String surname;
    private GENDER gender;

    public User(int age, String name, String surname, boolean genderManTrue) {
        if(genderManTrue){
            this.gender = GENDER.MAN;
        }
        else{
            this.gender = GENDER.WOMAN;
        }
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int compareTo(Object user) {
        if (((User)user).age > age){
            return 1;
        }
        else if (((User)user).age == this.age){
            if (((User) user).name.charAt(0)> this.name.charAt(0)){
                return 1;
            }
            else if (((User)user).name.charAt(0) == this.name.charAt(0)) return 1;
        }
        return -1;
    }

    private enum GENDER{
        MAN("Мужчина"),
        WOMAN("Женжина");

        private String gender;

        GENDER(String gender) {
            this.gender = gender;
        }

    }

    public void getFIO(){
        System.out.println(name + surname);
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return this.gender.gender;
    }

    public void increaseAge(){
        this.age++;
    }

    public void getFullInfoAboutUser(){
        System.out.println("Имя: "+ this.name + ", Фамилия: " + this.surname + ", Возраст: " + this.age + ", Пол: "+ this.gender.gender);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && gender == user.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, surname, gender);
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                '}';
    }
}
