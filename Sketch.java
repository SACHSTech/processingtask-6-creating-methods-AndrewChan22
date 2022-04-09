import processing.core.PApplet;

/**
 * Description: Draw objects using parameters from methods
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
   * @param startingX: starting X coordinate of grass block
   * @param grassWidth: width of each grass block
   * @author: A. Chan
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
   * Draws house using coordinate and colour parameters
   * 
   * @param HouseX: X coordinate of composite house
   * @param HouseY: Y coordinate of house
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
  public void drawHouse(float HouseX, float HouseY, float houseR, float houseG, float houseB, float triangleR, float triangleG, float triangleB, float windowR, float windowG, float windowB) {

    // reference point: 165, 325

    // draw house
    fill(houseR, houseG, houseB);
    rect(HouseX + 60, HouseY, 350, 325);

    // draw roof
    fill(triangleR, triangleG, triangleB);
    triangle(HouseX + 235, HouseY - 150, HouseX, HouseY, HouseX + 470, HouseY);

    // draw left window
    fill(windowR, windowG, windowB);
    ellipse(HouseX + 148, HouseY + 95, 50, 75);
    line(HouseX + 123, HouseY + 95, HouseX + 173, HouseY + 95);
    line(HouseX + 148, HouseY + 58, HouseX + 148, HouseY + 132);

    // draw right window
    ellipse(HouseX + 323, HouseY + 95, 50, 75);
    line(HouseX + 299, HouseY + 95, HouseX + 348, HouseY + 95);
    line(HouseX + 323, HouseY + 58, HouseX + 323, HouseY + 131);

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
   * @param sunX: X coordinate of the sun
   * @param sunY: Y coordinate of the sun
   * @author: A. Chan
   */
  public void drawSun(float sunX, float sunY) {

    sunX = sunMiddleX(sunX);
    sunY = sunMiddleY(sunY);

    fill(255, 255, 35);
    ellipse(sunX, sunY, 75, 75);

    line(sunX + 38, sunY, sunX + 85, sunY);
    line(sunX, sunY + 38, sunX, sunY + 85);
    line(sunX - 37.5f, sunY, sunX - 84.5f, sunY);

    line(sunX + 27, sunY + 27, sunX + 60, sunY + 60);
    line(sunX - 27, sunY + 25, sunX - 60, sunY + 60);


  }
  
  /**
   * Centres the sun at the middle of the screen
   * 
   * @param middleX: Uses x coordinate of sun from the drawSun method
   * @return: Returns the x coordinate at the middle of the screen
   * @author: A. Chan
   */
  public float sunMiddleX(float middleX) {
    return width/2;
  }

  /**
   * Draws sun's Y coordinate at the top of the screen
   * 
   * @param middleY: Uses y coordinte of sun from the drawSun method
   * @return: Returns the y coordinate at 1/10 of the screen
   */
  public float sunMiddleY(float middleY) {
    return height/15;
  }
  

}
