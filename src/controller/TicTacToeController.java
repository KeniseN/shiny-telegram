package controller;

import model.IModel;
import view.IView;

public class TicTacToeController implements IController {

  protected IView view;
  protected IModel model;

  public TicTacToeController(IModel model, IView view) {
    this.model = model;
    this.view = view;
  }

  @Override
  public void executeCommand(String command) {
    if (command == null || command.trim().isEmpty()) {
      view.showError("Empty command");
      return;
    }
  }

  @Override
  public void run() {

  }
}
