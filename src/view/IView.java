package view;

public interface IView {

  void showError(String error);

  void showMessage(String message);

  String getCommand();
}
