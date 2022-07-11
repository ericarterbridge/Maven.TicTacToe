package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] board;
    public Board(Character[][] matrix) {
       this.board = matrix;
    }

    public Boolean isInFavorOfX() {
        if (((this.board[0][0] == 'X') && (this.board[0][1] == 'X') && (this.board[0][2] == 'X')) ||
                ((this.board[1][0] == 'X') && (this.board[1][1] == 'X') && (this.board[1][2] == 'X')) ||
                ((this.board[2][0] == 'X') && (this.board[2][1] == 'X') && (this.board[2][2] == 'X')) ||
                ((this.board[0][0] == 'X') && (this.board[1][1] == 'X') && (this.board[2][2] == 'X')) ||
                ((this.board[0][0] == 'X') && (this.board[1][0] == 'X') && (this.board[2][0] == 'X')) ||
                ((this.board[0][1] == 'X') && (this.board[1][1] == 'X') && (this.board[2][1] == 'X')) ||
                ((this.board[0][2] == 'X') && (this.board[1][2] == 'X') && (this.board[2][2] == 'X'))) {
            return true;
        } else {return false;}
    }

    public Boolean isInFavorOfO() {
        if (((this.board[0][0] == 'O') && (this.board[0][1] == 'O') && (this.board[0][2] == 'O')) ||
                ((this.board[1][0] == 'O') && (this.board[1][1] == 'O') && (this.board[1][2] == 'O')) ||
                ((this.board[2][0] == 'O') && (this.board[2][1] == 'O') && (this.board[2][2] == 'O')) ||
                ((this.board[0][0] == 'O') && (this.board[1][1] == 'O') && (this.board[2][2] == 'O')) ||
                ((this.board[0][0] == 'O') && (this.board[1][0] == 'O') && (this.board[2][0] == 'O')) ||
                ((this.board[0][1] == 'O') && (this.board[1][1] == 'O') && (this.board[2][1] == 'O')) ||
                ((this.board[0][2] == 'O') && (this.board[1][2] == 'O') && (this.board[2][2] == 'O'))
        ) {
            return true;
        } else {return false;}
    }

    public Boolean isTie() {
        String tie = getWinner();
        if (tie == ""){
            return true;
        } else {
            return false;
        }
    }

    public String getWinner() {
        if(isInFavorOfX() == true){
            return "X";
        } else if (isInFavorOfO() == true){
            return "O";
        }else return "";
    }

}
