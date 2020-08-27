package chapter2;

public class Recursion {

    public void TowersOfHanoi(int n, char fromPeg, char toPeg, char auxPeg) {
        if (n == 1) {
            System.out.println("Move disk 1 from peg" + fromPeg + " to peg" + toPeg);
            return;
        }
        TowersOfHanoi(n - 1, fromPeg, auxPeg, toPeg);
        System.out.println("Move disk n from peg" + fromPeg + "to peg" + toPeg);
        TowersOfHanoi(n - 1, auxPeg, toPeg, fromPeg);
    }

    public int isArrayInSortedOrder(int[] array, int index) {
        if (array.length == 1) {
            return 1;
        }
        return (array[index - 1] < array[index - 2]) ? 0 : isArrayInSortedOrder(array, index - 1);
    }


}
