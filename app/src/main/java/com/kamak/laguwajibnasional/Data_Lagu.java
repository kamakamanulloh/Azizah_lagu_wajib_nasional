package com.kamak.laguwajibnasional;

import java.util.ArrayList;

public class Data_Lagu {
    public static String[][] list_lagu = new String[][]{
            {"Indonesia Raya", "Soekarno", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/418px-Presiden_Sukarno.jpg"},
            {"17 Agustus 1946", "Pencipta", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/President_Suharto%2C_1993.jpg/468px-President_Suharto%2C_1993.jpg"},
            {"Indonesia Pusaka", "Pencipta", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Bacharuddin_Jusuf_Habibie_official_portrait.jpg/520px-Bacharuddin_Jusuf_Habibie_official_portrait.jpg"}
    };

    public static ArrayList<Model_Lagu>getListData(){
        Model_Lagu model_lagu=null;
        ArrayList<Model_Lagu>list=new ArrayList<>();
        for (int x=0;x<list_lagu.length;x++){
            model_lagu=new Model_Lagu();
            model_lagu.setJudul(list_lagu[x][0]);
            model_lagu.setPencipta(list_lagu[x][1]);
            model_lagu.setVideo(list_lagu[x][2]);
            list.add(model_lagu);
        }
        return list;
    }

}
