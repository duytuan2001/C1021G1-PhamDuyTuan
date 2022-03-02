package ss23_Behavioral_Design_Pattern.practice.Strategy;

import java.util.List;

public class QuickSort implements SortStrategy {

    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Quick sort");
    }
}