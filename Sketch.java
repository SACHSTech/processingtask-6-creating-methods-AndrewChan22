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
    drawGround(0, 50, 75);
    
    // draw house
    drawHouse(165, 325, 168, 97, 87, 124, 117, 110, 122, 184, 221);

    // draw sun 
    drawSun(100, 100, 75);

    // draw door
    drawDoor(400, 500, 110, 150, 123, 68, 29);

  }
  
  // define other methods down here.

  /**
   * Draws ground, grass, and grass blocks
   * 
   * @param fltStartingX: Starting X coordinate of grass block
   * @param fltGrassWidth: Width of each grass block
   * @author: A. Chan
   */
  public void drawGround(float fltStartingX, float fltGrassWidth, float fltGrassHeight) {

    noStroke();

    // draw dirt
    fill(113, 81, 55);
    rect(0, 650, 800, 200);

    fill(147, 192, 97);
    for (float grassBlockX = fltStartingX; grassBlockX <= 800; grassBlockX+=(width/5)) {

      rect(grassBlockX, 650, fltGrassWidth, fltGrassHeight);

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
   * @param fltHouseX: X coordinate of composite house
   * @param fltHouseY: Y coordinate of house
   * @param fltHouseR: 'Red' colour of house (RGB)
   * @param fltHouseG: 'Green' colour of house (RGB)
   * @param fltHouseB: 'Blue' colour of house (RGB)
   * @param fltRoofR: 'Red' colour of roof (RGB)
   * @param fltRoofG: 'Green' colour of roof (RGB)
   * @param fltRoofB: 'Blue' colour of roof (RGB)
   * @param fltWindowR: 'Red' colour of window (RGB)
   * @param fltWindowG: 'Green' colour of window (RGB)
   * @param fltWindowB: 'Blue' colour of window (RGB)
   * @author: A. Chan
   */
  public void drawHouse(float fltHouseX, float fltHouseY, float fltHouseR, float fltHouseG, float fltHouseB, float fltRoofR, float fltRoofG, float fltRoofB, float fltWindowR, float fltWindowG, float fltWindowB) {

    // draw house
    fill(fltHouseR, fltHouseG, fltHouseB);
    rect(fltHouseX + 60, fltHouseY, 350, 325);

    // draw roof
    fill(fltRoofR, fltRoofG, fltRoofB);
    triangle(fltHouseX + 235, fltHouseY - 150, fltHouseX, fltHouseY, fltHouseX + 470, fltHouseY);

    // draw left window
    fill(fltWindowR, fltWindowG, fltWindowB);
    ellipse(fltHouseX + 148, fltHouseY + 95, 50, 75);
    line(fltHouseX + 123, fltHouseY + 95, fltHouseX + 173, fltHouseY + 95);
    line(fltHouseX + 148, fltHouseY + 58, fltHouseX + 148, fltHouseY + 132);

    // draw right window
    ellipse(fltHouseX + 323, fltHouseY + 95, 50, 75);
    line(fltHouseX + 299, fltHouseY + 95, fltHouseX + 348, fltHouseY + 95);
    line(fltHouseX + 323, fltHouseY + 58, fltHouseX + 323, fltHouseY + 131);

  }

  /**
   * Draws the door and door knob of the house using coordinates, size, and colour parameters
   * 
   * @param fltDoorX: X coordinate of door
   * @param fltDoorY: Y coordinte of door
   * @param fltDoorWidth: Width of door
   * @param fltDoorHeight: Height of door
   * @author: A. Chan
   */
  public void drawDoor(float fltDoorX, float fltDoorY, float fltDoorWidth, float fltDoorHeight, float fltDoorR, float fltDoorG, float fltDoorB) {

    // draw door from the middle
    fltDoorX = centreDoorX(fltDoorX, fltDoorWidth);

    // draw door
    fill(fltDoorR, fltDoorG, fltDoorB);
    rect(fltDoorX, fltDoorY, fltDoorWidth, fltDoorHeight);

    // draw door knob
    fill(70, 71, 77);
    ellipse(fltDoorX + 25, fltDoorY + 65, fltDoorWidth * 0.15f, fltDoorHeight * 0.1f);

  }

  /**
   * Given parameters of x, y, and size, draw sun
   * 
   * @param fltSunX: X coordinate of the sun
   * @param fltSunY: Y coordinate of the sun
   * @author: A. Chan
   */
  public void drawSun(float fltSunX, float fltSunY, float fltSize) {

    // draw sun
    fill(255, 255, 35);
    ellipse(fltSunX, fltSunY, fltSize, fltSize);

    line(fltSunX + 38, fltSunY, fltSunX + 85, fltSunY);
    line(fltSunX, fltSunY + 38, fltSunX, fltSunY + 85);
    line(fltSunX - 37.5f, fltSunY, fltSunX - 84.5f, fltSunY);

    line(fltSunX + 27, fltSunY + 27, fltSunX + 60, fltSunY + 60);
    line(fltSunX - 27, fltSunY + 25, fltSunX - 60, fltSunY + 60);

  }
  
  /**
   * Draw door from the centre of the rectangle given X coordinate and width of door
   * 
   * @param fltDoorX: X coordinate of the door
   * @param fltWidth: Width of the door
   * @return: Returns the centre X coordinate of the door
   * @author: A. Chan
   */
  public float centreDoorX(float fltDoorX, float fltWidth) {

    return fltDoorX - fltWidth/2;
  }

  

}
