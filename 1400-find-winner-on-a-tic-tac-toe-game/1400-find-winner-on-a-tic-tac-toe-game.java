class Solution {
    public String tictactoe(int[][] moves) {
        char[][] board = new char[3][3];

        for (int i = 0; i < moves.length; i++) {
            int r = moves[i][0];
            int c = moves[i][1];

            char player = (i % 2 == 0) ? 'A' : 'B';
            board[r][c] = player;

            if ((board[0][0] == player && board[0][1] == player && board[0][2] == player) || 
                (board[1][0] == player && board[1][1] == player && board[1][2] == player) || 
                (board[2][0] == player && board[2][1] == player && board[2][2] == player) || 
                (board[0][0] == player && board[1][0] == player && board[2][0] == player) || 
                (board[0][1] == player && board[1][1] == player && board[2][1] == player) || 
                (board[0][2] == player && board[1][2] == player && board[2][2] == player) || 
                (board[0][0] == player && board[1][1] == player && board[2][2] == player) || 
                (board[0][2] == player && board[1][1] == player && board[2][0] == player))   
            {
                return String.valueOf(player);
            }
        }
        return moves.length == 9 ? "Draw" : "Pending";
    }
}
