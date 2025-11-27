package model;

import static model.Player.X;
import static model.Player.O;

public class ModelImp implements IModel{

  private Player turn;
  private final Player[][] board;


  public ModelImp(){
    turn = X;
    board = createBoard();
  }

  @Override
  public boolean xTurn() {
    return turn == X;
  }

  @Override
  public boolean oTurn() {
    return turn == O;
  }

  @Override
  public Player[][] createBoard() {
    return new Player[3][3];
  }

  @Override
  public Player[][] updateBoard(Player player, int row, int col) {
    this.board[row][col] = player;
    return board;
  }

  @Override
  public boolean isGameOver() {
    return false;
  }

  @Override
  public Player getPlayerAt(int row, int col) {
    return board[row][col];
  }

  @Override
  public void updateTurn() {
    if (this.turn == O){
      this.turn = X;
    } else {
      this.turn = O;
    }
  }
}
