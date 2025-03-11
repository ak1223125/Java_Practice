interface event
{
    public void start();
}
interface sports
{
    public void play();
}
interface Hockey extends event, sports
{
    public void show();
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Hockey obj = new Hockey() {
        // creating instance of C

        // implementing the methods of interfaces
            public void start() {
               System.out.println("Start Event");
            }
            public void play() {
               System.out.println("Play Sports");
            }
            public void show() {
            System.out.println("Show Hockey");
            }
        };

        obj.start();
        obj.play();
        obj.show();
    }
}
