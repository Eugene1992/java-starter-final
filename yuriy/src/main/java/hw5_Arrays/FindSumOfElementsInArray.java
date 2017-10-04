package hw5_Arrays;

public class FindSumOfElementsInArray {
        int[] intArray = {2, 3, 5, 6, 7, 345, 436, 346, 0, 78, 90, -5, 6, 888, -34, 345, 345};

    // Найти сумму всех элементов в массиве.
    public int calcSummOfAllElements() {
        int valuOfArray = 0;
        for (int i = 0; i <= intArray.length - 1; i++) {
            valuOfArray += intArray[i];
        }
        return valuOfArray;
    }
}

