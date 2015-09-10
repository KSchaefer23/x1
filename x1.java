//////// Draw Scenery
//////// Kevin Schaefer  (CST 112 EVE 9/9/15)

//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;
float sunX, sunY;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
  sunX= width*3/4;
  sunY= height/8;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 0,200,255 );                // sky
  fill( 255,255,0 );
  
  sunX= (sunX + .75) % (width+100);
  sunY= (sunY + .1) % horizon;
  //ellipse( width*3/4, height/8, 60,60 );    // sun
  ellipse(sunX,sunY, 60,60 );    // sun
  // Grass
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  
  /* INSERT YOUR CODE HERE! */
  triangle( 110,horizon-10, 150,horizon-45, 190,horizon-10  );  // bottom
  triangle( 120,horizon-30, 150,horizon-60, 180,horizon-30  );  // mid
  triangle( 130,horizon-50, 150,horizon-70, 170,horizon-50  );  // top
  fill(204,102,0);
  rect(140, horizon-10, 20,10 );
  
  rect(30,horizon-60, 60,60);                                          // house
  fill(245,245,245);
  rect(40,horizon-50, 15,15);                                          // window
  rect(65,horizon-50, 15,15);                                          // window
  fill(255,0,0);
  rect(50,horizon-30, 20,30);                                          // door
  triangle( 30,horizon-60, 60,horizon-90, 90,horizon-60);              // roof


  fill(0);
  text( "My name is Kevin", 10,height-20 );                                          
                                            
  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;
  
  //// SHOW:  display the creature at (x,y)

  /* INSERT YOUR CODE HERE! */
  fill(0,200,200);
  rect(x-20,y, 70,10);                   // body
  rect( x,y, 30,50 );        
  ellipse(x+15, y-10, 20, 20);
  fill(255);
  ellipse(x+10, y-12, 5, 5);             // eyes
  ellipse(x+20, y-12, 5, 5);
  arc(x+15,y-7, 10,10, 0, PI, CHORD);    // smile
  text( "Blue", x+3,y+20 );

}


//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -6, +6 );                  // random speed.
  dy=  random( -4, +4 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
}
   
   

