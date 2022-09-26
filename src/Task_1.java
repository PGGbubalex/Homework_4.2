public class Task_1 {
    public static void main(String[] args) {

        int capacity = 102; // общая вместимость
        int sits = 60; //  всего сидячих мест
        int others = capacity - sits; // всего стоячих мест

        int seating = 60; // занято сидячих мест
        int stay = 44;// занято стоячих мест


        if (seating<sits){
            System.out.println("Есть сидячих мест " + (sits-seating));
        }
        else{
            System.out.println("Нет свободных сидячих мест");
        }
        if (stay<others){
            System.out.println("Есть еще стоячих мест " + (others - stay));
        }
        else{
            System.out.println("Нет свободных стоячих мест");
        }
        if ((seating+stay)<capacity){
            System.out.println("Всего свободных мест осталось " + (capacity-(seating+stay)));
        }
        else{
            System.out.println("Нет свободных мест");
        }

    }
}
