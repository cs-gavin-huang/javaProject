/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 08:09:24
 * @LastEditors: you-know-who-2017
 * @LastEditTime: 2019-12-21 08:09:24
 */
import java.awt.*;
import javax.swing.*;
public class WindowWord extends JFrame {
   JTextField inputText,showText;
   WordPolice police;           //监视器
   WindowWord() {
      setLayout(new FlowLayout());
      inputText=new JTextField(6);
      showText=new JTextField(6);
      add(inputText); 
      add(showText);
      police=new WordPolice();
      police.setJTextField(showText);
      inputText.addActionListener(police);
      setBounds(100,100,400,280);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
