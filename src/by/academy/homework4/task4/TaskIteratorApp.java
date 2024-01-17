package by.academy.homework4.task4;

public class TaskIteratorApp {
    public static void main(String[] args) {

        Double[] subfebrileTemp = {37.1, 37.2, 37.3, 37.4, 37.5, 37.6, 37.7, 37.8, 37.9, 38.0};
        TaskIterator<Double> iteratorTemp = new TaskIterator<>(subfebrileTemp);

        while (iteratorTemp.hasNext()) {
            System.out.println(iteratorTemp.next());
        }
    }
}
