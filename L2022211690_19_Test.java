import static org.junit.Assert.*;
import org.junit.Test;

// 本次测试采用等价类划分原则，分为全是死细胞，有死细胞有活细胞，全是活细胞
public class L2022211690_19_Test {
    /**
     * 测试目的：验证当初始网格为全死细胞时，下一状态仍然为全死细胞
     * 测试用例：输入为全死细胞的网格 [[0, 0], [0, 0]]
     * 期望输出：下一状态仍然是 [[0, 0], [0, 0]]
     */
    @Test
    public void testAllDeadCells() {
        Solution19 solution = new Solution19();
        int[][] board = {{0, 0}, {0, 0}};
        int[][] expected = {{0, 0}, {0, 0}};
        solution.gameOfLife(board);
        assertArrayEquals(expected, board);
    }

    /**
     * 测试目的：验证当初始网格为全活细胞时，根据规则，只有四角细胞会存活
     * 测试用例：输入为全活细胞的网格 [[1, 1, 1], [1, 1 ,1], [1, 1 ,1]]
     * 期望输出：下一状态为 [[1, 0, 1], [0, 0, 0],[1, 0, 1]]
     */
    @Test
    public void testAllLiveCells() {
        Solution19 solution = new Solution19();
        int[][] board = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int[][] expected = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        solution.gameOfLife(board);
        assertArrayEquals(expected, board);
    }

    /**
     * 测试目的：验证标准网格（例如 3x3 的复杂布局）的下一状态
     * 测试用例：输入为 [[0, 1, 0], [0, 0, 1], [1, 1, 1], [0, 0, 0]]
     * 期望输出：[[0, 0, 0], [1, 0, 1], [0, 1, 1], [0, 1, 0]]
     */
    @Test
    public void testComplexGrid() {
        Solution19 solution = new Solution19();
        int[][] board = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        int[][] expected = {
                {0, 0, 0},
                {1, 0, 1},
                {0, 1, 1},
                {0, 1, 0}
        };
        solution.gameOfLife(board);
        assertArrayEquals(expected, board);
    }

}
