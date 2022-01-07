package Exception;

import javax.swing.JOptionPane;

/**
 * Class BirthdateNullException.
 * Exception to indicate that the selected birth date (also in calendar) is null.
 * @author Hansol Antay.
 */
public class BirthdateNullException extends Exception {
  public BirthdateNullException(String message) {
    super(message);
    JOptionPane.showMessageDialog(null, message);
  }
}
