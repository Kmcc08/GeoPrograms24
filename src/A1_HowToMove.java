public class A1_HowToMove extends World {

    public void go() {
        System.out.println("chicken");
        plane.pausetime = 0;
        plane.trailWidth = 5;
        plane.isTrail = true;
        plane.setPos(100,100);
        plane.startingAngle(90);
        house();
        plane.trailWidth = plane.trailWidth +1;
        plane.teleport(200,100);
        house();
        plane.teleport(300,100);
        house();
        plane.teleport(400,100);
        house();
        plane.teleport(500,100);
        house();
        plane.teleport((int)(Math.random() *1000) +50,100);
        house();











    }
    public void house() {
        plane.setColor((int)(Math.random()*100),(int)(Math.random()*200),(int)(Math.random()*255));
        square();
        plane.turn(90);
        plane.turn(150);
        plane.move(100);
        plane.turn(240);
        plane.move(100);

    }

    public void square(){
        plane.startingAngle(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);

    }
}
