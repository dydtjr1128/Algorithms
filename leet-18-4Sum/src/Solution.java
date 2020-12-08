import java.util.*;
import java.util.stream.Collectors;

class Solution {
    int[] nums;
    int target;
    Set<List<Integer>> resultSet = new HashSet<>();
    Deque<Integer> list = new LinkedList<>();

    public void recursive(int index, int sum) {
        int len = list.size();
        if (len == 3) {
            for (int i = index + 1; i < nums.length; i++) {
                if (sum + nums[i] == target) {
                    list.addLast(i);
                    List<Integer> sumList = list.stream().map(idx -> nums[idx]).sorted().collect(Collectors.toList());
                    list.removeLast();
                    resultSet.add(sumList);
                }
            }
        } else if (len < 4) {
            for (int i = index + 1; i < nums.length; i++) {
                list.addLast(i);
                recursive(i, sum + nums[i]);
                list.removeLast();
            }
        }
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
        for (int i = 0; i < nums.length; i++) {
            list.addLast(i);
            recursive(i, nums[i]);
            list.removeLast();
        }

        return new ArrayList<>(resultSet);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var v = solution.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        //var v = solution.fourSum(new int[]{-5,5,4,-3,0,0,4,-2}, 4);
        //var v = solution.fourSum(new int[]{-500, -481, -480, -469, -437, -423, -408, -403, -397, -381, -379, -377, -353, -347, -337, -327, -313, -307, -299, -278, -265, -258, -235, -227, -225, -193, -192, -177, -176, -173, -170, -164, -162, -157, -147, -118, -115, -83, -64, -46, -36, -35, -11, 0, 0, 33, 40, 51, 54, 74, 93, 101, 104, 105, 112, 112, 116, 129, 133, 146, 152, 157, 158, 166, 177, 183, 186, 220, 263, 273, 320, 328, 332, 356, 357, 363, 372, 397, 399, 420, 422, 429, 433, 451, 464, 484, 485, 498, 499}, 2139);
        for (var list : v) {
            list.forEach(System.out::print);
            System.out.println();
        }

    }
}