package standard;
public class Entity {
	float xWorld;
	float yWorld;
	float zWorld;
	
	boolean isVisible;
	boolean isAlive;
	
	Entity(float x, float y, float z, boolean isVisible) {
		xWorld = x;
		yWorld = y;
		zWorld = z;
		this.isVisible = isVisible;
		isAlive = true;
	}
	
	void Move(float x, float y, float z) {
		xWorld += x;
		yWorld += y;
		zWorld += z;
	}
	
	void printCoords() {
		System.out.println(xWorld);
		System.out.println(yWorld);
		System.out.println(zWorld);
	}
	
	void kill() {
		isAlive = false;
	}
	
	float[] coords() {
		float[] coords = {xWorld,yWorld,zWorld};
		return coords;
	}
}
