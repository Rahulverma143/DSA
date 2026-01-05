package leetcode;

public class Delete_Columns_to_Make_Sorted_944 {

    public static void main(String[] args) {

        String[] strs = {"cba", "daf", "ghi"};

        int rows = strs.length;
        int cols = strs[0].length();
        int deletions = 0;

        for (int c = 0; c < cols; c++) {
            for (int r = 0; r < rows - 1; r++) {
                if (strs[r].charAt(c) > strs[r + 1].charAt(c)) {
                    deletions++;
                    break; 
                }
            }
        }
        System.out.println("Columns to delete: " + deletions);
    }
}
