package fourth.user;

public class User {
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

    private enum GENDER{
        MAN("Мужчина"),
        WOMAN("Женжина");

        private String gender;

        GENDER(String gender) {
            this.gender = gender;
        }
    }

    private class Adress {
        int i;
    }

    public void getFIO(){
        System.out.println(name + surname);
    }

    public void increaseAge(){
        this.age++;
    }

    public void getFullInfoAboutUser(){
        System.out.println("Имя: "+ this.name + ", Фамилия: " + this.surname + ", Возраст: " + this.age + ", Пол: "+ this.gender.gender);
        // правильно ли было иницииорвать объект внутреенего класса enum во внешнем классе, чтобы реализоать связь юзер-пол?
    }





}
