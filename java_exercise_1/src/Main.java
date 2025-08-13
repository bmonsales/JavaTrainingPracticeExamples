public class Main {

    //    1. Working with arrays
    //    1. Create a Java method that finds two neighboring numbers in an array with the smallest distance to each other. The function should return the index of the first number.
    //    2. In the sequence 4 8 6 1 2 9 4 the minimum distance is 1 (between 1 and 2). The function should return the index 3 (of number 1).
    //    3. In case of two different sets with the smallest and same distance, return the index of the first smallest distance set. In the sequence 1 2 3 5 8 20 the minimum distance is 1 (between 1 and 2 & between 2 and 3). The function should return the index 0 (of number 1).
    //    4. Hint: Use Math.abs() to calculate the distance of two numbers.

    public static void main(String[] args) {
        int[] list = { 4, 8, 6, 1, 2, 9, 4 };
        System.out.println("Index of the shortest distance: " + findShortestDistance(list));
        list = new int[]{ 1, 2, 3, 5, 8, 20 };
        System.out.println("Index of the shortest distance: " + findShortestDistance(list));
    }

    public static int findShortestDistance(int[] list) {
        int distance = 0; int index = 0;
        for (int i = 0; i < list.length - 1; i++) {
            int currentDistance = Math.abs(list[i] - list[i + 1]);
            if(distance == 0 || distance > currentDistance) {
                distance = currentDistance;
                index = i;
                if(distance == 1) break;
            }
        }

        return index;
    }
}
