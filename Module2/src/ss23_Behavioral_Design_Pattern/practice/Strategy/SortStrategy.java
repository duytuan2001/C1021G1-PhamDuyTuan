package ss23_Behavioral_Design_Pattern.practice.Strategy;

import java.util.List;

public interface SortStrategy {
    <T> void sort(List<T> items);
}
