public class GradedPicture extends World{
    public int red;
    public int blue;
    public int green;

    public void go() {

        plane.loadBackGround("Street.2.jpg");
        plane.showBackGround();

        for (int y = 0; y < 355; y = y + 1){
            for (int x = 0; x < 610; x = x + 1) {
                plane.teleport(x, y);red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red ==212 && blue==255 && green==244) {
                    plane.setPixelColor(red /50, green/4 , blue);

                }
            }
        }




        plane.isTrail=true;
        plane.pausetime = 1;
        plane.trailWidth = 5;
        for(int x = 85; x<=535; x+=50){
            plane.teleport(x, 233);
            house();
        }
//change





    }


        public void house() {
            plane.setColor((int)(Math.random()*255),(int)(Math.random()*50),(int)(Math.random()*200));
            square();
            plane.turn(90);
            plane.turn(150);
            plane.move(50);
            plane.turn(240);
            plane.move(50);

        }
        public void square(){
            plane.startingAngle(90);
            plane.move(50);
            plane.turn(90);
            plane.move(50);
            plane.turn(90);
            plane.move(50);
            plane.turn(90);
            plane.move(50);

        }
    }


