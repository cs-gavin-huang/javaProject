/*
 * @Description: 
 * @Author: you-know-who-2017
 * @Github: https://github.com/you-know-who-2017
 * @Date: 2019-12-21 08:14:23
 * @LastEditors: you-know-who-2017
 * @LastEditTime: 2019-12-21 08:14:23
 */
public class Goods implements java.io.Serializable {
   String name, mount,price;
   public void setName(String name) {
      this.name=name;
   }
   public void setMount(String mount) {
      this.mount=mount;
   }
   public void setPrice(String price) {
      this.price=price;
   }  
   public String getName() {
      return name;
   }
   public String getMount() {
      return mount;
   }
   public String getPrice() {
      return price;
   } 
}

