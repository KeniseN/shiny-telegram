package model;

/**
 * This interface holds the logic of TicTacToe.
 */
public interface IModel {

  /**
   * Returns if it is X's turn to play.
   *
   * @return {@code true} if X's turn to play; otherwise
   */
  boolean xTurn();

  /**
   * Returns if it is O's turn to play.
   *
   * @return {@code true} if O's turn to play; otherwise
   */
  boolean oTurn();

  /**
   * Creates a 3 x 3 board for TicTacToe.
   *
   * @return an empty 3 x 3 board
   */
  Player[][] createBoard();

  /**
   * Updates the board.
   *
   * @param player X or O
   * @param row    the row location
   * @param col    the column location
   * @return places the player's icon in the cell (row, col)
   */
  Player[][] updateBoard(Player player, int row, int col);

  /**
   * Determines if game is over.
   *
   * @return {@code true} if yes; otherwise no
   */
  boolean isGameOver();

  /**
   * Gets player icon at (row,col).
   *
   * @param row row location
   * @param col column location
   * @return returns the player at cell
   */
  Player getPlayerAt(int row, int col);

  void updateTurn();
}
