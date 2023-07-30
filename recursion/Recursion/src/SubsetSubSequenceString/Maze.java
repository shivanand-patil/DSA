package SubsetSubSequenceString;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(MazePaths(3,3));
        ListMazePaths(" ",3,3);
        System.out.println(ListMazePathsRet("", 3, 3));
    }
    static int MazePaths(int row, int col) {
        if( row == 1 || col ==1) {
            return 1;
        }
        int left = MazePaths(row-1, col);
        int right = MazePaths(row, col-1);
        return left+ right;
    }
    static void ListMazePaths(String p, int row, int col) {


        if( row == 1 && col ==1) {
            System.out.println(p);
            return;
        }

        if(row > 1) {
            ListMazePaths(p + "(" +row+ "," + col + ")", row - 1, col);
        }
        if(col > 1 ) {
            ListMazePaths(p + "(" +row+ "," + col + ")", row, col - 1);
        }
    }

    static ArrayList<String> ListMazePathsRet(String p, int row, int col) {
        ArrayList<String> list = new ArrayList<>();

        if( row == 1 && col ==1) {

            list.add(p);
            return list;
        }
//        ArrayList<String> list = new ArrayList<>();
        if(row > 1) {
            list.addAll(ListMazePathsRet(p + "(" +row+ "," + col + ")", row - 1, col));
        }
        if(col > 1 ) {
            list.addAll(ListMazePathsRet(p + "(" +row+ "," + col + ")", row, col - 1));
        } return list;
    }
}
