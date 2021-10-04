package eights;


import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import java.util.Scanner;

public class MemoryService {

    public Collection add(Collection<String> collection) throws AddToCollException {
        String str;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите строку/букву на латинице. Чтобы закончить добавление введите exit. Чтобы достать последний введенный, введите get ");
            str = scanner.next();
            if (str.equals("exit")){
                return collection;
            }
            else if (str.equals("get")){
                ((Queue<String>) collection).poll();
            }
            else{
                if(collection.size() == 5){
                    throw new AddToCollException("Память переполнена");
                }
                collection.add(str);
            }
        }
    }

    public Collection getAndRemove(Collection<String> collection) throws PullToCollException {
        Queue<String> queue = (Queue<String>) collection;
        String str;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Хотите достать элемент из очереди - введите \"y\" . Иначе введите \"n\"");
            str = scanner.next();
            if (str.equals("n")){
                return queue;
            }
            else if(str.equals("y")){
                if(queue.size() == 0){
                    throw new PullToCollException("Коллекция пуста");
                }
                System.out.println(queue.poll());
            }
        }
    }

}
