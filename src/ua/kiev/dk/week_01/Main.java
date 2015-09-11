package ua.kiev.dk.week_01;

/**
 * Created by d.koshlyak on 11.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        QuickFindUF x = new QuickFindUF(10);
        x.union(2, 0);
        x.union(5, 1);
        x.union(2, 6);
        x.union(9, 8);
        x.union(9, 1);
        x.union(3, 6);
        x.show();

        QuickUnionWeightedUF y = new QuickUnionWeightedUF(10);
        y.union(9,3);
        y.union(7,4);
        y.union(7,8);
        y.union(1,6);
        y.union(1,9);
        y.union(4,2);
        y.union(5,7);
        y.union(7,6);
        y.union(0,2);
        y.show();
    }
}
