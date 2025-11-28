package view;

import java.util.Scanner;

public class TicTacToeView implements IView{

  private final Scanner input;

  public TicTacToeView() {
     this.input = new Scanner(System.in);
  }

  @Override
  public void showError(String error) {
    System.err.println(error);
  }

  @Override
  public void showMessage(String message) {
    System.out.println(message);
  }

  @Override
  public String getCommand() {
    System.out.print("Enter command: ");
    return input.nextLine();
  }
}
