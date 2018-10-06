package api;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class ReturnStr1 {
    public static void main(String[] args){
        String str1="nihao";
        String str2="hello";
        String str3=null;
        System.out.println(str3);
    }
    public String getAnalyseInfo() throws Exception{
        String str1=new String();
        try {
            URL url = new URL("https://pub.icaile.com/gd11x5/");
            URL url1 = new URL("https://pub.icaile.com/gd11x5/");
            InputStream in =url.openStream();
            InputStream in1 =url1.openStream();
            InputStreamReader isr = new InputStreamReader(in);
            InputStreamReader isr1 = new InputStreamReader(in1);
            BufferedReader bufr = new BufferedReader(isr1);
            BufferedReader bufr1 = new BufferedReader(isr);
            int line=0;
            int count=0;
            int page=0;
            int[][] resultNum=new int[84][5];
            int[] continuefail=new int[16];
            int[] continuewin=new int[12];
            int flag1=0;
            for(int i=0;i<12;i++){
                continuefail[i]=0;
            }
            int flag=0;
            String str;
            int qishu=0;
            while((str=bufr1.readLine())!=null){
                line=line+1;
                if(line==476){
                    str=str.trim();
                    if(str.substring(17,19).substring(0,1).equals("0"))
                        qishu=Integer.parseInt(str.substring(17,19).substring(1,2));
                    else
                        qishu=Integer.parseInt(str.substring(17,19));
                }
            }
            //qishu=84;
            if(qishu==1)
            {
                qishu=84;
                page=517+15*qishu-15+26;
            }
            else if(qishu<30){
                page=517+15*qishu-15;
            }else if(qishu<58)
            {
                page=517+15*qishu+13-15;
            }else{
                page=517+15*qishu+26-15;
            }
            //qishu=84;
            line=0;
            int index1=0;
            int num=0;
            while ((str = bufr.readLine()) != null) {
                line=line+1;
                if(line>936&&line<950)
                {
                    count=0;
                    continue;
                }
                if(line>1369&&line<1383)
                {
                    count=0;
                    continue;
                }
                if(line>516&&line<page)
                {
                    count=count+1;
                    if(count>5&&count<11)
                    {
                        str=str.trim();
                        //System.out.println(line+" "+str);
                        resultNum[index1][num]=Integer.parseInt(str.substring(21,23));
                        num=num+1;
                        if(num==5){
                            num=0;
                            index1=index1+1;
                        }
                    }
                    if(count==15)
                        count=0;
                }
            }
            for(int j=0;j<qishu-1;j++){
                str1=str1+"期数："+(j+1)+" 中奖号码"+resultNum[j][0]+","+resultNum[j][1]+","+resultNum[j][2]+","+resultNum[j][3]+","+resultNum[j][4]+"\n";
               // System.out.println("期数："+(j+1)+" 中奖号码"+resultNum[j][0]+","+resultNum[j][1]+","+resultNum[j][2]+","+resultNum[j][3]+","+resultNum[j][4]);
            }
            str1=str1+"正在等待第"+qishu+"期开奖结果"+"\n";
            System.out.println("yyyyyyy");
            //System.out.println("正在等待第"+qishu+"期开奖结果");
            int getCount=0;
            int chonghe=0;
            int times=qishu;
            int loss=0;
            for(int j=1;j<qishu-1;j++){
                chonghe=0;
                for(int i=0;i<5;i++){

                    for(int k=0;k<5;k++){
                        if(resultNum[j][k]==resultNum[j-1][i])
                            chonghe=chonghe+1;
                    }
                }
                if(chonghe==2){
                    getCount=getCount+1;
                    flag1=flag1+1;
                    if(flag!=0)
                        continuefail[flag]=continuefail[flag]+1;
                    flag=0;
                }else{
                    flag=flag+1;
                    loss=loss+1;
                    if(flag1!=0)
                        continuewin[flag1 ]=continuewin[flag1]+1;
                    flag1=0;
                }

            }
            //System.out.println("当前正在"+flag+"连不中");
            str1=str1+"当前正在"+flag+"连不中"+"\n";
            continuefail[flag]=continuefail[flag]+1;
            float a=0;
            if(qishu!=84){
                a=(float)getCount/(float)(qishu-2);
            }else{
                a=(float)getCount/(float)(qishu-1);
            }

            //System.out.println("中奖率:"+a+",中奖次数："+getCount);
            //System.out.println("不中奖次数："+loss);
            //System.out.println("连不中情况如下");
            str1=str1+"中奖率:"+a+",中奖次数："+getCount+"\n"+"不中奖次数："+loss+"\n"+"连不中情况如下"+"\n";
            for(int i=1;i<16;i++){
                //System.out.println(i+"连不中,"+continuefail[i]);
                str1=str1+i+"连不中,"+continuefail[i]+"\n";
            }
            //System.out.println("连中情况如下");
            str1=str1+"连中情况如下"+"\n";
            for(int i=1;i<12;i++){
                //System.out.println(i+"连中,"+continuewin[i]);
                str1=str1+i+"连中,"+continuewin[i]+"\n";
            }
            //System.out.println("当前正在"+flag1+"连中");
            str1=str1+"当前正在"+flag1+"连中"+"\n";


            int[] continuefail1=new int[20];
            int[] continuewin1=new int[12];
            int getCount1=0;
            int chonghe1=0;
            int times1=qishu;
            int loss1=0;
            int flag3=0,flag4=0;
            for(int j=1;j<qishu-1;j++){
                chonghe=0;
                for(int i=0;i<5;i++){

                    for(int k=0;k<5;k++){
                        if(resultNum[j][k]==resultNum[j-1][i])
                            chonghe=chonghe+1;
                    }
                }
                if(chonghe==3){
                    getCount1=getCount1+1;
                    flag3=flag3+1;
                    if(flag4!=0)
                        continuefail1[flag4]=continuefail1[flag4]+1;
                    flag4=0;
                }else{
                    flag4=flag4+1;
                    loss1=loss1+1;
                    if(flag3!=0)
                        continuewin1[flag3]=continuewin1[flag3]+1;
                    flag3=0;
                }

            }
            //System.out.println("当前正在"+flag+"连不中");
            str1=str1+"当前正在"+flag4+"连不中"+"\n";
            continuefail[flag4]=continuefail[flag4]+1;
            float a1=0;
            if(qishu!=84){
                a1=(float)getCount1/(float)(qishu-2);
            }else{
                a1=(float)getCount1/(float)(qishu-1);
            }

            //System.out.println("中奖率:"+a+",中奖次数："+getCount);
            //System.out.println("不中奖次数："+loss);
            //System.out.println("连不中情况如下");
            str1=str1+"三重中奖率:"+a1+",中奖次数："+getCount1+"\n"+"不中奖次数："+loss1+"\n"+"连不中情况如下"+"\n";
            for(int i=1;i<20;i++){
                //System.out.println(i+"连不中,"+continuefail[i]);
                str1=str1+i+"连不中,"+continuefail1[i]+"\n";
            }
            //System.out.println("连中情况如下");
            str1=str1+"连中情况如下"+"\n";
            for(int i=1;i<12;i++){
                //System.out.println(i+"连中,"+continuewin[i]);
                str1=str1+i+"连中,"+continuewin1[i]+"\n";
            }
            //System.out.println("当前正在"+flag1+"连中");
            str1=str1+"当前正在"+flag3+"连中"+"\n";

            bufr.close();
            isr.close();
            in.close();
            return str1;
        } catch (Exception e) {
            e.printStackTrace();
        }




        return str1;
    }
}
