import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame {
    private Button btnExit = new Button("Exit");
    private Button btnAdd = new Button("+");
    private Button btnSub = new Button("-");
    private Label lab = new Label("0");
    private int x = 150, y = 20;

    public MainFrame() {
        init();
    }

    private void init() {
        this.setLocation(100, 200);
        this.setSize(1000, 1000);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setLayout(null);
        btnExit.setBounds(50,50,100,100);
        btnAdd.setBounds(50,100,100,100);
        btnSub.setBounds(50,210,100,100);
        lab.setBounds(50,50,100,100);
        add(btnExit);
        add(btnAdd);
        add(btnSub);
        add(lab);
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.this.setTitle(Integer.toString(x));
                System.exit(0);
            }
        });
        this.setLayout(null);
        btnAdd.setLocation(100, 300);
        btnSub.setSize(120, 35);
        add(btnAdd);
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x= x+5;
                lab.setLocation(x,y);
            }
        });
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x= x-5;
                lab.setLocation(x,y);
            }
        });

    }
}




