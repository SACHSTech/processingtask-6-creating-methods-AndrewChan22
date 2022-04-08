import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(163, 203, 240);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // draw ground and grass
    drawGround(0, 50);
    
    // draw house
    drawHouse(225, 325, 168, 97, 87, 124, 117, 110, 122, 184, 221);

    // draw sun 
    fill(255, 255, 35);
    ellipse(100, 100, 75, 75);

    line(138, 100, 185, 100);
    line(100, 138, 100, 185);

    line(127, 127, 160, 160);

    // draw door
    drawDoor(350, 500, 110, 150);

	
  }
  
  // define other methods down here.

  /**
   * 
   * Draws ground, grass, and grass blocks
   * @param startingX: starting X coordinate of grass block
   * @param grassWidth: width of each grass block
   * 
   */
  public void drawGround(float startingX, float grassWidth) {

    noStroke();
    // draw dirt
    fill(113, 81, 55);
    rect(0, 650, 800, 200);

    fill(147, 192, 97);
    for (float grassBlockX = startingX; grassBlockX <= 800; grassBlockX+=(width/5)) {

      rect(grassBlockX, 650, grassWidth, 75);

    }
    // draw top layer grass
    fill(147, 192, 97);
    rect(0, 650, 800, 45);
  
    stroke(0, 0, 0);
    strokeWeight(1);
  }

  /**
   * Draws a house
   * 
   * @param fltX: X coordinate of composite house
   * @param fltY: Y coordinate of house
   * @param houseR: 'Red' colour of house (RGB)
   * @param houseG: 'Green' colour of house (RGB)
   * @param houseB: 'Blue' colour of house (RGB)
   * @param triangleR: 'Red' colour of roof (RGB)
   * @param triangleG: 'Green' colour of roof (RGB)
   * @param triangleB: 'Blue' colour of roof (RGB)
   * @param windowR: 'Red' colour of window (RGB)
   * @param windowG: 'Green' colour of window (RGB)
   * @param windowB: 'Blue' colour of window (RGB)
   * 
   */
  public void drawHouse(float fltX, float fltY, float houseR, float houseG, float houseB, float triangleR, float triangleG, float triangleB, float windowR, float windowG, float windowB) {

    // draw house
    fill(houseR, houseG, houseB);
    rect(fltX, fltY, 350, 325);

    // draw roof
    fill(triangleR, triangleG, triangleB);
    triangle(fltX + 175, fltY - 150, fltX - 60, fltY, fltX + 410, fltY);

    // draw left window
    fill(windowR, windowG, windowB);
    ellipse(fltX + 88, fltY + 95, 50, 75);
    line(fltX + 63, fltY + 95, fltX + 113, fltY + 95);
    line(fltX + 88, fltY + 58, fltX + 88, fltY + 132);

    // draw right window
    ellipse(fltX + 263, fltY + 95, 50, 75);
    line(fltX + 239, fltY + 95, fltX + 288, fltY + 95);
    line(fltX + 263, fltY + 58, fltX + 263, fltY + 131);

  }

  /**
   * Draws the door and door knob of the house
   * @param doorX: X coordinate of door
   * @param doorY: Y coordinte of door
   * @param doorWidth: width of door
   * @param doorHeight: height of door
   */
  public void drawDoor(float doorX, float doorY, float doorWidth, float doorHeight) {

    // draw door
    fill(123, 68, 29);
    rect(doorX, doorY, doorWidth, doorHeight);

    // draw door knob
    fill(70, 71, 77);
    ellipse(doorX + 25, doorY + 65, doorWidth * 0.15f, doorHeight * 0.1f);

  }
}
