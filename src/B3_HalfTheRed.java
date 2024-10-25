public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.loadBackGround("pokemon.png");
        plane.showBackGround();
        

        for (int y = 0; y < 1000; y = y + 1) {
            for (int x = 0; x < 600; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(x, 488 - y);
                if (red ==254 && blue==45 && green==212) {
                    plane.setPixelColor(red /2, green , blue);

                }


                }
            }

        }
    }

