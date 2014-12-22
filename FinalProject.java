import java.
public class FinalProject extends JPanel{
 private Image backgroundImage;
  public JPanelWithBackground(String fileName) throws IOException {
    backgroundImage = ImageIO.read(new File(  ));
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
   g.drawImage(backgroundImage, 0, 0, this);
  }



}
