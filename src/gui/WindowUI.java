package gui;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class WindowUI extends UIManager {

    public static void setWindowsUI() {
        try {
            for (LookAndFeelInfo info : getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            System.out.println("Set windows UI failed");
        }
    }
}
