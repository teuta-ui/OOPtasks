public class Main {
    public static void main(String[] args) {

        Movanble mov1 = new MovablePoint(8,7,15,15);
        System.out.println(mov1);
        mov1.moveUp();
        System.out.println(mov1);

        Movanble mov2 = new MovableCircle(4, 3, 4, 4, 20);
        System.out.println(mov2);
        mov2.moveDown();
        System.out.println(mov2);
    }



}