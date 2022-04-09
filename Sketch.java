import processing.core.PApplet;

/**
 * Drawing objects using parameters from methods
 * @author: A. Chan
 */

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
    drawHouse(165, 325, 168, 97, 87, 124, 117, 110, 122, 184, 221);

    // draw sun 
    drawSun(100, 100);

    // draw door
    drawDoor(350, 500, 110, 150, 123, 68, 29);

  }
  
  // define other methods down here.

  /**
   * Draws ground, grass, and grass blocks
   * 
   * @param fltStartingX: starting X coordinate of grass block
   * @param fltGrassWidth: width of each grass block
   * @author: A. Chan
   */
  public void drawGround(float fltStartingX, float fltGrassWidth) {

    noStroke();

    // draw dirt
    fill(113, 81, 55);
    rect(0, 650, 800, 200);

    fill(147, 192, 97);
    for (float grassBlockX = fltStartingX; grassBlockX <= 800; grassBlockX+=(width/5)) {

      rect(grassBlockX, 650, fltGrassWidth, 75);

    }
    // draw top layer grass
    fill(147, 192, 97);
    rect(0, 650, 800, 45);
  
    stroke(0, 0, 0);
    strokeWeight(1);
  }

  /**
   * Draws house using coordinate and colour parameters
   * 
   * @param houseX: X coordinate of composite house
   * @param houseY: Y coordinate of house
   * @param houseR: 'Red' colour of house (RGB)
   * @param houseG: 'Green' colour of house (RGB)
   * @param houseB: 'Blue' colour of house (RGB)
   * @param triangleR: 'Red' colour of roof (RGB)
   * @param triangleG: 'Green' colour of roof (RGB)
   * @param triangleB: 'Blue' colour of roof (RGB)
   * @param windowR: 'Red' colour of window (RGB)
   * @param windowG: 'Green' colour of window (RGB)
   * @param windowB: 'Blue' colour of window (RGB)
   * @author: A. Chan
   */
  public void drawHouse(float houseX, float houseY, float houseR, float houseG, float houseB, float triangleR, float triangleG, float triangleB, float windowR, float windowG, float windowB) {

    // draw house
    fill(houseR, houseG, houseB);
    rect(houseX + 60, houseY, 350, 325);

    // draw roof
    fill(triangleR, triangleG, triangleB);
    triangle(houseX + 235, houseY - 150, houseX, houseY, houseX + 470, houseY);

    // draw left window
    fill(windowR, windowG, windowB);
    ellipse(houseX + 148, houseY + 95, 50, 75);
    line(houseX + 123, houseY + 95, houseX + 173, houseY + 95);
    line(houseX + 148, houseY + 58, houseX + 148, houseY + 132);

    // draw right window
    ellipse(houseX + 323, houseY + 95, 50, 75);
    line(houseX + 299, houseY + 95, houseX + 348, houseY + 95);
    line(houseX + 323, houseY + 58, houseX + 323, houseY + 131);

  }

  /**
   * Draws the door and door knob of the house using coordinates, size, and colour parameters
   * 
   * @param doorX: X coordinate of door
   * @param doorY: Y coordinte of door
   * @param doorWidth: width of door
   * @param doorHeight: height of door
   * @author: A. Chan
   */
  public void drawDoor(float doorX, float doorY, float doorWidth, float doorHeight, float doorR, float doorG, float doorB) {

    // draw door
    fill(doorR, doorG, doorB);
    rect(doorX, doorY, doorWidth, doorHeight);

    // draw door knob
    fill(70, 71, 77);
    ellipse(doorX + 25, doorY + 65, doorWidth * 0.15f, doorHeight * 0.1f);

  }

  /**
   * Draws sun in the top-middle of the screen
   * 
   * @param fltSunX: X coordinate of the sun
   * @param fltSunY: Y coordinate of the sun
   * @author: A. Chan
   */
  public void drawSun(float fltSunX, float fltSunY) {

    fltSunX = sunMiddleX(fltSunX);
    fltSunY = sunMiddleY(fltSunY);

    fill(255, 255, 35);
    ellipse(fltSunX, fltSunY, 75, 75);

    line(fltSunX + 38, fltSunY, fltSunX + 85, fltSunY);
    line(fltSunX, fltSunY + 38, fltSunX, fltSunY + 85);
    line(fltSunX - 37.5f, fltSunY, fltSunX - 84.5f, fltSunY);

    line(fltSunX + 27, fltSunY + 27, fltSunX + 60, fltSunY + 60);
    line(fltSunX - 27, fltSunY + 25, fltSunX - 60, fltSunY + 60);


  }
  
  /**
   * Given x float value, return x coordinate in the middle of the screen
   * 
   * @param middleX: Uses x coordinate of sun from the drawSun method
   * @return: Returns the x coordinate at the middle of the screen
   * @author: A. Chan
   */
  public float sunMiddleX(float middleX) {
    return width/2;
  }

  /**
   * Given y float value, return y coordinate at 1/15 of the screen
   * 
   * @param middleY: Uses y coordinte of sun from the drawSun method
   * @return: Returns the y coordinate at 1/15 of the screen
   * @author: A. Chan
   */
  public float sunMiddleY(float middleY) {
    return height/15;
  }
  

}
