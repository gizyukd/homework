package sevens;

import fourth.user.User;

import java.util.*;

public class UserService {

    public void findUserByName(Collection<User> collection , String name){
        //Iterator<User> iterator = collection.iterator();
        for (User user : collection){
            if (user.getName() == name){
                System.out.println("Найдено совпадение по имени в коллекции" + user);
                return;
            }
        }
        System.out.println("Совпадений не найдено");
    }

    public Collection getColByMale(Collection<User> collection, boolean isMaleGender){
        Collection<User> filteredCol = new LinkedList<>();
        if (isMaleGender){
            for(User user : collection){
                if (user.getGender() == "Мужчина"){
                    filteredCol.add(user);
                }
            }
        }
        else{
            for(User user : collection){
                if (user.getGender() == "Женжина"){
                    filteredCol.add(user);
                }
            }
        }
        return filteredCol;
    }

    public Collection sortCol(Collection<User> collection){
        Collection<User> sortedCol = new TreeSet<>();
        sortedCol.addAll(collection);
        return sortedCol;
    }
}
