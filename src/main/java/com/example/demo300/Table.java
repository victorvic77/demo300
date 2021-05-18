package com.example.demo300;

import org.springframework.stereotype.Service;


import java.io.*;

@Service
public class Table {
    public static double [] [] HO;//Массив с  ЧАСОВЫМИ данными (Д,Ч,O,H,L,C)
    public static double [] [] DA;//Массив с ДНЕВНЫМИ данными (Д,O,H,L,C)
    public static int em;//количество клозов=любых данных(дневных)
    public static int ed;//количество клозов=любых данных(дневных)

    //Метод заполняет массив дневных данных
    public void Table01D() throws FileNotFoundException, IOException {
        String a,b;
        int c,d;
        d=0;

        FileReader fr = null;
        BufferedReader br = null;
        StringBuilder text = new StringBuilder();

        try {
            fr = new FileReader ("eurd.txt");
            br = new BufferedReader(fr);

            while ((a = br.readLine()) != null) {
                text.append(a);
            }
        } finally {
            if (fr != null)
                fr.close();
            if (br != null)
                br.close();
        }


        b = text.toString();
        String sub [] = b.split(",");

        c = sub.length;
        ed=((c-1)/8)-1;

        DA = new double [ed][5];

        for (int i=10;i<c;i=i+8) {
            DA[d][0]=Double.parseDouble(sub[i]);
            DA[d][1]=Double.parseDouble(sub[i+2]);
            DA[d][2]=Double.parseDouble(sub[i+3]);
            DA[d][3]=Double.parseDouble(sub[i+4]);
            DA[d][4]=Double.parseDouble(sub[i+5]);
            d++;
        }

    }

    //Метод заполняет массив часовых данных
    public void Table01H() throws FileNotFoundException, IOException {
        String a,b;
        int c,d;
        d=0;

        FileReader fr = null;
        BufferedReader br = null;
        StringBuilder text = new StringBuilder();

        try {
            fr = new FileReader ("eurm.txt");
            br = new BufferedReader(fr);

            while ((a = br.readLine()) != null) {
                text.append(a);
            }
        } finally {
            if (fr != null)
                fr.close();
            if (br != null)
                br.close();
        }

        b= text.toString();
        String sub [] = b.split(",");

        c = sub.length;
        em=((c-1)/8)-1;

        HO = new double [em][6];

        for (int i=10;i<c;i=i+8) {
            HO[d][0]=Double.parseDouble(sub[i]);
            HO[d][1]=Double.parseDouble(sub[i+1]);
            HO[d][2]=Double.parseDouble(sub[i+2]);
            HO[d][3]=Double.parseDouble(sub[i+3]);
            HO[d][4]=Double.parseDouble(sub[i+4]);
            HO[d][5]=Double.parseDouble(sub[i+5]);
            d++;
        }

    }

}
