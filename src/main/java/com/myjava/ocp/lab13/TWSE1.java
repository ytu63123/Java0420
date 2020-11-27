package com.myjava.ocp.lab13;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TWSE1 {

    public static void main(String[] args) throws Exception {
        String pathtring = "src\\main\\java\\com\\myjava\\ocp\\lab13\\三重091011拍賣資料Test.csv";
        File file = new File(pathtring);
        String csvstring = new Scanner(file).useDelimiter("\\A").next();
        //System.out.println(csvstring);
        List<Stock1> list = new ArrayList<>();
        
        String[] rows = csvstring.split("\n");
        for (String row : rows) {          
            if (row.trim().split(",").length == 17 && !row.trim().contains("TRANSDATE")) {
//                String data = row.trim().replace("\"", "");
                //System.out.println(data);
                String[] da = row.trim().split(",");
                Stock1 stock1 = new Stock1();
                stock1.TRANSDATE = da[0].trim();
                stock1.SALESNOX = da[1].trim();
                stock1.SALESERIAL = da[2].trim();
                stock1.STONO = da[3].trim();
                stock1.SAPNO = da[4].trim();
                stock1.TYPENO = da[5].trim();
                stock1.PCS = da[6].trim();
                stock1.PRICE = da[7].trim();
                stock1.PCSWT = da[8].trim();
                stock1.MACHINE_NO = da[9].trim();
                stock1.SUPNO = da[10].trim();
                stock1.SUPSUBNO = da[11].trim();
                stock1.ACNTDATE = da[12].trim();
                stock1.FLEVEL = da[13].trim();
                stock1.TOT_WT = da[14].trim();
                stock1.submitDate = da[15].trim();
                stock1.時 = da[16].trim();
                list.add(stock1);

            }
        
        }
         //   System.out.println(list);

     //list.stream().filter(s -> Integer.parseInt(s.時) >= 7).forEach(s->System.out.println(s.SALESNOX));
 
        System.out.println("SALESNOX=008且超過7點的有幾次:" + list.stream().filter(s -> Integer.parseInt(s.時) >= 7)
                .filter(s -> s.SALESNOX.equals("008")).count() + "次");
        System.out.println("SALESNOX=009且超過7點的有幾次:" + list.stream().filter(s -> Integer.parseInt(s.時) >= 7)
                .filter(s -> s.SALESNOX.equals("009")).count() + "次");
        System.out.println("SALESNOX=017且超過7點的有幾次:" + list.stream().filter(s -> Integer.parseInt(s.時) >= 7)
                .filter(s -> s.SALESNOX.equals("017")).count() + "次");
        System.out.println("SALESNOX=018且超過7點的有幾次:" + list.stream().filter(s -> Integer.parseInt(s.時) >= 7)
                .filter(s -> s.SALESNOX.equals("018")).count() + "次");
        System.out.println("SALESNOX=028且超過7點的有幾次:" + list.stream().filter(s -> Integer.parseInt(s.時) >= 7)
                .filter(s -> s.SALESNOX.equals("028")).count() + "次");
        System.out.println("SALESNOX=031且超過7點的有幾次:" + list.stream().filter(s -> Integer.parseInt(s.時) >= 7)
                .filter(s -> s.SALESNOX.equals("031")).count() + "次");
        System.out.println("SALESNOX=033且超過7點的有幾次:" + list.stream().filter(s -> Integer.parseInt(s.時) >= 7)
                .filter(s -> s.SALESNOX.equals("033")).count() + "次");
        System.out.println("SALESNOX=036且超過7點的有幾次:" + list.stream().filter(s -> Integer.parseInt(s.時) >= 7)
                .filter(s -> s.SALESNOX.equals("036")).count() + "次");
        System.out.println("SALESNOX=037且超過7點的有幾次:" + list.stream().filter(s -> Integer.parseInt(s.時) >= 7)
                .filter(s -> s.SALESNOX.equals("037")).count() + "次");
        System.out.println("SALESNOX=041且超過7點的有幾次:" + list.stream().filter(s -> Integer.parseInt(s.時) >= 7)
                .filter(s -> s.SALESNOX.equals("041")).count() + "次");
        System.out.println("SALESNOX=042且超過7點的有幾次:" + list.stream().filter(s -> Integer.parseInt(s.時) >= 7)
                .filter(s -> s.SALESNOX.equals("042")).count() + "次");
        System.out.println("SALESNOX=045且超過7點的有幾次:" + list.stream().filter(s -> Integer.parseInt(s.時) >= 7)
                .filter(s -> s.SALESNOX.equals("045")).count() + "次");
        System.out.println("SALESNOX=048且超過7點的有幾次:" + list.stream().filter(s -> Integer.parseInt(s.時) >= 7)
                .filter(s -> s.SALESNOX.equals("048")).count() + "次");
        System.out.println("SALESNOX=051且超過7點的有幾次:" + list.stream().filter(s -> Integer.parseInt(s.時) >= 7)
                .filter(s -> s.SALESNOX.equals("051")).count() + "次");
        System.out.println("SALESNOX=076且超過7點的有幾次:" + list.stream().filter(s -> Integer.parseInt(s.時) >= 7)
                .filter(s -> s.SALESNOX.equals("076")).count() + "次");
        System.out.println("SALESNOX=079且超過7點的有幾次:" + list.stream().filter(s -> Integer.parseInt(s.時) >= 7)
                .filter(s -> s.SALESNOX.equals("079")).count() + "次");
        System.out.println("SALESNOX=088且超過7點的有幾次:" + list.stream().filter(s -> Integer.parseInt(s.時) >= 7)
                .filter(s -> s.SALESNOX.equals("088")).count() + "次");
        System.out.println("SALESNOX=090且超過7點的有幾次:" + list.stream().filter(s -> Integer.parseInt(s.時) >= 7)
                .filter(s -> s.SALESNOX.equals("090")).count() + "次");
        System.out.println("SALESNOX=302且超過7點的有幾次:" + list.stream().filter(s -> Integer.parseInt(s.時) >= 7)
                .filter(s -> s.SALESNOX.equals("302")).count() + "次");
    }
}
