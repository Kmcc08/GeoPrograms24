public class B0_BasicLoop extends World {

    public void go() {
        plane.isTrail = true;
        plane.trailWidth = 8;
        plane.pausetime = 0;
        for (int y = 0; y < 800; y = y + 1) {
            for (int x = 1; x < 700; x = x + 1) {
                System.out.println("x: " + x);
                plane.pausetime = 0;
                plane.trailWidth = 2;
                plane.teleport(x , y);
                plane.setColor(10, x/5, y/5);
                plane.square(1);
           // RowOfSquares(x*4);
          //  RowOfSquares(x*4);


        }
        //  for (int y = 0; y < 5; y = y + 1) {
        //  for (int x = 0; x < 5; x = x + 1) {
        // System.out.println("x: " + x);
        //    plane.trailWidth = 5;
        //  plane.teleport(x * 150, y * 200);
        //   plane.setColor(10, x * 60, x * 60);
        //  plane.square(100);

        //    }
        //   }
        // RowOfSquares();
    }


   // public void RowOfSquares(int y) {
    //    for (int x = 1; x < 700; x = x + 1) {
     //       System.out.println("x: " + x);
       //     plane.pausetime = 0;
         //   plane.trailWidth = 2;
           // plane.teleport(x , y);
           // plane.setColor(10, x/5, y/5);
            //plane.square(1);

        }
    }


