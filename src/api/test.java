package api;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {
    public static void main(String[] args)throws Exception{
       dataupdate test=new dataupdate();
       String minutes=new String();
       while(true){
           try {
               Thread.sleep(3000);
               SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
               SimpleDateFormat sdf2 = new SimpleDateFormat("mm");
               minutes=sdf2.format(new Date());
               if(minutes.substring(1,2).equals("1")){
                   test.updateData();
                   System.out.println("数据第一遍更新");
                   Thread.sleep(3000);
                   test.updateData();
                   System.out.println("数据第二遍更新");
                   Thread.sleep(3000);
                   test.updateData();
                   System.out.println("数据第三遍更新");
                   Thread.sleep(500000);
               }

           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
