import javax.swing.*;
public class GameBoard {
    public static void main(String[] args) {
        int boardwidth=600;
        int boardheight=boardwidth;
        JFrame frame=new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardwidth,boardheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Snake ob=new Snake(boardwidth,boardheight);
        frame.add(ob);
        frame.pack();
        ob.requestFocus();
    }
}