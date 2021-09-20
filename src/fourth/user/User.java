package fourth.user;

public class User {
    private int age;
    private String name;
    private String surname;

    public User(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;

    }

    private enum GENDER{
        MAN("Мужчина"),
        WOMAN("Женжина");

        private String gender;

        GENDER(String gender) {
            this.gender = gender;
            new User(10, "ffff", "ffff");

        }

        public String getGender() {
            return gender;
        }
    }

    public void getFIO(){
        System.out.println(name + surname);
    }

    public void increaseAge(){
        this.age++;
    }

    public void getFullInfoAboutUser(){
        System.out.println("Имя: "+ this.name + ", Фамилия: " + this.surname + ", Возраст: " + this.age + ", Пол: "+ GENDER.MAN.getGender());
        // как объекту класса User узнать, какой объект  из enum GENDER относится к нему
    }





}
