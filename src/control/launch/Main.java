package control.launch;

import control.creation.RunApp;
public class Main {
    public static void main(String[] args) {
        System.out.println("Run App");
       RunApp app = new RunApp();
       Thread thread = new Thread(app);
       thread.start();
    }
}
