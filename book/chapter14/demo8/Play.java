/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 08:24:28
 * @LastEditors: you-know-who-2017
 * @LastEditTime: 2019-12-21 08:24:28
 */
import java.awt.*;
import javax.swing.*;
public class PlayMusicWindow extends JFrame {
   MusicButton [] buttonSyllable; //代表7个音节的按钮数组 
   PlayMusicWindow() {
      buttonSyllable = new MusicButton[8];
      setLayout(new GridLayout(1,7));
      for(int i=1;i<=7;i++){
        buttonSyllable[i] = new MusicButton();
        buttonSyllable[i].setClipFile(i+".wav");
        add(buttonSyllable[i]);
      } 
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setSize(350,120);
   }
   public static void main(String args[]) {
      new PlayMusicWindow().setVisible(true);
   }
}
