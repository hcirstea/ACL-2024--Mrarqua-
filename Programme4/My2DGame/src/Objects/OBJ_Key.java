package Objects;
import java.io.IOException;
import javax.imageio.ImageIO;

import Main.GamePanel;
public class OBJ_Key extends SuperObject {
	GamePanel gp;
	public OBJ_Key(GamePanel gp) {
	name = "Key";
	try { 
	image = ImageIO.read(getClass().getResourceAsStream("/Objects/key.png"));
	uTool.scaleImage(image, gp.titleSize, gp.titleSize);
	} catch (IOException e) {
		e.printStackTrace();
	}

}
}