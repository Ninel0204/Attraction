import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {

        Queue<Person> queue = new LinkedList<>();
        List<Person> play = generateClients();

        for (int i = 0; i < play.size(); i++) {
            queue.offer(play.get(i));
        }

        while (!queue.isEmpty()) {
            Person person = queue.poll();
            int start = person.getTickets();
            if (start != 0) {
                person.setTickets(start - 1);
                System.out.println(person.getName() + " " + person.getSurname() + " прокатился на аттракционе. Осталось билетов " + person.getTickets());
                if (person.getTickets() != 0) {
                    queue.offer(person);
                }
            }
        }
    }

    private static List<Person> generateClients() {
        LinkedList<Person> clients = new LinkedList<>();
        clients.add(new Person("Андрей", "Вершаков", 5));
        clients.add(new Person("Любовь", "Величко", 4));
        clients.add(new Person("Иван", "Петров", 6));
        clients.add(new Person("Ирина", "Сташкова", 4));
        clients.add(new Person("Денис", "Карачаев", 8));
        return clients;
    }
}